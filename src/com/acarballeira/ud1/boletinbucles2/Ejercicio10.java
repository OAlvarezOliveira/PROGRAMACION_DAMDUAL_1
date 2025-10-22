/**
 * Resolucion de la tarea 10 boletin bucles 2
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
Programa que convierta un número decimal en su 
representación binaria. NO utilizar funciones de libería.
 */
public class Ejercicio10 {

	public static void main(String[] args) {

		// Declaracion
		int n;
		String binario = "";
		Scanner entrada;

		// Iniciacion
		entrada = new Scanner(System.in);

		// Operativa
		System.out.print("Introduce el numero decimal a convertir a binario: ");
		n = entrada.nextInt();

		while (n > 0) {
		    int resto = n % 2;
		    binario = resto + binario; // añadir por delante
		    n = n / 2;
		}
		System.out.println("En binario: " + binario);
		// Salida de datos
		entrada.close();
	}
}
