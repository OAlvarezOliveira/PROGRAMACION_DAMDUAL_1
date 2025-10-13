/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01.java
 */

package com.acarballeira.ud1.boletinbucles;

import java.util.Scanner;

/*
Realizar un algoritmo que determine si una serie de números 
ingresada por teclado es ascendente. El final de la serie viene dado 
por un número negativo. 
(Ej: 1, 5, 5, 10,11, 12, 12, 20,-1 es una serie ascendente)
 */
public class Ejercicio09 {

	public static void main(String[] args) {

		// declarar variables
		int num;
		Scanner sc;
		boolean esAscendente;
		int numAnterior;

		// iniciar varianbles
		sc = new Scanner(System.in);
		num = Integer.MAX_VALUE;
		esAscendente = true;
		numAnterior = -1;

		while (num >= 0) {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			if (num > -1) {
				if (num < numAnterior) {
					esAscendente = false;
				}
			}

			numAnterior = num;
		}

		if (esAscendente) {
			System.out.println("Lista ascendente ");

		} else {
			System.out.println("Lista no ascendente");

		}

		System.out.println("Salimos del programa ");
		sc.close();
	}

}
