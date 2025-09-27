/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @version 1.0
 * File: Ejercicio24.java
 */

package com.acarballeira.ud2.condicionales;
import java.util.Scanner;

/**
Dado tres números enteros, determinar si la suma de cualquier
pareja de ellos es igual al número restante.

Si se cumple la condición, escribir “Iguales”, en caso contrario “Distintos”.
 */
public class Ejercicio24 {

    public static void main(String[] args) {

        // Declaración de variables
        int a, b, c;

        // Inicialización
        a = b = c = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número (a): ");
        a = scanner.nextInt();

        System.out.print("Introduce el segundo número (b): ");
        b = scanner.nextInt();

        System.out.print("Introduce el tercer número (c): ");
        c = scanner.nextInt();

        // Operativa y salida de información
        if ((a + b == c) || (a + c == b) || (b + c == a)) {
            System.out.println("Iguales");
        } else {
            System.out.println("Distintos");
        }

        scanner.close();
    }
}


