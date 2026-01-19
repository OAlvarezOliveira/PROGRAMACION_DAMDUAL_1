/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio13.java
 */

package com.acarballeira.ud2.stringsBoletin2;

import java.util.Scanner;

/**
 * Escribe la función “numeroVocales” a la que le pasamos una cadena y nos
 * devuelve el número de vocales que hay en la cadena.
 * 
 */
public class Ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declarar variables
		String frase;
		Scanner entrada = new Scanner(System.in, "UTF-8");
		int numVocales;

		// Toma de datos
		System.out.printf("Introduce una frase:%n");
		frase = entrada.nextLine();

		numVocales = numeroVocales(frase);

		System.out.printf("La cadena tiene %d vocales  \n", numVocales);

		entrada.close();
	}

	private static int numeroVocales(String frase) {

		int vocales = 0;
		char c;

		for (int i = 0; i < frase.length(); i++) {

			c = Character.toUpperCase(frase.charAt(i));
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				vocales++;
			}

		}
		return vocales;
	}
}