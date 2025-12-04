/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio7.java
 */

package com.acarballeira.ud2.arrays;

import java.util.Scanner;

/**
 * Programa Java para leer la altura de N personas y calcular la altura media.
 * Calcular cuántas personas tienen una altura superior a la media y cuántas
 * tienen una altura inferior a la media. El valor de N se pide por teclado y
 * debe ser entero positivo.
 */
public class Ejercicio07 {

	public static void main(String[] args) {

		// Declaracion Variables
		double[] alturaArray;
		double altura;
		int n;
		int alturaAcumulada;
		double alturaMedia;
		int accSuperiorAlturaMedia;
		int accInferiorAlturaMedia;
		Scanner teclado = new Scanner(System.in);

		System.out.printf("Añade la cantidad de datos a almacenar");
		n = teclado.nextInt();

		// Inicializacion Variables
		alturaMedia = 0;
		alturaAcumulada = 0;
		accSuperiorAlturaMedia = 0;
		accInferiorAlturaMedia = 0;
		alturaArray = new double[n];

		// Operativa

		// llenado de alturaArray
		for (int i = 0; i < alturaArray.length; i++) {
			System.out.printf("Añade una altura");
			altura = teclado.nextInt();
			alturaArray[i] = altura;
			alturaAcumulada += altura;
		} //Fin llenado

		// Calculo de media
		alturaMedia = (double) alturaAcumulada / n;

		// Calculo de elementos Up/Down Media
		for (int i = 0; i < alturaArray.length; i++) {

			if (alturaArray[i] > alturaMedia) {
				accSuperiorAlturaMedia++;
			} else if (alturaArray[i] < alturaMedia) {
				accInferiorAlturaMedia++;
			}

		} //Fin  comparar vs media

		//Salida de datos
		System.out.printf("%.2f %d %d\n", alturaMedia, accSuperiorAlturaMedia, accInferiorAlturaMedia);

		// fin de programa
		teclado.close();

	}

}
