/**
 * 
 */
package com.acarballeira.ud2.stringsBoletin2;

import java.util.Arrays;
import java.util.Scanner;

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
 * Ler unha cadea de texto e xerar un array coa función split(). Posteriormente,
 * amosar a seguinte información: Número de palabras, primeira palabra, última
 * palabra, as palabras colocadas en orden inverso, as palabras ordenadas da a á
 * z e as palabras ordenadas da z á a. a. Faino primeiro sen empregar
 * funcións/procedementos/métodos b. Logo faino con
 * funcións/procedementos/métodos c. Faino con modo gráfico (facer co profesor)
 */
public class Ejercicio17 {

	public static void main(String[] args) {

		String texto;
		Scanner teclado;

		int i, j;
		String aux;
		texto = entradaDatos();

		String[] palabras;
		palabras = texto.split(" ");
		if (palabras.length > 0) {
			System.out.println("Número palabras: " + palabras.length);

			System.out.println("Primeira palabra: " + palabras[0]);

			System.out.println("Última palabra: " + palabras[palabras.length - 1]);

			System.out.println("Palabras en orde inverso: ");
			ordenInverso(palabras);

			System.out.println("Palabras ordenadas da A á Z: ");
			ordenaAtoZ(palabras);

			System.out.println("Palabras ordenadas da Z á A: ");
			ordenaZtoA(palabras);

		}

	}// fin do método main

	private static void ordenaZtoA(String[] palabras) {
		int i;
		int j;
		String aux;
		String[] palabras2;
		palabras2 = palabras;
		for (i = 0; i < palabras2.length - 1; i++) {
			for (j = i + 1; j < palabras2.length; j++) {
				if (palabras2[i].compareTo(palabras2[j]) < 0) {
					aux = palabras2[i];
					palabras2[i] = palabras2[j];
					palabras2[j] = aux;
				}
			}
		}

	}

	private static void ordenInverso(String[] palabras) {
		int i;
		for (i = palabras.length - 1; i >= 0; i--) {
			System.out.print(palabras[i] + " ");
		}
	}

	private static void ordenaAtoZ(String[] palabras) {
		int i;
		String[] palabras2;
		palabras2 = palabras;
		Arrays.sort(palabras2);
		for (i = 0; i < palabras2.length; i++) {
			System.out.print(palabras2[i] + " ");
		}
	}

	private static String entradaDatos() {
		String texto;
		Scanner teclado;
		teclado = new Scanner(System.in);

		// Entrada de datos
		System.out.print("Introduza un texto: ");
		texto = teclado.nextLine();
		return texto;
	}

}
