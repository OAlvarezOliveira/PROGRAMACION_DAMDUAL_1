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
Escriba un algoritmo que permita leer dos valores 
numéricos A y B. Si A es mayor que B debe realizar 
la suma de ambos, caso contrario, se hace el producto.

 */
public class Ejercicio02 {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {

	        // Declaración de variables
	        double A, B, resultado;

	        // Inicialización
	        A = 0;
	        B = 0;
	        resultado = 0;

	        // Entrada de datos
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce el valor de A: ");
	        A = scanner.nextDouble();
	        System.out.print("Introduce el valor de B: ");
	        B = scanner.nextDouble();

	        // Operativa
	        if (A > B) {
	            resultado = A + B;
	        } else {
	            resultado = A * B;
	        }

	        // Salida de información
	        System.out.println("El resultado es: " + resultado);

	        scanner.close();
	    }



}
