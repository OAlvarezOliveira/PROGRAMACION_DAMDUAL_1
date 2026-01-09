/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio07.java
 */

package com.acarballeira.ud2.stringsBoletin2;

import java.util.Scanner;

/**
 * El cálculo de la letra del Documento Nacional de Identidad (DNI) es un
 * proceso matemático sencillo que se basa en obtener el resto de la división
 * entera del número de DNI y el número 23. A partir del resto de la división,
 * se obtiene la letra seleccionándola dentro de una cadena de letras.
 * 
 * El array de letras es: char [] letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y',
 * 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K',
 * 'E', 'T'];
 * 
 * String letras =“TRWAGMYFPDXBNJZSQVHLCKET”
 * 
 * Por tanto, si el resto de la división es 0, la letra del DNI es la T y si el
 * resto es 3 la letra es la A.
 * 
 * 
 * Con estos datos, elaborar un pequeño script que:
 * 
 * 
 * • Almacene en una variable el número de DNI indicado por el usuario y en otra
 * variable la letra del DNI que se ha indicado.
 * 
 * • En primer lugar (y en una sola instrucción) se debe comprobar si el número
 * es menor que 0 o mayor que 99999999.Si ese es el caso, se muestra un mensaje
 * al usuario indicando que el número proporcionado no es válido y el programa
 * no muestra más mensajes. • Si el número es válido, se calcula la letra que le
 * corresponde según el método explicado anteriormente. • Una vez calculada la
 * letra, se debe comparar con la letra indicada por el usuario. Si no
 * coinciden, se muestra un mensaje al usuario diciéndole que la letra que ha
 * indicado no es correcta. En otro caso, se muestra un mensaje indicando que el
 * número y la letra de DNI son correctos.
 */
public class Ejercicio07 {

	public static void main(String[] args) {

		// Decarar Variables
		String letras;
		int numDNI;
		char letraDNI;
		char letraDNIValidada;
		Scanner entrada;
		boolean numValido;

		// Inicializar Variables
		entrada = new Scanner(System.in);
		letras = "TRWAGMYFPDXBNJZSQVHLCKET";

		// Toma de datos
		System.out.printf("Introduce el nº de DNI para procesar%n");
		numDNI = entrada.nextInt();
		entrada.nextLine(); // Consumir el salto de línea

		System.out.printf("Introduce la letra del DNI para comprobar%n");
		String inputLetra = entrada.nextLine().trim().toUpperCase();
		letraDNI = inputLetra.charAt(0);

		// Operativa

		if (numDNI < 0 || numDNI > 99999999) {
			numValido = false;
		} else {
			numValido = true;
		}

		if (numValido) {
			// Calcular letra correcta
			letraDNIValidada = letras.charAt(numDNI % 23);

			// Comparar letras
			if (letraDNI == letraDNIValidada) {
				System.out.printf("El número y la letra del DNI son correctos%n");
			} else {
				System.out.printf("La letra que ha indicado no es correcta%n");
			}

		} else {
			System.out.printf("El número proporcionado no es válido%n");
		}

		entrada.close();
	}

}
