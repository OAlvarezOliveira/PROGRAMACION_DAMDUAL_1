package aceptaelreto;

import java.util.Locale;
import java.util.Scanner;

public class Problema105 {

	public static void main(String[] args) {

		// DECLARACIÓN
		double ventasDia;
		int dia;
		boolean procesa;
		double importeMasVentas;
		String diaMasVentas;
		int contadorMax;
		double importeMenosVentas;
		String diaMenosVentas;
		int contadorMin;
		double ventasDomingo;
		double sumaVentas;
		double media;
		String domingoSuperaMedia;
		Scanner entrada;

		// INICIALIZACIÓN
		entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US);
		procesa = true;

		while (procesa) {

			// Reiniciar variables para cada semana
			dia = 1;
			importeMasVentas = Double.MIN_VALUE;
			importeMenosVentas = Double.MAX_VALUE;
			diaMasVentas = "";
			diaMenosVentas = "";
			contadorMax = 0;
			contadorMin = 0;
			sumaVentas = 0;
			ventasDomingo = 0;

			// Leer 6 días
			while (dia <= 6 && procesa) {

				ventasDia = entrada.nextDouble();

				if (ventasDia == -1) {
					procesa = false;
				} else {

					sumaVentas += ventasDia;

					if (dia == 6) {
						ventasDomingo = ventasDia;
					}

					// Buscar máximo
					if (ventasDia > importeMasVentas) {
						importeMasVentas = ventasDia;
						contadorMax = 1;

						if (dia == 1)
							diaMasVentas = "MARTES";
						else if (dia == 2)
							diaMasVentas = "MIERCOLES";
						else if (dia == 3)
							diaMasVentas = "JUEVES";
						else if (dia == 4)
							diaMasVentas = "VIERNES";
						else if (dia == 5)
							diaMasVentas = "SABADO";
						else if (dia == 6)
							diaMasVentas = "DOMINGO";

					} else if (ventasDia == importeMasVentas) {
						contadorMax++;
					}

					// Buscar mínimo
					if (ventasDia < importeMenosVentas) {
						importeMenosVentas = ventasDia;
						contadorMin = 1;

						if (dia == 1)
							diaMenosVentas = "MARTES";
						else if (dia == 2)
							diaMenosVentas = "MIERCOLES";
						else if (dia == 3)
							diaMenosVentas = "JUEVES";
						else if (dia == 4)
							diaMenosVentas = "VIERNES";
						else if (dia == 5)
							diaMenosVentas = "SABADO";
						else if (dia == 6)
							diaMenosVentas = "DOMINGO";

					} else if (ventasDia == importeMenosVentas) {
						contadorMin++;
					}

					dia++;
				}
			}

			// Mostrar resultados (solo si completó la semana)
			if (dia == 7) {
				media = sumaVentas / 6.0;

				if (contadorMax > 1)
					diaMasVentas = "EMPATE";
				if (contadorMin > 1)
					diaMenosVentas = "EMPATE";

				domingoSuperaMedia = (ventasDomingo > media) ? "SI" : "NO";

				System.out.printf("%s %s %s%n", diaMasVentas, diaMenosVentas, domingoSuperaMedia);
			}
		}

		entrada.close();
	}
}