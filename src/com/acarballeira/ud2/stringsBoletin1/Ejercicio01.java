package com.acarballeira.ud2.stringsBoletin1;

import java.util.Scanner;

/**
 * Resolucion de la tarea 04. Ejercicios Strings
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

/*
Invertir cadena. 
Crea un programa en Java que solicite al usuario la introducción de una cadena de caracteres y devuelva esta cadena invertida.
 * */

public class Ejercicio01 {

	public static void main(String[] args) {
		
		String texto; 
		String textoInvertido = ""; 
		Scanner scanner = new Scanner(System.in, "UTF-8");


		
		
		System.out.printf("Introduce una cadeana para invertirla \n");

		texto = scanner.nextLine();

		for (int i =texto.length()-1; i >= 0 ; i-- ) {
			
			textoInvertido+= texto.charAt(i);
		}
		
		System.out.printf("la cadena invertida es %s \n", textoInvertido);

		
		scanner.close();
	}

}
