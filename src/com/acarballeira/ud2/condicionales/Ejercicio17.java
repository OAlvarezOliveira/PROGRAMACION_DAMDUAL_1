/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio17.java
 */

package com.acarballeira.ud2.condicionales;
import java.util.Scanner;

/**
Diseñe un algoritmo que lea tres longitudes y determine si forman o no un triángulo.
Si es un triángulo, determine de qué tipo se trata:
- equilátero: tres lados iguales
- isósceles: dos lados iguales
- escaleno: tres lados desiguales

Nota: Para formar un triángulo, el lado mayor debe ser menor que la suma de los otros dos.
 */
public class Ejercicio17 {

    public static void main(String[] args) {

        // Declaración de variables
        double a, b, c;
        double mayor;

        // Inicialización
        a = b = c = 0;
        mayor = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la longitud del primer lado: ");
        a = scanner.nextDouble();

        System.out.print("Introduce la longitud del segundo lado: ");
        b = scanner.nextDouble();

        System.out.print("Introduce la longitud del tercer lado: ");
        c = scanner.nextDouble();

        // Determinar el lado mayor
        mayor = a;
        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }

        // Verificar si se puede formar un triángulo
        if ((a + b + c - mayor) > mayor) {

            // Si es triángulo, determinar el tipo
            if (a == b && b == c) {
                System.out.println("Es un triángulo equilátero.");
            } else {
                if (a == b || a == c || b == c) {
                    System.out.println("Es un triángulo isósceles.");
                } else {
                    System.out.println("Es un triángulo escaleno.");
                }
            }

        } else {
            System.out.println("Las longitudes no forman un triángulo.");
        }

        scanner.close();
    }
}

