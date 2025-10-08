/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01While.java
 */

package com.acarballeira.ud1.bucles;

import java.util.Scanner;

/**
 *Haz un programa que permita calcular la suma de pares de números. 
 *Pedirá dos números al usuario y mostrará su suma, volviendo a repetir 
 *hasta que ambos números introducidos sean 0.
 */

public class Ejercicio03DoWhile3 {

	public static void main(String[] args) {

    int a ;
    int b ;
    Scanner entrada; 
	
    entrada = new Scanner(System.in);
    
    do {
    	System.out.println("Introduce a");
    	a = entrada.nextInt();
    	
    	System.out.println("Introduce b");
    	b = entrada.nextInt();

		if((a != 0) || (b != 0)) {System.out.println("La suma es " + (a+b));}
	} while ((a != 0) || (b != 0));
		
	    System.out.println("Fin del programa");
	    entrada.close();

    
	}
}
