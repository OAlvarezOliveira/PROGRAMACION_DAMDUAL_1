package com.acarballeira.ud2.arrays;

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
 * Hacer un programa que le de valores a una matriz unitaria de orden 10. Una
 * matriz unitaria es aquella en la que todos sus elementos valen 0, exceptuando
 * los de la diagonal principal que valen 1.
 */

public class Ejercicio02 {

	public static void main(String[] args) {

		// Declarar Variables
		int[][] matrizUnitarua;
		final int LONGITUD_FIL;
		final int LONGITUD_COL;
	//	Scanner teclado;

		// Inicializar Variables
		LONGITUD_COL = 10;
		LONGITUD_FIL = 10;
		matrizUnitarua = new int[LONGITUD_FIL][LONGITUD_COL];
		// teclado = new Scanner(System.in);

		for (int i = 0; i < matrizUnitarua.length; i++) {

			matrizUnitarua[i][i] = 1;

		}

		for (int[] fila : matrizUnitarua) {

			for (int elemento : fila) {
				System.out.printf("%d ", elemento);

			}
			System.out.printf("%n");

		}

	}

}

