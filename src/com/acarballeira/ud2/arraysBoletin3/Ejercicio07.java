/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio07.java
 */

package com.acarballeira.ud2.arraysBoletin3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A partir de un vector de enteros introducidos por teclado crear otros dos
 * vectores, uno para los valores pares y otro para los impares del vector
 * original. Ambos vectores deben mostrarse ordenados. Utiliza métodos de
 * java.util.Arrays
 */
public class Ejercicio07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in, "UTF-8");

		int[] numeros = creaVector(entrada);
		int tamanioPares = cuentaPares(numeros);
		int[] vectorPares = creaPares(numeros, tamanioPares);
		int[] vectorImpares = creaImpares(numeros, (numeros.length - tamanioPares));

		Arrays.sort(vectorPares);
		Arrays.sort(vectorImpares);

		System.out.printf("----Vector original----\n");
		imprimeVector(numeros);
		System.out.printf("----Vector Valores Pares----\n");
		imprimeVector(vectorPares);
		System.out.printf("----Vector Valores Impares----\n");
		imprimeVector(vectorImpares);

	}

	private static void imprimeVector(int[] vectorAimprimir) {

		for (int i : vectorAimprimir) {

			System.out.printf("\t%d", i);
		}
		System.out.printf("\n");
	}

	private static int cuentaPares(int[] numeros) {

		int cuentaPares = 0;

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] % 2 == 0) {
				cuentaPares++;
			}

		}

		return cuentaPares;

	}

	private static int[] creaPares(int[] numeros, int tamanioPares) {
		int[] vectorPares = new int[tamanioPares];

		for (int i = 0, j = 0; i < numeros.length; i++) {

			if (numeros[i] % 2 == 0) {

				vectorPares[j] = numeros[i];
				j++;
			}

		}

		return vectorPares;
	}

	private static int[] creaImpares(int[] numeros, int tamanioImpares) {
		int[] vectorImpares = new int[tamanioImpares];

		for (int i = 0, j = 0; i < numeros.length; i++) {

			if (numeros[i] % 2 != 0) {

				vectorImpares[j] = numeros[i];
				j++;
			}

		}

		return vectorImpares;
	}

	private static int[] creaVector(Scanner entrada) {

		int[] numeros;
		int longitud;

		System.out.printf("Introduce la longitud del vector \n");
		longitud = entrada.nextInt();
		numeros = new int[longitud];

		for (int i = 0; i < longitud; i++) {
			System.out.printf("Introduce número %d: \n", i + 1);
			numeros[i] = entrada.nextInt();

		}

		return numeros;

	}

}
