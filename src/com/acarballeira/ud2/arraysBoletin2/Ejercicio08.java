/**
 * Resolucion de la tarea 1. Boletin arrays 2
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio08.java
 */

package com.acarballeira.ud2.arraysBoletin2;

import java.util.Arrays;

/**
Indica si dos arrays creados por ti son iguales con equals de Arrays. 
Haz pruebas con distintos tamaños de arrays y datos.  
 */
public class Ejercicio08 {

	public static void main(String[] args) {

		int[][] todosLosArrays = {
			    { 1, 2, 3, 4, 5 },  
			    { 1, 2, 3, 8, 5 },  
			    { 1, 2, 3, 8, 5 },  
			    { 1, 2, 9, 4, 5 },  
			    { 1, 2, 3 },        
			    { 1, 2, 3, 4, 5 }   
			};

		int indice1 = (int)(Math.random() * 6);  
		int indice2 = (int)(Math.random() * 6);
		
		int[] array1 = todosLosArrays[indice1];
		int[] array2 = todosLosArrays[indice2];

		System.out.printf("Primer array a comparar : \n");
		muestraVector(array1);

		System.out.printf("Segudo array a comparar : \n");
		muestraVector(array2);

		comparaVector(array1, array2);

	}

	private static void comparaVector(int[] array1, int[] array2) {

		boolean resultado = Arrays.equals(array1, array2);

		if (resultado) {
			System.out.printf("Los arrays son iguales \n");
		} else {
			System.out.printf("Los arrays NO son iguales \n");
		}

	}

	private static void muestraVector(int[] vectorCopia) {

		for (int d : vectorCopia) {

			System.out.printf("%d \n", d);

		}
	}

}
