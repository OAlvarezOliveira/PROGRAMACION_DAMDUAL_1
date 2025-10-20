/**
 * 
 */
package pruebas;

import java.util.Scanner;

/**
 * Resolucion de la tarea 99.1 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

/*
 * Elaborar un programa en Java que solicite un número por teclado y calcule su factorial. 
 * El factorial de un número entero positivo n (se escribe como n!) se calcula multiplicando 
 * todos los números enteros desde 1 hasta n. 
 * P.e: el factorial de 5 = 5 x 4 x 3 x 2 x 1. Tener en cuenta que el factorial de 0 es 1. 
 */

public class Factorial {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, fact = 1;

        System.out.print("Introduce un número: ");
        x = entrada.nextInt();

        if (x < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            for (int i = 1; i <= x; i++) {
                fact = fact * i;
            }
            System.out.println("El factorial de " + x + " es: " + fact);
        }
    }
}