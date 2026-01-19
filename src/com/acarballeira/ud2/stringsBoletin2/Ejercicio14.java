/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio14.java
 */

package com.acarballeira.ud2.stringsBoletin2;
import java.util.Scanner;

/**
Escribe la función “esPalindromo” a la que le pasamos una cadena y 
nos dice si la cadena es un palíndromo (true) o no (false). 
Un palíndromo es una palabra o frase que se lee igual al revés que al derecho.
 */
public class Ejercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in, "UTF-8");
	    
	    System.out.printf("Introduce una palabra: \n");
	    String palabra = entrada.nextLine();
	    
	    if (esPalindromo(palabra)) {
	        System.out.printf("Es palíndromo \n");
	    } else {
	        System.out.printf("No es palíndromo \n");
	    }
	    
	    entrada.close();
	}

	private static boolean esPalindromo(String palabra) {
	    String invertida = "";
	    
	    for (int i = palabra.length() - 1; i >= 0; i--) {
	        invertida += palabra.charAt(i);
	    }
	    
	    return palabra.equalsIgnoreCase(invertida);
	}

}
