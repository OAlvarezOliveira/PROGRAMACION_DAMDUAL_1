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
        int anio;

        // Inicialización
        anio = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un año (ej: 2024): ");
        anio = scanner.nextInt();
        scanner.close();

        // Operativa y salida de información
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        }  else {
                System.out.println("El año " + anio + " no es bisiesto.");
            }
        }

    }


