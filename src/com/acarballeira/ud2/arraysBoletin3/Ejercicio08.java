/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio08.java
 */

package com.acarballeira.ud2.arraysBoletin3;

import java.util.Scanner;

/**
 * Horario lunes. Utilizando un array para almacenar los datos, pedir un número
 * indicando la hora (primera, segunda, tercera, ...) e indicar qué módulo se
 * está impartiendo a esa hora (no contamos el recreo).
 */
public class Ejercicio08 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in, "UTF-8");

		String[] modulos = { "Sistemas", "Sistemas", "Programacion", "Programacion", "Base Datos", "Ingles" };
		int posicion = horario(entrada) - 1;

		System.out.printf("Actualmente se está impartiendo %s \n", modulos[posicion]);

	}

	private static int horario(Scanner entrada) {

		int resultado;

		System.out.printf("Introduce la hora que deseas consultar: \n");
		resultado = entrada.nextInt();

		return resultado;

	}
}
