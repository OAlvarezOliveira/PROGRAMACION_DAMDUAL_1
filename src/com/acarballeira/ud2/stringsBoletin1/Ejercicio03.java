/**
 * Resolucion de la tarea 04. Ejercicios Strings
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio03.java
 */

package com.acarballeira.ud2.stringsBoletin1;

import java.util.Scanner;

/**
 * Encuentra cadena. Diseña un programa en Java que solicite al usuario una
 * cadena en la que buscará y otra que será la cadena buscada. El programa
 * indicará cuantas veces aparece la segunda cadena en la primera.
 */
public class Ejercicio03 {

	public static void main(String[] args) {

		// variables
		String textoCompleto;
		String textoBuscar;
		int coincidencias = 0;
		int posicion = 0;
		Scanner scanner = new Scanner(System.in, "UTF-8");

		// Entrada de datos
		System.out.printf("Introduce una cadena de  referencia \n");
		textoCompleto = scanner.nextLine();
		System.out.printf("Introduce una cadena a buscar en el texto anterior \n");
		textoBuscar = scanner.nextLine();

		// operativa

		posicion = textoCompleto.indexOf(textoBuscar, 0); // Primera búsqueda

		while (posicion != -1) {
			coincidencias++;
			posicion = textoCompleto.indexOf(textoBuscar, (posicion + 1)); // Buscar siguientes coincidencias

			System.out.printf("La cadena introducida se ha encontrado :  %d veces \n", coincidencias);

		}
		scanner.close();
	}

}
