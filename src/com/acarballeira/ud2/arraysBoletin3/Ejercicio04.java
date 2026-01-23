/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio04.java
 */

package com.acarballeira.ud2.arraysBoletin3;

import java.util.Random;
import java.util.Scanner;

/**
 * Crear una función que cree un vector de enteros de una longitud especificada,
 * ellenándolo con números pares en el rango [2-fin]. La función debe devolver
 * el vector creado. int[] relllenaPares(int longitud, int fin)
 */
public class Ejercicio04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in, "UTF-8");

		int longitud, fin;

		System.out.printf("Introduce la longitud del vector: ");
		longitud = entrada.nextInt();

		System.out.printf("Introduce el valor maximo para los elementos(fin) ");
		fin = entrada.nextInt();

		int[] vector = relllenaPares(longitud, fin);
		
	    System.out.println("\nVector de pares generado:");
	    for (int num : vector) {
	        System.out.print(num + " ");
	    }

		entrada.close();

	}

	private static int[] relllenaPares(int longitud, int fin) {

		Random aleatorio = new Random();

		int[] vPares = new int[longitud];

		for (int i = 0; i < longitud; i++) {

			int numAleatorio = aleatorio.nextInt(1, (fin / 2) + 1);
			vPares[i] = numAleatorio * 2;

		}

		return vPares;

	}

}
