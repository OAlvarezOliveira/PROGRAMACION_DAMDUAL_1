/**
 * Resolucion de la tarea
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio03.java
 */

package com.acarballeira.ud1.boletinbucles2;

import java.util.Scanner;

/**
8. Pedir 5 calificaciones de alumnos e 
indicar si hay algún suspenso. 
 */
public class Ejercicio08 {

	public static void main(String[] args) {

		// Declaracion
		int x;
		int numSusp;
		Scanner entrada;

		// Iniciacion
		numSusp = 0;
		entrada = new Scanner(System.in);

		// Operativa
		for (int i = 1; i <= 5; i++) {
			System.out.print("Introduce la nota del alunmo nº" + i+" ");
			x = entrada.nextInt();
			if (x < 5) {
				numSusp++;
			}
		}
		// Salida de datos
		System.out.print("Han suspedndido :" + numSusp + " alumnos");
		entrada.close();
	}
}
