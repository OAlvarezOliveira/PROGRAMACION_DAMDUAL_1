/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio02.java
 */

package com.acarballeira.ud2.stringsBoletin2;

import java.util.Scanner;

/**
 * Crear un programa que reciba dos números enteros por línea de comandos y un
 * texto. El programa debe multiplicar los dos números. Como resultado debe
 * mostrarse el texto concatenado consigo mismo el número de veces que indique
 * la multiplicación de los números.
 */
public class Ejercicio02 {

	public static void main(String[] args) {

		String frase;
		String resultado = ""; 
		int num1;
		int num2;
		Scanner entrada;

		entrada = new Scanner(System.in);

		System.out.printf("Introduce una frase para procesar %n");
		frase = entrada.nextLine();
		System.out.printf("Introduce el primer factor  para procesar la multiplicacion %n");
		num1 = entrada.nextInt();
		System.out.printf("Introduce el segundo factor para procesar la multiplicacion %n");
		num2 = entrada.nextInt();

		for (int i = 0; i < num1 * num2; i++) {

		    resultado = resultado.concat(frase);

		}
		System.out.println(resultado);
		entrada.close();
	}

}
