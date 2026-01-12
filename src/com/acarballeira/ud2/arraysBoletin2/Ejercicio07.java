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
		int relleno; 
		int posicion1;
		int posicion2;

		vector1 = new int[DIMENSION];
		relleno = 8;
		posicion1 = 1;
		posicion2 = 9;

		creaVector(vector1,relleno);
		vectorCopia = copiaVector(vector1,posicion1,posicion2);
		muestraVector(vectorCopia);

	}

	private static void muestraVector(int[] vectorCopia) {

		for (int d : vectorCopia) {

			System.out.printf("%d \n", d);

		}
	}
	
	/**
	 * 
	 * @param vector1 , requiere un vector de 10 posiciones
	 * @return devuele un rango del vector original sin las posiciones 0 y 10;
	 */

	private static int[] copiaVector(int[] vector1,int posicion1 , int posicion2) {

		int[] vector;
		vector = Arrays.copyOfRange(vector1,posicion1,posicion2);
		return vector;
	}
	
	/**
	 * Crea un vector lleno del parameto relleno
	 * @param vector1
	 * @param relleno , valor int para llenar el vector1
	 */

	private static void creaVector(int[] vector1, int relleno) {

		Arrays.fill(vector1, relleno);

	}

}
