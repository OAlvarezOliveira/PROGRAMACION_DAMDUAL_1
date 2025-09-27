/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @version 1.0
 * File: Ejercicio25.java
 */

package com.acarballeira.ud2.condicionales;
import java.util.Scanner;

/**
Dados tres números enteros distintos ingresados por teclado,
determinar y mostrar el número que ocupa la posición del centro,
al ordenarlos de menor a mayor.
 */
public class Ejercicio25 {

    public static void main(String[] args) {

        // Declaración de variables
        int a, b, c, centro;

        // Inicialización
        a = b = c = centro = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número (a): ");
        a = scanner.nextInt();

        System.out.print("Introduce el segundo número (b): ");
        b = scanner.nextInt();

        System.out.print("Introduce el tercer número (c): ");
        c = scanner.nextInt();

        // Operativa: determinar el número del centro
        if ((a > b && a < c) || (a < b && a > c)) {
            centro = a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            centro = b;
        } else {
            centro = c;
        }

        // Salida de información
        System.out.println("El número del centro es: " + centro);

        scanner.close();
    }
}


