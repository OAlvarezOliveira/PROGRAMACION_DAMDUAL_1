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
Ingresar juegos de cuatro valores cada uno. 
Calcular y emitir el promedio de cada juego. 
El proceso finaliza al encontrarse un juego 
cuyo primer valor es 0 (cero). 
 */
public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, num4;
		double promedio;

		do {
			System.out.print("Ingrese el primer valor (0 para salir): ");
			num1 = sc.nextInt();

			if (num1 != 0) {
				System.out.print("Ingrese el segundo valor: ");
				num2 = sc.nextInt();
				System.out.print("Ingrese el tercer valor: ");
				num3 = sc.nextInt();
				System.out.print("Ingrese el cuarto valor: ");
				num4 = sc.nextInt();

				promedio = (num1 + num2 + num3 + num4) / 4.0;
				System.out.println("Promedio del juego: " + promedio);
			}

		} while (num1 != 0);
		sc.close();
	}
}
