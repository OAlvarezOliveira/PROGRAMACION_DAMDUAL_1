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
import java.time.LocalDate;
import java.time.Period;

/*
Recorremos con un bucle for todos los valores del intervalo [32, 255].

Convertimos cada número en:

Carácter → (char) numero

Binario → Integer.toBinaryString(numero)

Usamos System.out.printf para dar formato en columnas:

%3d → número decimal con al menos 3 espacios.

%8s → binario alineado con 8 espacios.

%c → carácter ASCII..

*/

public class Ejercicios09 {

	public static void main(String[] args) {

		// ----------------------------
		// 1. Declarar variables
		// ----------------------------
		int numero; // valor numérico (32 a 255)
		char caracter; // carácter ASCII
		String binario; // representación binaria

		// ----------------------------
		// 2. Toma de datos / iniciar variables
		// ----------------------------
		// En este caso no pedimos datos al usuario.
		// Recorremos el intervalo [32, 255].

		// ----------------------------
		// 3. Operativa
		// ----------------------------
		for (numero = 32; numero <= 255; numero++) {
			caracter = (char) numero;
			binario = Integer.toBinaryString(numero);

			// ----------------------------
			// 4. Salida
			// ----------------------------
			System.out.printf("%3d  | %8s | %c%n", numero, binario, caracter);
		}

	}
}