/**
 * Resolucion de la tarea 14 boletin bucles 2
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio12.java
 */

package com.acarballeira.ud1.boletinbucles2;

import java.util.Scanner;

/**
 * 14.Programa que calcule el máximo común divisor de dos números introducidos
 * por teclado. Un modo sencillo aunque ineficiente es partiendo del menor ir
 * buscando de forma decreciente el primer número que divida a ambos
 * simultáneamente.
 */

public class Ejercicio14 {

	public static void main(String[] args) {

		// Declaracion
		int n1;
		int n2;
		int menor = Integer.MAX_VALUE;
		int mcd = 0;
		Scanner entrada;

		// Inicializacion
		mcd = 0;
		entrada = new Scanner(System.in);

		// Entrada de datos
		System.out.print("Introduce el primer numero para calcular el MCD: ");
		n1 = entrada.nextInt();
		System.out.print("Introduce el segundo numero para calcular el MCD: ");
		n2 = entrada.nextInt();

		// Operativa

		if (n1 > n2) {
			menor = n2;
		} else {
			menor = n1;
		}

		System.out.println("El número menor entre los dos es: " + menor);

		for (int i = menor; i >= 1; i--) {
			if ((n1 % i == 0) && (n2 % i == 0)) {
				mcd = i;
				break; // Hemos encontrado el MCD, no hace falta seguir
			}
		}

		// Salida de datos
		System.out.println("El MCD de (" + n1 + ", " + n2 + ") es: " + mcd);
		entrada.close();
	}
}
