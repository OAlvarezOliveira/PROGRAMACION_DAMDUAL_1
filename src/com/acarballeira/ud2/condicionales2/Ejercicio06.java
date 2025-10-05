/**
 * Resolución de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio05.java
 */

package com.acarballeira.ud2.condicionales2;
import java.util.Scanner;

/**
Pedir dos números (pueden ser iguales) y mostrar cual es mayor. .
 */
public class Ejercicio06 {

    public static void main(String[] args) {

        // Declaración de variables
        double num1 = 0;
        double num2 = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("🔹 Introduce el primer número a comparar: ");
        num1 = scanner.nextDouble();
        System.out.print("🔹 Introduce el segundo número: ");
        num2 = scanner.nextDouble();
        scanner.close();

        //Operativa
        if (num1 == num2) {
            System.out.println("⚠️ Los números introducidos son iguales.");
        } else if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else {
            System.out.println(num2 + " es mayor que " + num1);
        }
    }
}

