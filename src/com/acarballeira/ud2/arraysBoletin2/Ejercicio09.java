/**
 * Resolucion de la tarea 1. Boletin arrays 2
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio09.java
 */

package com.acarballeira.ud2.arraysBoletin2;

import java.util.Arrays;
import java.util.Random;

/**
 * Ordena un array de números enteros generados al azar con sort de Arrays.
 * Muestra el array original y el array ordenado.
 * 
 * 
 */
public class Ejercicio09 {

	/**
	 * @param args
	 */
	private static final int DIMENSION = 10;

	public static void main(String[] args) {

		int vector1[];
		int vectorCopia[];

		vector1 = new int[DIMENSION];
		
		
		creaVector(vector1);
		System.out.printf("Array original: \n");
		muestraVector(vector1); 

		vectorCopia = copiaVector(vector1);
		ordenaVector(vectorCopia);
		System.out.printf("Array ordenado: \n");
		muestraVector(vectorCopia);  

	}

	private static void muestraVector(int[] vectorCopia) {

		for (int d : vectorCopia) {

			System.out.printf("%d \n", d);

		}
	}

	private static int[] ordenaVector(int[] vector) {
		Arrays.sort(vector);
		return vector;
	}

	private static int[] copiaVector(int[] vector) {

		vector = Arrays.copyOf(vector, vector.length);
		return vector;
	}

	private static void creaVector(int[] vector) {
		
		Random aleatorio;
		
		aleatorio = new Random();

		for (int i = 0; i < vector.length; i++) {
	        vector[i] = aleatorio.nextInt(100);
	    }

	}

}
