package com.acarballeira.ud2.stringsBoletin2;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

/**
 * @author  O.Alvarez
 *
 */

public class Ejercicio03B {
	
	public static void main(String[] args) {
		
		int num;
		String frase = "Buenos días, como estás";
				
		num = contarPalabras2(frase);
		System.out.printf("El número de palabras de la frase \"%s\" es %d", frase, num);
		
	}

	private static int contarPalabras(String frase) {
		
		frase.trim();
		String[] palabras = frase.split(" ");				
		return palabras.length;
	}
	
	private static int contarPalabras2(String frase) {
		
		int num = 0;
		int pos;
		
		frase.trim();
		if(frase.isEmpty()) {
			num = 0;
		} else {
			num = 1;
			//Localizo o siguiente espacio en blanco
			pos = frase.indexOf(" ");
			while(pos != -1) {
				num++;
				pos = frase.indexOf(" ", pos + 1); 
			}//while
		}
		
		return num;
	}

}






