/**
 * Resolucion de la tarea 1. Boletin arrays 2
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio06.java
 */

package com.acarballeira.ud2.arraysBoletin2;

import java.util.Scanner;

/**
 * Construir un programa que rellene de forma automática dos vectores de números
 * reales vector1 y vector2, y que construya un nuevo vector del resultado de
 * "concatenar" los vectores v1 y v2. Es decir, colocar los elementos de v2 a
 * continuación de los de v1 y, finalmente,mostrar el resultado de la
 * concatenación por pantalla. Las dimensiones de v1 y v2 son 8 y 12
 * respectivamente. Los números reales generados deben ser 1=< n <= 99.
 */
public class Ejercicio06 {

	private static final int DIMENSION1 = 8;
	private static final int DIMENSION2 = 12;

	public static void main(String[] args) {

		double vector1[];
		double vector2[];
		double vectorConcatenado[];

		vector1 = new double[DIMENSION1];
		vector2 = new double[DIMENSION2];
		vectorConcatenado = new double[DIMENSION1 + DIMENSION2];

		creaVector(vector1, DIMENSION1);
		creaVector(vector2, DIMENSION2);
		vectorConcatenado = concatenaVector(vector1, vector2);
		muestraVector(vectorConcatenado);

	}

	private static double[] creaVector(double vector[], int dimension) {

		for (int i = 0; i < dimension; i++) {

			vector[i] = (Math.random() * 99) + 1;
		}

		return vector;

	}

	private static double[] concatenaVector(double[] vector1, double[] vector2) {

		double[] vectorConcatenado;

		vectorConcatenado = new double[DIMENSION1 + DIMENSION2];

		for (int i = 0; i < DIMENSION1; i++) {
			vectorConcatenado[i] = vector1[i];
		}

		for (int i = 0; i < DIMENSION2; i++) {
			vectorConcatenado[DIMENSION1 + i] = vector2[i];
		}

		return vectorConcatenado;
	}

	private static void muestraVector(double[] vectorConcatenado) {

		for (double d : vectorConcatenado) {

			System.out.printf("%.2f \n", d);

		}

	}

}
