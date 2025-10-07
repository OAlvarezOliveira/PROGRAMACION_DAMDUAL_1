/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01.java
 */

package com.acarballeira.ud1.condicionales;
import java.util.Scanner;


/**
Escriba un algoritmo que permita leer dos valores 
numéricos A y B. Si A es mayor que B debe realizar 
la suma de ambos, caso contrario, se hace el producto.

 */
public class Ejercicio03 {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {

	        // Declaración de variables
	        double a, b, c, d, e, promedio;

	        // Inicialización
	        a = 0;
	        b = 0;
	        c = 0;
	        d = 0;
	        e = 0;
	        promedio = 0;

	        // Entrada de datos
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce el valor de a: ");
	        a = scanner.nextDouble();

	        System.out.print("Introduce el valor de b: ");
	        b = scanner.nextDouble();

	        System.out.print("Introduce el valor de c: ");
	        c = scanner.nextDouble();

	        System.out.print("Introduce el valor de d: ");
	        d = scanner.nextDouble();

	        System.out.print("Introduce el valor de e: ");
	        e = scanner.nextDouble();

	        // Operativa
	        promedio = (a + b + c + d + e) / 5;

	        // Salida de información
	        if (promedio >= 10) {
	            System.out.println("El promedio es mayor o igual a 10.");
	        } else {
	            System.out.println("El promedio es menor que 10.");
	        }

	        scanner.close();
	    }
}
