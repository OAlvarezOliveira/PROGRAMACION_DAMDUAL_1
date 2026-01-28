/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: PuntoDeSillaV3.java
 */

package pruebas;

import java.util.Scanner;

/**
 * 
 */
public class PuntoDeSillaV3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in, "UTF-8");
		int[][] matriz;

		boolean procesa = true;

		while (procesa) {
			System.out.printf("Dame nº Filas: ");
			int filas = entrada.nextInt();
			System.out.printf("Dame nº Columnas: ");
			int columnas = entrada.nextInt();

			if (filas == 0 && columnas == 0) {
				procesa = false;
				break;
			}

			matriz = new int[filas][columnas];
			int[] minimosFila = new int[filas];
			int[] maximosColumna = new int[columnas];
			boolean encontrado = false;

			// llenar matriz

			System.out.printf("Dame Valores: ");
			for (int i = 0; i < filas; i++) {

				for (int j = 0; j < columnas; j++) {

					matriz[i][j] = entrada.nextInt();
				}

			}

			// buscar minimo fila

			for (int i = 0; i < filas; i++) {
				int minEnFila = Integer.MAX_VALUE;

				for (int j = 0; j < columnas; j++) {
					if (matriz[i][j] < minEnFila) {
						minEnFila = matriz[i][j];
					}
				}

				minimosFila[i] = minEnFila;
			}

//			// Debugg minimos
//
//			System.out.println("Mínimos de cada fila:");
//			for (int i = 0; i < minimosFila.length; i++) {
//
//				System.out.printf("Fila %d: %d\n", i, minimosFila[i]);
//			}

			// buscar maximo columna

			for (int j = 0; j < columnas; j++) {

				int maxEnColumna = Integer.MIN_VALUE;

				for (int i = 0; i < filas; i++) {

					if (matriz[i][j] > maxEnColumna) {
						maxEnColumna = matriz[i][j];
					}

				}
				maximosColumna[j] = maxEnColumna;
			}

//			// Debugg maximos
//
//			System.out.println("Maximos de cada Columna:");
//			for (int i = 0; i < maximosColumna.length; i++) {
//
//				System.out.printf("Columna %d: %d\n", i, maximosColumna[i]);
//
//			}

			// puntos de silla

			for (int i = 0; i < filas; i++) {

				for (int j = 0; j < columnas; j++) {

					if (matriz[i][j] == minimosFila[i] && matriz[i][j] == maximosColumna[j]) {

						System.out.printf("un punto de silla de valor %d en las coordenadas %d,%d\n", matriz[i][j],
								i + 1, j + 1); // salida predeterminada por ejercicio
						encontrado = true;

					}

				}

			}

			if (!encontrado) {
				System.out.println("NO TIENE PUNTO DE SILLA");
			}

		} // Fin While
		
		entrada.close();

	}

}
