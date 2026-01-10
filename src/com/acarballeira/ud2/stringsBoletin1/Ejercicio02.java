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
Cadena espejo. Crea un programa que reciba una cadena de caracteres y la devuelva invertida con efecto espejo, 
esto es, se concatena a la palabra original su inversa, compartiendo la última letra, que hará de espejo, 
por lo que la palabra obtenida se lee igual hacia adelante que hacia atrás. 
Por ejemplo, al introducir “teclado” devolverá “tecladodalcet” y al introducir “goma” devolverá “gomamog”.
 * */

public class Ejercicio02 {

	public static void main(String[] args) {
		
		String texto; 
		String textoInvertido = ""; 
		String textoEspejo= ""; 
		Scanner scanner = new Scanner(System.in, "UTF-8");


		
		
		System.out.printf("Introduce una cadeana para invertirla \n");

		texto = scanner.nextLine();

		for (int i =texto.length()-2; i >= 0 ; i-- ) {
			
			textoInvertido+= texto.charAt(i);
		}
		
		textoEspejo = texto+textoInvertido;
		
		System.out.printf("la cadena espejo es %s \n", textoEspejo);

		
		scanner.close();
	}

}