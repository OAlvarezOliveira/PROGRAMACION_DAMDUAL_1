/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01.java
 */

package com.acarballeira.ud1.condicionales2;
import java.util.Scanner;


/**
Pedir dos números enteros e indicar que cantidad hay que 
sumarle al primero para que sea múltiplo del segundo.    
*/
public class Ejercicio03 {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {

	        // Declaración de variables
	        int num1;
	        int num2;
	        int faltan;


	        // Inicialización
	        num1 = 0;
	        num2 = 0;
	        faltan = 0;

	        // Entrada de datos
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce un número entero: ");
	        num1 = scanner.nextInt();
	        System.out.print("Introduce un número entero que deseas comprobar como multiplo: ");
	        num2 = scanner.nextInt();
	        scanner.close();	
	        


	        if (num1 % num2 == 0 ) {
	        	
		      System.out.print(  num1  + " " + "es multiplo de" + " " + num2 );

				
			} else {
				
			  faltan = num2 - (num1 % num2);
		      System.out.print("Faltan " + faltan + 
		                " unidades para que " + num1 + " sea múltiplo de " + num2);

			}
	        
	        
	        }

	    }
