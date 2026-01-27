/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: ArchivoArgs.java
 */

package pruebas;

/**
 * 
 */
import java.io.InputStream;
import java.util.Scanner;

public class ArchivoArgs {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Uso: programa nombreArchivo.txt");
			return;
		}

		String nombreArchivo = args[0];
		leerArchivo(nombreArchivo);
	}

	static void leerArchivo(String nombreArchivo) {
		InputStream ip = ArchivoArgs.class.getResourceAsStream(nombreArchivo);
		Scanner sc = new Scanner(ip);

		int numLinea = 1;

		while (sc.hasNext()) {
			String linea = sc.nextLine();

			System.out.printf("%d:   %s \n", numLinea, linea);
			numLinea++;

		}

		sc.close();
	}
}