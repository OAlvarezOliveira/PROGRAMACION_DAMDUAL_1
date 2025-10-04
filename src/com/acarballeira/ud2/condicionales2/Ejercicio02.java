/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01.java
 */

package com.acarballeira.ud2.condicionales2;
import java.util.Scanner;


/**
Pedir un número entero e indicar que cantidad
 hay que sumarle para que sea múltiplo de 7.  
*/
public class Ejercicio02 {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {

	        // Declaración de variables
	        int numero;
	        int faltan;


	        // Inicialización
	        numero = 0;
	        faltan = 0;

	        // Entrada de datos
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce un número entero: ");
	        numero = scanner.nextInt();
	        scanner.close();	
	        


	        if (numero % 7 == 0 ) {
	        	
		      System.out.print(  numero + " " + "es multiplo de 7" );

				
			} else {
				
			  faltan = 7 - (numero % 7);
		      System.out.print("Faltan " + faltan + " unidades para ser multiplo de 7");

			}
	        
	        
	        }

	    }
