/**
 * 
 */
package com.acarballeira.ud2.stringsBoletin2;

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
 * Escribe la función “numeroEspacios” a la que le pasamos una cadena y nos
 * devuelve el número de espacios que contiene esa cadena (tanto al principio y
 * al final como intercalados).
 */

public class Ejercicio12 {

	public static void main(String[] args) {

		// Declarar variables
		String frase;
		Scanner entrada = new Scanner(System.in, "UTF-8");
		int numEspacios;

		// Toma de datos
		System.out.printf("Introduce una frase:%n");
		frase = entrada.nextLine();

		numEspacios = numeroEspacios(frase);

		System.out.printf("La cadena tiene %d espacios \n", numEspacios);

		entrada.close();
	}

	private static int numeroEspacios(String frase) {

		int espacios = 0;

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == ' ') {
				espacios++;
			}

		}
		return espacios;
	}
}
