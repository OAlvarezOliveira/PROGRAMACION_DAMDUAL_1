package pruebas;

import java.io.InputStream;
import java.util.Scanner;

public class CalificacionesArchArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String archivo = args[0];
		double notaAprobar = Double.parseDouble(args[1]);
//		System.out.println(archivo);
//		System.out.println(notaAprobar);

		InputStream ip = CalificacionesArchArgs.class.getResourceAsStream(archivo);
		Scanner entrada = new Scanner(ip);
		String linea;

		procesaArchivo(archivo, notaAprobar);

	}

	private static void procesaArchivo(String archivo, Double notaAprobar) {
		int aprobadosGeneral = 0;
		int asignaturas;
		int estudiantes;
		String mejorEstudiante = "";
		String peorEstudiante = "";
		double peorMedia = Double.MAX_VALUE;
		double mejorMedia = Double.MIN_VALUE;

		InputStream ip = VentasArchArgs.class.getResourceAsStream(archivo);
		Scanner sc = new Scanner(ip);

		String primeraLinea = sc.nextLine();
		String[] dimensiones = primeraLinea.split(" ");

		estudiantes = Integer.parseInt(dimensiones[0]);
		asignaturas = Integer.parseInt(dimensiones[1]);

		String[] alumnos = new String[estudiantes];
		double[][] notas = new double[estudiantes][asignaturas];
		System.out.printf("--- Estudiantes ---\n");
		for (int i = 0; i < alumnos.length; i++) {
			double mediaEstudiante = 0;
			double suma = 0;
			String lineaDatos = sc.nextLine();
			String[] valores = lineaDatos.split(" ");
			alumnos[i] = valores[0]; // Nombre

			for (int j = 0; j < asignaturas; j++) {
				notas[i][j] = Double.parseDouble(valores[j + 1]);

				suma += notas[i][j];

			}

			// hallar media estudiantes por cada asignatura
			mediaEstudiante = (double) (suma / asignaturas);

			// hallar mejor y peor media , y a que estudiante corresponde
			if (mediaEstudiante > mejorMedia) {

				mejorMedia = mediaEstudiante;
				mejorEstudiante = alumnos[i];
			}

			if (mediaEstudiante < peorMedia) {

				peorMedia = mediaEstudiante;
				peorEstudiante = alumnos[i];
			}

			String estado = (mediaEstudiante >= notaAprobar) ? "APROBADO" : "SUSPENSO";
			if (mediaEstudiante >= notaAprobar) {
				aprobadosGeneral++;
			}

			System.out.printf("%s %.2f %.2f %.2f → Media: %.2f [%s]\n", alumnos[i], notas[i][0], notas[i][1],
					notas[i][2], mediaEstudiante, estado);

		}

		System.out.printf("--- Estadísticas por Asignatura ---\n");

		for (int asignatura = 0; asignatura < notas[0].length; asignatura++) {
			int cuentaAprobados = 0;
			int cuentaCalificaciones = 0;
			double mediaAsignatura = 0;
			double suma = 0;

			for (int alumno = 0; alumno < notas.length; alumno++) {
				if (notas[alumno][asignatura] >= notaAprobar) {
					cuentaAprobados++;

				}
				suma += notas[alumno][asignatura];
				cuentaCalificaciones++;
			}

			mediaAsignatura = (double) (suma / cuentaCalificaciones);
			System.out.printf("Asignatura %d : Media = %.2f, Aprobados: %d/%d \n", asignatura + 1, mediaAsignatura,
					cuentaAprobados, estudiantes);

		}
		double porcentaje = (double) aprobadosGeneral / estudiantes * 100;
		System.out.printf("--- Resumen General ---\n");
		System.out.printf("Estudiantes aprobados: %d/%d (%.2f%%)  \n", aprobadosGeneral, estudiantes, porcentaje);
		System.out.printf("Mejor estudiante: %s (%.2f)\n", mejorEstudiante, mejorMedia);
		System.out.printf("Peor estudiante:  %s (%.2f)\n", peorEstudiante, peorMedia);

	}

}
