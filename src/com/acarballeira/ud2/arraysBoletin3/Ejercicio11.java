/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio11.java
 */

package com.acarballeira.ud2.arraysBoletin3;

import java.util.Scanner;

/**
 * Calcule si la matriz M tiene o no puntos de silla. Si lo tiene escribir sus
 * coordenadas y su valor, sino escribir NO TIENE PUNTO DE SILLA. Entrada El
 * programa recibirá en la primera línea la dimensión de la matriz (F filas y C
 * columnas), dimensión máxima 20 elementos, y en las siguientes la matriz
 * completa. F líneas con C números enteros positivos cada una, separados por
 * espacios. . El programa terminara cuando en la entrada encuentre 0 0. Salida
 * La salida será el o los valores de la matriz M que sean punto de silla. En el
 * orden de menor número de fila a mayor y de menor número de columna a mayor,
 * con el siguiente formato
 * 
 * 
 * Ejemplo entrada 2 3 4 1 7 3 2 5 1 1 4 2 6 4 40 16 9 86 65 7 45 67 70 91 34 6
 * 5 99 23 76 83 88 17 73 50 5 52 45 21 55 86 29 70 19 5 48 82 25 30 22 86 88 99
 * 17 81 71 50 5 2 88 49 32 56 61 52 64 74 90 17 0 0
 * 
 * Ejemplo de salida un punto de silla de valor 2 en las coordenadas 2,2 un
 * punto de silla de valor 4 en las coordenadas 1,1 un punto de silla de valor 7
 * en las coordenadas 2,1 NO TIENE PUNTO DE SILLA NO TIENE PUNTO DE SILLA
 */
public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in, "UTF-8");
		boolean procesa = true;
		int filas;
		int columnas;

		while (procesa) {

			filas = entrada.nextInt();
			columnas = entrada.nextInt();

			if (filas == 0 && columnas == 0) {
				procesa = false;
				break;
			} else {
				int[][] matriz = new int[filas][columnas];
				generaMatriz(entrada, matriz, filas, columnas);
				buscaPuntosDeSilla(matriz, filas, columnas);
			}

		}

	}

	private static void buscaPuntosDeSilla(int[][] matriz, int filas, int columnas) {

		int[] minimosFila = new int[filas];
		int[] maximosColumna = new int[columnas];
		boolean encontrado = false;

		for (int i = 0; i < filas; i++) {

			int minimoFila = Integer.MAX_VALUE;

			for (int j = 0; j < columnas; j++) {

				if (matriz[i][j] < minimoFila) {
					minimoFila = matriz[i][j];
				}

				minimosFila[i] = minimoFila;

			}
		}

		for (int j = 0; j < columnas; j++) {

			int maxColumna = Integer.MIN_VALUE;

			for (int i = 0; i < filas; i++) {

				if (matriz[i][j] > maxColumna) {
					maxColumna = matriz[i][j];
				}

				maximosColumna[j] = maxColumna;

			}

		}

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (matriz[i][j] == minimosFila[i] && matriz[i][j] == maximosColumna[j]) {
					System.out.printf("un punto de silla de valor %d en las coordenadas %d,%d\n", matriz[i][j], i + 1,
							j + 1);
					encontrado = true;
				}
			}
		}

		if (!encontrado) {
			System.out.println("NO TIENE PUNTO DE SILLA");
		}

	}

	private static void generaMatriz(Scanner entrada, int[][] matriz, int filas, int columnas) {

		for (int i = 0; i < filas; i++) {

			for (int j = 0; j < columnas; j++) {

				matriz[i][j] = entrada.nextInt();
			}

		}

	}

}
