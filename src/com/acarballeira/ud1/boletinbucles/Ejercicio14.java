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
Código de barras: El código de barras utiliza líneas paralelas 
verticales (barras y espacios) que representan información en su 
equivalente binario. El código es muy usado en los puntos de ventas
y es “leído” por un dispositivo láser (scanner). Para facilitar la
lectura por scanner se usa el método de “simbología discreta”, en
el que se marca el inicio, separación y fin de los datos con la 
secuencia barra/espacio/ barra (101) por cada grupo de 10 bits 
(dígitos binarios). Elabore un algoritmo que permita cambiar un 
código de producto conformado por dos números de 3 cifras a su 
equivalente en código de barras usando simbología discreta. 
Referencia: http://es.wikipedia.org/wiki/C%C3%B3digo_de_barras  
 */
public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Entrada: dos números de 3 cifras
		System.out.print("Introduce el primer número (3 cifras): ");
		int numero1 = sc.nextInt();

		System.out.print("Introduce el segundo número (3 cifras): ");
		int numero2 = sc.nextInt();

		// Validación sencilla
		if (numero1 < 100 || numero1 > 999 || numero2 < 100 || numero2 > 999) {
			System.out.println("Ambos números deben tener 3 cifras.");
			sc.close();
			return;
		}

		// Convertir cada número a binario de 10 bits
		String bin1 = toBinary10Bits(numero1);
		String bin2 = toBinary10Bits(numero2);

		// Usar simbología discreta con separadores 101
		String codigoBarras = "101" + bin1 + "101" + bin2 + "101";

		System.out.println("Código de barras generado:");
		System.out.println(codigoBarras);

		sc.close();
	}

	// Función que convierte un número a binario de 10 bits
	public static String toBinary10Bits(int numero) {
		String binario = "";

		do {
			int resto = numero % 2;
			binario = resto + binario;
			numero /= 2;
		} while (numero > 0);

		// Rellenar con ceros a la izquierda hasta que tenga 10 bits
		while (binario.length() < 10) {
			binario = "0" + binario;
		}

		return binario;
	}

}
