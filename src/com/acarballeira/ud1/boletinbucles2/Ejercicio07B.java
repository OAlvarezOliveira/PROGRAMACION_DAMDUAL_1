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
 * 7. Calcular le factorial de un número introducido por teclado.
 */
public class Ejercicio07B {

	public static void main(String[] args) {

		// Declaracion
//		int x;
		long factorial;
		Scanner entrada;

		// Iniciacion
		factorial = 1;
		entrada = new Scanner(System.in);

		// Operativa
//		System.out.print("Introduce el numero a calcular su factorial ");
//		x = entrada.nextInt();
		for (int j = 1; j <= 20; j++) {
			factorial = 1;
			for (int i = 1; i <=j; i++) {
				factorial *= i;
			}
			// Salida de datos
			System.out.println("El valor del factorial de " + j +"!" + " es " + factorial);
			entrada.close();
		}
	}
}
