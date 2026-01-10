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
 * Subcadena mayúscula. Crea un programa en Java que solicite al usuario dos
 * cadenas de caracteres y que devuelva la primera cadena, pero transformando en
 * mayúsculas la parte que coincide con la segunda cadena introducida. Por
 * ejemplo, si se introducen las cadenas
 * 
 * “Este es mi amigo Juan” y “amigo”,
 * 
 * devolverá
 * 
 * “Este es mi AMIGO Juan”
 * 
 * 
 */
public class Ejercicio04 {

	public static void main(String[] args) {

		// variables
		String textoCompleto;
		String textoBuscar;

		String parteAntes;
		String coincidencia;
		String parteDespues;

		int posicion = 0;
		Scanner scanner = new Scanner(System.in, "UTF-8");

		// Entrada de datos
		System.out.printf("Introduce una cadena de  referencia \n");
		textoCompleto = scanner.nextLine();
		System.out.printf("Introduce una cadena a buscar en el texto anterior \n");
		textoBuscar = scanner.nextLine();

		// operativa

		posicion = textoCompleto.indexOf(textoBuscar, 0); // Búsqueda

		if (posicion != -1) {

			parteAntes = textoCompleto.substring(0, (posicion)); // Extrae desde 'inicio' hasta 'fin' (sin incluir fin)
			coincidencia = textoCompleto.substring(posicion, posicion + textoBuscar.length()); // Extrae la coincidencia																							// conincidencia
			coincidencia = coincidencia.toUpperCase(); // Convierte la coincidencia a mayúsculas
			parteDespues = textoCompleto.substring(posicion + textoBuscar.length()); // Extrae desde que termina conincidencia al fin de frase

			System.out.printf("%s%s%s \n", parteAntes, coincidencia, parteDespues);

		} else {

			System.out.printf("No hay coincidencias a convertir \n");

		}
		scanner.close();
	}

}
