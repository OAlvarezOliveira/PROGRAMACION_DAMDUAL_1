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
 * Implementa un programa en Java que imprima os números que vaia lendo por
 * teclado, excepto os que sexan negativos. O programa terminará cando
 * escribamos un cero. Debes implementar a solución cun bucle do while infinito.
 * 
 */

public class Ejercicio03 {

	public static void main(String[] args) {

		// Declaracion de Variables
		int numero;
		Scanner entrada;

		// Inicializacion de Variables

		entrada = new Scanner(System.in);

		// entrada de datos y operativa
		do {
			System.out.println("Introduce el numero:");
			numero = entrada.nextInt();

			if (numero == 0) {
				break;
			}
			if (numero < 0) {
				continue;
			}
			System.out.println(numero);

		} while (true);

		entrada.close();

	}

}
