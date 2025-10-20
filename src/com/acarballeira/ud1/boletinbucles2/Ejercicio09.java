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
Pedir un número entero y dibujar un 
triángulo rectángulo de n elementos de lado
utilizando asteriscos. Por ejemplo, para n = 4:.
 */
public class Ejercicio09 {

	public static void main(String[] args) {

		// Declaracion
		int altura;
		Scanner entrada;

		// Iniciacion
		entrada = new Scanner(System.in);

		// Operativa
		System.out.print("Introduce la altura del triángulo rectángulo: ");
		altura = entrada.nextInt();
		for (int j = 0; j < altura; j++) {
			
			for (int i = 0; i < altura-j; i++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		// Salida de datos
		entrada.close();
	}
}
