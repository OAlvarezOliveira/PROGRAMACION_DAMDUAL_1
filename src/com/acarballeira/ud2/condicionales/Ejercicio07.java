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
