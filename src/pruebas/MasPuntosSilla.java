/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: MasPuntosSilla.java
 */

package pruebas;

import java.util.Scanner;

/**
 * 
 */
public class MasPuntosSilla {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int filas;
		int columnas;
		boolean continua;
		int[][] matriz = null;

		continua = true;

		while (continua) {

			System.out.printf("Dame Filas");
			filas = entrada.nextInt();
			System.out.printf("Dame Columnas");
			columnas = entrada.nextInt();

			if (filas == 0 && columnas == 0) {
				continua = false;
				System.out.printf("Fin de programa");
				break;
			}

			matriz = new int[filas][columnas];

			for (int i = 0; i < filas; i++) {

				for (int j = 0; j < columnas; j++) {
					matriz[i][j] = entrada.nextInt();

				}

			}

			imprimereMatriz(matriz);
			int[] minimosFilas = calcularMinimosFilas(matriz);
			int[] maximosColumna = calcularMaximosColumnas(matriz);
			buscarPuntosDeSilla(matriz, minimosFilas, maximosColumna);

		}
		entrada.close();
	}

	private static void buscarPuntosDeSilla(int[][] matriz, int[] minimosFilas, int[] maximosColumna) {
		boolean encontrado = false;

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				if ((matriz[i][j] == minimosFilas[i]) && (matriz[i][j] == maximosColumna[j])) {

					encontrado = true;
					System.out.printf("un punto de silla de valor %d en las coordenadas %d,%d\n", matriz[i][j], i + 1,
							j + 1);
				}
			}

		}

		if (!encontrado) {

			System.out.printf("No hay punto de silla \n");

		}

	}

	private static int[] calcularMaximosColumnas(int[][] matriz) {
		int[] maximosColumna = new int[matriz[0].length];

		for (int col = 0; col < matriz[0].length; col++) {

			int maximo = Integer.MIN_VALUE;

			for (int fila = 0; fila < matriz.length; fila++) {

				if (matriz[fila][col] > maximo) {

					maximo = matriz[fila][col];

				}

			}
			maximosColumna[col] = maximo;
		}

		return maximosColumna;

	}

	private static int[] calcularMinimosFilas(int[][] matriz) {

		int[] minimosFila = new int[matriz.length];

		for (int fila = 0; fila < matriz.length; fila++) {

			int minimo = Integer.MAX_VALUE;

			for (int col = 0; col < matriz[fila].length; col++) {

				if (matriz[fila][col] < minimo) {

					minimo = matriz[fila][col];

				}
			}

			minimosFila[fila] = minimo;
		}
		return minimosFila;

	}

	private static void imprimereMatriz(int[][] matriz) {
		for (int[] fila : matriz) {
			for (int numero : fila) {
				System.out.printf("\t%d", numero);
			}
			System.out.printf("\n");
		}
	}

}
