/**
 * Resolución de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio06.java
 */

package com.acarballeira.ud2.condicionales2;

import java.util.Scanner;

/**
Pedir un número en el rango [0-9999] e indicar si es o no capicúa.  
 */
public class Ejercicio11_StringBuilder {

	public static void main(String[] args) {

		// Declaración de variables
		String numero;	
		String capicua;


		// Entrada de datos
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdece el numero a comprobar: ");
		numero = scanner.nextLine();
        scanner.close();


        capicua = new StringBuilder(numero).reverse().toString();


        if (numero.equals(capicua)) {
        	
            System.out.println("El número " + numero + " es capicúa.");
        }

       else {
    	   
           System.out.println("El número " + numero + " no es capicúa.");
           
        }

    }

}
