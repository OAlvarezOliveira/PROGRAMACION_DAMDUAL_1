package com.acarballeira.ud1.breakcontinue;

import java.util.Scanner;

/**
 * Resolucion de la tarea
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

/*
 * 
 * Elabora un programa Java que averigüe se un número enteiro positivo dado polo
 * usuario é primo ou non. Emprega unha variable booleana.
 * 
 */

public class Ejercicio02 {

	public static void main(String[] args) {

		// Declaracion de Variables
		int numero;
		boolean esPrimo;
		Scanner entrada = new Scanner(System.in);

		// Inicializacion de Variables

		esPrimo = false;

		// entrada de datos
		System.out.println("Introduce el numero a validar");
		numero = entrada.nextInt();

			// Bucle para comprobar si el número es divisible por algún otro número
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
					esPrimo = false; // Se encontró un divisor, por lo tanto no es primo.
					break; // Se sale del bucle al encontrar el primer divisor.
				}
			}

		// Muestra el resultado
		if (esPrimo) {
			System.out.println(numero + " es un numero primo.");
		} else {
			System.out.println(numero + " no es un numero primo.");
		}

		entrada.close(); 
	}

}
