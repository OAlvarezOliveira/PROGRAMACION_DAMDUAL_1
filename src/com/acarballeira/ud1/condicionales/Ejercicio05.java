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
Escriba un algoritmo capaz de encontrar el 
máximo de dos valores (M y N)

 */
public class Ejercicio05 {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {

	        // Declaración de variables
	        int m, n, maximo;

	        // Inicialización
	        m = 0;
	        n = 0;
	        maximo = 0;

	        // Entrada de datos
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce el valor de m: ");
	        m = scanner.nextInt();

	        System.out.print("Introduce el valor de n: ");
	        n = scanner.nextInt();

	        // Operativa
	        if (m > n) {
	            maximo = m;
	        } else {
	            maximo = n;
	        }

	        // Salida de información
	        System.out.println("El valor máximo es: " + maximo);

	        scanner.close();
	    }
}
