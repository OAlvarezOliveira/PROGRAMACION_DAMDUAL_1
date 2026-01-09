package com.acarballeira.ud2.arraysBoletin1;

import java.util.Random;

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
 * Programa que asigne números a una matriz de orden 4x5 comprendidos entre 1 y
 * 10. El programa tiene que escribir la suma de los elementos de cada fila y la
 * suma de los números que son pares de cada columna con el formato siguiente:
 * 
 * suma de los elementos de la fila 0 --> XX suma de los elementos de la fila 1
 * --> XX ................................................................. suma
 * de los elementos de la fila 3 --> XX
 * ----------------------------------------- suma de los elementos pares de la
 * columna 0 --> XX suma de los elementos pares de la columna 1 --> XX
 * .............................................................................
 * ........ suma de los elementos pares de la columna 4 --> XX
 */

public class Ejercicio10 {

	public static void main(String[] args) {
		// Declarar Variables
		int[][] matriz;
		int sumaFila;
		int sumaColumnaPares;
		final int FILAS;
		final int COLUMNAS;
		final int SUELO;
		final int TECHO;
		Random aleatorio;

		// Inicializar Variables
		FILAS = 4;
		COLUMNAS = 5;
		SUELO = 1;
		TECHO = 11;
		matriz = new int[FILAS][COLUMNAS];
		sumaFila = 0;
		sumaColumnaPares = 0;
		aleatorio = new Random();

		// Generar matriz
		for (int i = 0; i < FILAS; i++) {

			for (int j = 0; j < COLUMNAS; j++) {

				matriz[i][j] = aleatorio.nextInt(SUELO,TECHO);

			}

		}

		// Recorrer Matriz y Calcular sumaFila
		for (int i = 0; i < FILAS; i++) {
			sumaFila = 0;

			for (int j = 0; j < COLUMNAS; j++) {

				sumaFila += matriz[i][j];

			}
			System.out.printf("suma de los elementos de la fila: " + sumaFila + "%n");
			System.out.printf("suma de los elementos de la fila %d --> XX suma de los elementos de la fila %d --> XX");

		} // FIN sumaFila

		// Recorrer Matriz y Calcular sumaColumnaPares
		for (int i = 0; i < COLUMNAS; i++) {
			
			sumaColumnaPares = 0;

			for (int j = 0; j < FILAS; j++) {
				if (matriz[j][i] % 2 == 0) {
					sumaColumnaPares += matriz[j][i];
				}

			}
			System.out.printf("suma de los elementos pares de las columnas: " + sumaColumnaPares + "%n");
		} // FIN sumaColumnaPares

	}

}
