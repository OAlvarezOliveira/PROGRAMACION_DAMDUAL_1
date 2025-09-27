/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01.java
 */

package com.acarballeira.ud2.condicionales;
import java.util.Scanner;


/**
 Escriba un algoritmo que determine 
 si un número ingresado es positivo, negativo o cero.

 */
public class Ejercicio01 {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {

	        // Declaración de variables
	        int numero;

	        // Inicialización
	        numero = 0;

	        // Entrada de datos
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce un número entero: ");
	        numero = scanner.nextInt();
	        scanner.close();

	        // Operativa
	        if (numero > 0) {
	            // Salida de información
	            System.out.println("El número es positivo.");
	        } else {
	            if (numero < 0) {
	                // Salida de información
	                System.out.println("El número es negativo.");
	            } else {
	                // Salida de información
	                System.out.println("El número es cero.");
	            }
	        }

	    }

}
