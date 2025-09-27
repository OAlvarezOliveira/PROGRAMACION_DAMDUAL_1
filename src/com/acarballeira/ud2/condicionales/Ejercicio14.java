/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio14.java
 */

package com.acarballeira.ud2.condicionales;
import java.util.Scanner;

/**
Un año es bisiesto si es divisible por 4 y no por 100, 
o si es divisible por 400. 
Desarrolle un algoritmo donde se lea un año cualquiera 
y determine si es o fue bisiesto.
 */
public class Ejercicio14 {

    public static void main(String[] args) {

        // Declaración de variables
        int año;

        // Inicialización
        año = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un año (ej: 2024): ");
        año = scanner.nextInt();

        // Operativa y salida de información
        if ((año % 4 == 0) && (año % 100 != 0)) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            if (año % 400 == 0) {
                System.out.println("El año " + año + " es bisiesto.");
            } else {
                System.out.println("El año " + año + " no es bisiesto.");
            }
        }

        scanner.close();
    }
}


