/**
 * 
 */
package com.acarballeira.ud2.stringsBoletin2;

import java.util.Scanner;
import java.util.StringTokenizer;

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
public class Ejercicio08c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String frase;
		
		frase = leerPalabras();
		mostrarPalabras(frase);

	}

	private static void mostrarPalabras(String frase) {
		StringTokenizer st;
		String palabra;
		frase= frase.trim();
		st = new StringTokenizer(frase, " ");
		
        System.out.printf("%n%-20s %s%n", "PALABRA", "Nº LETRAS");
		while (st.hasMoreTokens()) {
			palabra = st.nextToken();
	        System.out.printf("%-20s %s%n", "-------", "---------");
            System.out.printf("%-20s %d%n",palabra ,palabra.length());
        }
		
	}

	private static String leerPalabras() {
		
		 Scanner entrada = new Scanner(System.in);
        System.out.printf("Introduce una frase:%n");
        
        return entrada.nextLine();
	}

}
