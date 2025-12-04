/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio06.java
 */

package com.acarballeira.ud2.arrays;

import java.util.Scanner;

/**
Programa Java que guarda en un array 10 números enteros que se leen por teclado. 
A continuación se recorre el array y 
calcula cuántos números son positivos, cuántos negativos y cuántos ceros.
 */
public class Ejercicio06 {


	public static void main(String[] args) {
		
		
		// Declaracion Variables
		int[] numeros;
		int accPos;
		int accNeg;
		int accCeros;
		final int LONGITUD;
		Scanner teclado;


		// Inicializacion Variables
		accPos= 0;
		accNeg= 0;
		accCeros= 0;
		LONGITUD = 10;
		numeros = new int[LONGITUD];
		teclado = new Scanner(System.in);
		
		//Operativa
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Añade un valores a numeros");
			numeros[i] = teclado.nextInt(); // Asigna el valor recogido en teclado a la posición 'i' del array
//			System.out.println(numeros[i]); //DEBUG
			if (numeros[i] == 0) {
				accCeros++;

			} else if (numeros[i] >= 0) {
				accPos++;

			} else {
				accNeg++;
			}
			}//Fin llenado de array
		
		//Salida de datos
		System.out.printf("%s: %d\n", "Positivos", accPos);
		System.out.printf("%s: %d\n", "Negativos", accNeg);
		System.out.printf("%s: %d\n", "Ceros", accCeros);

		
		teclado.close();
	}

}
