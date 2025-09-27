/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio13.java
 */

package com.acarballeira.ud2.condicionales;
import java.util.Scanner;

/**
Diseñe un algoritmo que permita ingresar dos valores x e y, 
luego determine qué porcentaje es x de y.
 */
public class Ejercicio13 {

    public static void main(String[] args) {

        // Declaración de variables
        double x, y, porcentaje;

        // Inicialización
        x = 0;
        y = 0;
        porcentaje = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de x: ");
        x = scanner.nextDouble();

        System.out.print("Introduce el valor de y: ");
        y = scanner.nextDouble();

        // Operativa y salida de información
        if (y != 0) {
            porcentaje = (x * 100) / y;
            System.out.printf("x es el %.2f%% de y.\n", porcentaje);
        } else {
            System.out.println("No se puede calcular el porcentaje porque y es cero.");
        }

        scanner.close();
    }
}


