/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio07.java
 */

package com.acarballeira.ud1.condicionales;
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

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de a: ");
        a = scanner.nextInt();

        System.out.print("Introduce el valor de b: ");
        b = scanner.nextInt();

        System.out.print("Introduce el valor de c: ");
        c = scanner.nextInt();

        // Variables auxiliares para ordenamiento
        int mayor, medio, menor;

        // Operativa para ordenar los tres números
        if (a > b && a > c) {
            mayor = a;
            if (b > c) {
                medio = b;
                menor = c;
            } else {
                medio = c;
                menor = b;
            }
        } else if (b > a && b > c) {
            mayor = b;
            if (a > c) {
                medio = a;
                menor = c;
            } else {
                medio = c;
                menor = a;
            }
        } else {
            mayor = c;
            if (a > b) {
                medio = a;
                menor = b;
            } else {
                medio = b;
                menor = a;
            }
        }

        // Salida de información
        System.out.println("Orden de mayor a menor: " + mayor + ", " + medio + ", " + menor);
        System.out.println("Orden de menor a mayor: " + menor + ", " + medio + ", " + mayor);

        scanner.close();
    }
}
