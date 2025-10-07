/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @version 1.0
 * File: Ejercicio23.java
 */

package com.acarballeira.ud1.condicionales;
import java.util.Scanner;

/**
Teniendo como dato una temperatura en grados Celsius,
indicar el estado físico del agua a esa temperatura y
a 760 mm de presión atmosférica:

- sólido (≤ 0 °C)
- líquido (> 0 °C y ≤ 100 °C)
- gaseoso (> 100 °C)
 */
public class Ejercicio23 {

    public static void main(String[] args) {

        // Declaración de variables
        double temperatura;

        // Inicialización
        temperatura = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la temperatura en grados Celsius: ");
        temperatura = scanner.nextDouble();

        // Operativa y salida de información
        if (temperatura <= 0) {
            System.out.println("El estado físico del agua es: sólido");
        } else {
            if (temperatura <= 100) {
                System.out.println("El estado físico del agua es: líquido");
            } else {
                System.out.println("El estado físico del agua es: gaseoso");
            }
        }

        scanner.close();
    }
}

