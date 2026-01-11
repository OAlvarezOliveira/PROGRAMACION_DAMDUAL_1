package com.acarballeira.ud2.arraysBoletin2;

import java.util.Arrays;

/**
 * Resolucion de la tarea 1. Boletin arrays 2
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio07.java
 */

/**
 * Crear dos arrays, rellenar uno con fill teniendo en cuenta que será de tamaño
 * 10 y copiarlo al otro usando copyOf de Arrays, obviando la primera y última
 * posiciones. Mostrar el array copiado.
 * 
 * El array de destino tendrá
 * 
 * 
 */
public class Ejercicio07 {

	private static final int DIMENSION = 10;

	public static void main(String[] args) {

		int vector1[];
		int vectorCopia[];

		vector1 = new int[DIMENSION];

		creaVector(vector1);
		vectorCopia = copiaVector(vector1);
		muestraVector(vectorCopia);

	}

	private static void muestraVector(int[] vectorCopia) {

		for (int d : vectorCopia) {

			System.out.printf("%d \n", d);

		}
	}

	private static int[] copiaVector(int[] vector1) {

		int[] vector;
		vector = Arrays.copyOfRange(vector1, 1, 9);
		return vector;
	}

	private static void creaVector(int[] vector1) {

		Arrays.fill(vector1, 8);

	}

}
