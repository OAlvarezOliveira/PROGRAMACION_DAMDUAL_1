package com.acarballeira.ud1.secuencial;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

import java.util.Scanner;


/*
Pedimos un número entero entre 32 y 255 (el rango visible de la tabla ASCII extendida).

Comprobamos si está dentro del intervalo.

Convertimos el número en carácter con un cast: (char) numero.

Mostramos el carácter en pantalla
*/
public class Ejercicios10 {

	public static void main(String[] args) {

		// ----------------------------
		// 1. Declarar variables
		// ----------------------------
		int numero; // número introducido por el usuario
		char caracter; // carácter correspondiente en la tabla ASCII

		Scanner teclado = new Scanner(System.in);

		// ----------------------------
		// 2. Toma de datos / iniciar variables
		// ----------------------------
		System.out.print("Introduce un número entero entre 32 y 255: ");
		numero = teclado.nextInt();
		teclado.close();


		// ----------------------------
		// 3. Operativa
		// ----------------------------
		if (numero >= 32 && numero <= 255) {
			caracter = (char) numero;

			// ----------------------------
			// 4. Salida
			// ----------------------------
			System.out.println("El carácter ASCII correspondiente a " + numero + " es: " + caracter);
		} else {
			// ----------------------------
			// 4. Salida (error)
			// ----------------------------
			System.out.println("Número fuera del intervalo permitido.");
		}

	}
}