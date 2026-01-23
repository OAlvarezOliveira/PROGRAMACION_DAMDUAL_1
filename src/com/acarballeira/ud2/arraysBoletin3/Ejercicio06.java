/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejervcicio06.java
 */

package com.acarballeira.ud2.arraysBoletin3;

import java.util.Arrays;

/**
 * 6.Función que recibe un vector de enteros y devuelve otro sin valores
 * repetidos.
 */
public class Ejercicio06 {

	public static void main(String[] args) {
		int[] vector = { 1, 9, 3, 9, 8, 4, 4, 5, 4, 4, 96, 7, 8 };

		System.out.printf("Vector inicial: ");

		for (int i : vector) {

			System.out.printf("\t%d", i);

		}

		int[] resultado = eliminarRepetidos(vector);

		System.out.printf("\nVector sin repetidos: ");

		for (int i : resultado) {

			System.out.printf("\t%d", i);

		}

	}

	private static int[] eliminarRepetidos(int[] vector) {

		int unicos = 1;
		Arrays.sort(vector);

		for (int i = 0; i < vector.length - 1; i++) {

			if (vector[i] != vector[i + 1]) {
				unicos++;

			}
		}

		int[] vUnicos = new int[unicos];
		vUnicos[0] = vector[0];

		for (int i = 0, j = 1; i < vector.length - 1; i++) {

			if (vector[i] != vector[i + 1]) {

				vUnicos[j] = vector[i + 1];
				j++;

			}

		}
		return vUnicos;
	}

}
