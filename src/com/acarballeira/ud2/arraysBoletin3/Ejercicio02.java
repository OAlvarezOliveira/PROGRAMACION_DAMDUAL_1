package com.acarballeira.ud2.arraysBoletin3;

/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01.java
 */

import java.util.Scanner;

/**
 * Pedir por teclado el tamaño de un vector de enteros. Posteriormente
 * rellenarlo con datos introducidos por teclado y finalmente imprimirlos en
 * orden inverso
 */

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int longitud;

		longitud = creaVector(entrada);

		int[] vEnteros = new int[longitud];

		rellenaVector(entrada, vEnteros);

		imprimeOrdenInverso(vEnteros);

	}

	private static void imprimeOrdenInverso(int[] vEnteros) {

		for (int i = vEnteros.length - 1; i >= 0; i--) {

			System.out.printf("----- Imprimiendo Vector -----\n");
			System.out.printf(" %d \n", vEnteros[i]);

		}

	}

	private static void rellenaVector(Scanner entrada, int[] vEnteros) {

		for (int i = 0; i < vEnteros.length; i++) {

			System.out.printf("Introduce valores para los elementos del vector: ");
			vEnteros[i] = entrada.nextInt();
		}

	}

	private static int creaVector(Scanner entrada) {
		int longitud;
		System.out.printf("Introduce la longitud del vector: ");
		longitud = entrada.nextInt();

		return longitud;

	}

}
