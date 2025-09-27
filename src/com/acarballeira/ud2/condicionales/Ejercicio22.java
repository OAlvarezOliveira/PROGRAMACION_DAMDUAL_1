/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @version 1.0
 * File: Ejercicio22.java
 */

package com.acarballeira.ud2.condicionales;
import java.util.Scanner;

/**
Dados cuatro números reales, mostrar el mayor de ellos.
 */
public class Ejercicio22 {

    public static void main(String[] args) {

        // Declaración de variables
        double a, b, c, d, mayor;

        // Inicialización
        a = b = c = d = 0;
        mayor = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número real: ");
        a = scanner.nextDouble();

        System.out.print("Introduce el segundo número real: ");
        b = scanner.nextDouble();

        System.out.print("Introduce el tercer número real: ");
        c = scanner.nextDouble();

        System.out.print("Introduce el cuarto número real: ");
        d = scanner.nextDouble();

        // Operativa para encontrar el mayor
        mayor = a;

        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }
        if (d > mayor) {
            mayor = d;
        }

        // Salida de información
        System.out.println("El número mayor es: " + mayor);

        scanner.close();
    }
}

