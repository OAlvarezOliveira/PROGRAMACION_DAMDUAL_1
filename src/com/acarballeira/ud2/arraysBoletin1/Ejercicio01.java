package com.acarballeira.ud2.arraysBoletin1;

import java.util.Scanner;

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
 * Programa Java que llene un array con 10 números enteros que se leen por
 * teclado. A continuación calcula y muestra la media de los valores positivos y
 * la de los valores negativos del array.
 * 
 */

public class Ejercicio01 {

	public static void main(String[] args) {

		// Declaracion Variables
		int[] numeros;
		int j;
		int accPos;
		int accNeg;
		int cantPos;
		int cantNeg;
		final int LONGITUD;
		double mediaPos;
		double mediaNeg;
		Scanner teclado = new Scanner(System.in);

		// Inicializacion Variables
		accPos = 0;
		accNeg = 0;
		cantPos = 0;
		cantNeg = 0;
		mediaPos = 0;
		mediaNeg = 0;
		LONGITUD = 10;
		numeros = new int[LONGITUD];

		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Añade un valor a numeros");
			j = teclado.nextInt();
			numeros[i] = j; // Asigna el valor de j a la posición 'i' del array
			System.out.println(j);
			if (j >= 0) {
				accPos++;
				cantPos += j;
			} else {
				accNeg++;
				cantNeg += j;
			}
		}
		mediaPos = cantPos > 0 ? (double) cantPos / accPos : 0;
		mediaNeg = cantNeg > 0 ? (double) cantNeg / accNeg : 0;

		System.out.printf("Media positivos: %.2f\nMedia negativos:%.2f", mediaPos, mediaNeg);
		teclado.close();
	}

}
