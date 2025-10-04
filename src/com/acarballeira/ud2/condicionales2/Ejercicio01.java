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
 Pedir un número por teclado e indicar si es o no par.  

 */
public class Ejercicio01 {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {

	        // Declaración de variables
	        int numero;
	        double esPar;

	        // Inicialización
	        numero = 0;
	        esPar = 0;

	        // Entrada de datos
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce un número entero: ");
	        numero = scanner.nextInt();
	        scanner.close();
	        
	        esPar = numero % 2 ;

	        if (esPar !=0 ) {
	        	
		      System.out.print( numero + " " + "es impar");

				
			} else {
				
		      System.out.print(numero + " " + "es par");

			}
	        
	        
	        }

	    }
