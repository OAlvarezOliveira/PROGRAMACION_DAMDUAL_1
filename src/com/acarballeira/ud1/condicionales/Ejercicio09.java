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
Se tiene como datos 4 valores numéricos enteros distintos. 
Calcular y mostrar la suma del mayor número y el menor número 
de los 4 dados.

 */
public class Ejercicio09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        // Declaración de variables
        int a, b, c, d;
        int mayor, menor, suma;

        // Inicialización
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        mayor = 0;
        menor = 0;
        suma = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de a: ");
        a = scanner.nextInt();

        System.out.print("Introduce el valor de b: ");
        b = scanner.nextInt();

        System.out.print("Introduce el valor de c: ");
        c = scanner.nextInt();

        System.out.print("Introduce el valor de d: ");
        d = scanner.nextInt();

        // Operativa para encontrar el mayor
        if (a > b) {
            if (a > c) {
                if (a > d) {
                    mayor = a;
                } else {
                    mayor = d;
                }
            } else {
                if (c > d) {
                    mayor = c;
                } else {
                    mayor = d;
                }
            }
        } else {
            if (b > c) {
                if (b > d) {
                    mayor = b;
                } else {
                    mayor = d;
                }
            } else {
                if (c > d) {
                    mayor = c;
                } else {
                    mayor = d;
                }
            }
        }

        // Operativa para encontrar el menor
        if (a < b) {
            if (a < c) {
                if (a < d) {
                    menor = a;
                } else {
                    menor = d;
                }
            } else {
                if (c < d) {
                    menor = c;
                } else {
                    menor = d;
                }
            }
        } else {
            if (b < c) {
                if (b < d) {
                    menor = b;
                } else {
                    menor = d;
                }
            } else {
                if (c < d) {
                    menor = c;
                } else {
                    menor = d;
                }
            }
        }

        // Calcular suma
        suma = mayor + menor;

        // Salida de información
        System.out.println("La suma del mayor y el menor número es: " + suma);

        scanner.close();
    }
}
