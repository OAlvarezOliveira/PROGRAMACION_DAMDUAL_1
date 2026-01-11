/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio10.java
 */

package com.acarballeira.ud2.arraysBoletin2;

import java.util.Scanner;

/**
 * Crea un programa que pida por pantalla cuatro países y a continuación tres
 * ciudades de cada uno de estos países. Los nombres de ciudades deben
 * almacenarse en un array multidimensional cuyo primer índice sea el número
 * asignado a cada país y el segundo índice el número asignado a cada ciudad.
 * Ejemplo de resultados que debe mostrar el programa:
 * 
 * País: Portugal Ciudades : Lisboa Porto Setúbal País: España Ciudades : Madrid
 * Barcelona Sevilla País: Francia Ciudades : Paris Lyon Niza País: Italia
 * Ciudades : Roma Napoles Sicilia
 * 
 */

public class Ejercicio10 {

	private static final int CANTIDAD_PAISES = 4;
	private static final int CANTIDAD_CIUDADES = 3;

	public static void main(String[] args) {
		
		String[] paises = new String[CANTIDAD_PAISES];
		String[][] ciudades = new String[CANTIDAD_PAISES][CANTIDAD_CIUDADES];

		almacenaDatos(paises, ciudades);
		imprimeDatos(paises, ciudades);

	}

	private static void imprimeDatos(String[] paises, String[][] ciudades) {

		for (int i = 0; i < CANTIDAD_PAISES; i++) {
			System.out.printf("País: %s \n", paises[i]);
			System.out.printf("Ciudades: \n");

			for (int j = 0; j < CANTIDAD_CIUDADES; j++) {
				System.out.printf("    %s \n", ciudades[i][j]);
			}
			System.out.printf("\n"); 
		}

	}

	private static void almacenaDatos(String[] paises, String[][] ciudades) {

		Scanner teclado = new Scanner(System.in, "UTF-8");

		for (int i = 0; i < CANTIDAD_PAISES; i++) {

			System.out.printf("Introduce el nombre del país %d: ", i + 1);
			paises[i] = teclado.nextLine();


			for (int j = 0; j < CANTIDAD_CIUDADES; j++) {
				System.out.printf("Introduce ciudad %d de %s: ", j + 1, paises[i]);
				ciudades[i][j] = teclado.nextLine();
			}
		}
		teclado.close();  
	}

}
