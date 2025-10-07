/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @version 1.0
 * File: Ejercicio21.java
 */

package com.acarballeira.ud1.condicionales;
import java.util.Scanner;

/**
Dados dos números reales, mostrar el mayor de ellos.
Si ambos son iguales, indicarlo.
 */
public class Ejercicio21 {

    public static void main(String[] args) {

        // Declaración de variables
        double x, y;

        // Inicialización
        x = 0;
        y = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número real (x): ");
        x = scanner.nextDouble();

        System.out.print("Introduce el segundo número real (y): ");
        y = scanner.nextDouble();

        // Operativa y salida de información
        if (x > y) {
            System.out.println("El número mayor es: " + x);
        } else {
            if (y > x) {
                System.out.println("El número mayor es: " + y);
            } else {
                System.out.println("Ambos números son iguales.");
            }
        }

        scanner.close();
    }
}



