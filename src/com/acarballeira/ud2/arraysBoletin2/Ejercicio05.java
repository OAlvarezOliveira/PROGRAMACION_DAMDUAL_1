package com.acarballeira.ud2.arraysBoletin2;

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

/*
 * Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las
 * mayúsculas). Después, ve pidiendo posiciones del array por teclado y si la
 * posicion es correcta, se añadira a una cadena que se mostrara al final, se
 * dejará de insertar cuando se introduzca un -1.
 */

public class Ejercicio05 {

	public static void main(String[] args) {

		int eleccion;
		char mayusculas[];
		String resultado = "";
		Scanner teclado = new Scanner(System.in, "UTF-8");

		mayusculas = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P',
				'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		do {

			System.out.printf("Elige un indice entre 0 e " + (mayusculas.length - 1) + ":");
			eleccion = teclado.nextInt();

			if (!(eleccion >= 0 && eleccion <= mayusculas.length - 1)) {
				System.out.printf("Error,mete otro valor");
			} else {

				if (eleccion != -1) {
					resultado += mayusculas[eleccion];
				}
			}

		} while (eleccion != -1);

	}

}
