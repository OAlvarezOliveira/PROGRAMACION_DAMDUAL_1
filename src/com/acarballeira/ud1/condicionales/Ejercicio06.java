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
máximo de tres valores (R, S y T).


 */
public class Ejercicio06 {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {

	        // Declaración de variables
	        int r, s, t, maximo;

	        // Inicialización
	        r = 0;
	        s = 0;
	        t = 0;
	        maximo = 0;

	        // Entrada de datos
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce el valor de r: ");
	        r = scanner.nextInt();

	        System.out.print("Introduce el valor de s: ");
	        s = scanner.nextInt();

	        System.out.print("Introduce el valor de t: ");
	        t = scanner.nextInt();

	        // Operativa
	        if (r >= s) {
	            if (r >= t) {
	                maximo = r;
	            } else {
	                maximo = t;
	            }
	        } else {
	            if (s >= t) {
	                maximo = s;
	            } else {
	                maximo = t;
	            }
	        }

	        // Salida de información
	        System.out.println("El valor máximo es: " + maximo);

	        scanner.close();
	    }
}
