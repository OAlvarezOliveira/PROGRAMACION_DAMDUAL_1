/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio04.java
 */

package com.acarballeira.ud2.stringsBoletin2;

import java.util.Scanner;

/**
 * Ejercicio 4: Eliminar la última palabra de una frase
 */
public class Ejercicio04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declaracion de Variables
		String frase;
		int posicion;
		String fraseFinal;

		// Inicializar Variables
		Scanner entrada;
		entrada = new Scanner(System.in);

		// Toma de datos
		System.out.printf("Introduce una frase para procesar %n");
		frase = entrada.nextLine();

//		frase = "Hola mundo desde Galicia"; DEBUGG
		
		frase.trim();
		posicion = frase.lastIndexOf(' ');

		if (posicion > 0) {
			fraseFinal = frase.substring(0, posicion);
		} else {
			fraseFinal = "";
		}

		System.out.printf("La frase procesada es: %n %s", fraseFinal);

		entrada.close();
	}

}
