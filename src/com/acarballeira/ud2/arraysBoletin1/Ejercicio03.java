package com.acarballeira.ud2.arraysBoletin1;

import java.util.Random;


/**
 * Resolucion de la tarea 03. Ejercicios Arrays
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

/*
Programa que le de valores al azar comprendidos entre 0 y 31 a 
una tabla de dimensiones 10x10. 
Escribir la tabla para comprobar que tiene los valores correctos.
 */

public class Ejercicio03 {

	public static void main(String[] args) {

		// Declarar Variables
		int[][] matriz;
		final int LONGITUD_FIL;
		final int LONGITUD_COL;
		Random aleatorio;


		// Inicializar Variables
		LONGITUD_COL = 10;
		LONGITUD_FIL = 10;
		matriz = new int[LONGITUD_FIL][LONGITUD_COL];
		aleatorio = new Random();


		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {
				
				matriz[i][j] = aleatorio.nextInt(0,32);

			}

		}

		for (int[] fila : matriz) {

			for (int elemento : fila) {
				System.out.printf("%02d ", elemento);

			}
			System.out.printf("%n");

		}

	}

}

