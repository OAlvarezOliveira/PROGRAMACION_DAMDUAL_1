/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01While.java
 */

package com.acarballeira.ud1.bucles;

import java.util.Scanner;

/**
 * Crea un programa que genere dos números al azar entre 
 * el 0 y el 100, y pida
 * al usuario que calcule e introduzca su suma. 
 * Si la respuesta no es correcta,
 * deberá volver a pedirla tantas veces 
 * como sea necesario hasta que el usuario
 * acierte.
 */

public class Ejercicio04While {

	public static void main(String[] args) {

		// Declarar
		int a;
		int b;
		int suma;
		Scanner entrada;

		// Iniciar variables
		entrada = new Scanner(System.in);

		do {
			// Entrada de datos
			System.out.println("Introduce suma");
			suma = entrada.nextInt();
			
			// Operativa
			a = (int) (Math.random() * 100);
			b = (int) (Math.random() * 100);

			// Salida de datos
			if (suma != a + b) {
				System.out.println("Incorrecto");
			}

			System.out.println("El valor de a era: " + a);
			System.out.println("El valor de b era: " + b);

		} while (suma != a + b);
		System.out.println("Correcto");
		System.out.println("Fin del programa");
		entrada.close();

	}
}
