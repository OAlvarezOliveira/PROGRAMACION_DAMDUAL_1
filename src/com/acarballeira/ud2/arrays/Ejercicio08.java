/**
 * 
 */
package com.acarballeira.ud2.arrays;

import java.util.Random;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

/**
 * Programa que cree un array de 10x10 enteros y lo rellene con valores
 * introducidos por teclado, a los que agregará posteriormente, el valor de la
 * suma de todos los elementos
 * 
 */
public class Ejercicio08 {

	public static void main(String[] args) {

		// Declarar Variables
		int[][] matriz;
		int suma;
		Random aleatorio;
		final int LONGITUD_FIL;
		final int LONGITUD_COL;

		// Inicializar Variables
		LONGITUD_COL = 10;
		LONGITUD_FIL = 10;
		suma = 0;
		matriz = new int[LONGITUD_FIL][LONGITUD_COL];

		matriz = new int[LONGITUD_FIL][LONGITUD_COL];
		aleatorio = new Random();

		// Generar matriz
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = aleatorio.nextInt(0, 51);

			}

		}

		// Calcular valores
		for (int[] fila : matriz) {

			for (int elemento : fila) {

				suma += elemento;

				// DEBUG System.out.println(suma);

			}

		} // FIN Calcular valores

		// Calcular valores
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = matriz[i][j] + suma;

			}

		} // FIN Calcular valores

		// Pintar matriz
		for (int[] fila : matriz) {

			for (int elemento : fila) {
				System.out.printf("%02d ", elemento);

			}
			System.out.printf("%n");
		} // FIN Pintar matriz

	}

}
