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
Escribir un algoritmo que permita ingresar tres números 
distintos entre sí y los muestre en pantalla ordenados de mayor 
a menor y de menor a mayor.

 */
public class Ejercicio07 {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {

	        // Declaración de variables
	        int a, b, c;

	        // Inicialización
	        a = 0;
	        b = 0;
	        c = 0;

	        // Entrada de datos
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce el valor de r: ");
	        a = scanner.nextInt();

	        System.out.print("Introduce el valor de s: ");
	        b = scanner.nextInt();

	        System.out.print("Introduce el valor de t: ");
	        c = scanner.nextInt();

	        // Operativa
	        if (a >= b && b >= c) {
	          
	        }

	        // Salida de información
	        System.out.println(" Orden de mayor a menor es: ");
	        System.out.println(" Orden de menor a mayor es: ");


	        scanner.close();
	    }
}
