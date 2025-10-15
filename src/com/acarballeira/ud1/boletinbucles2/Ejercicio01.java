/**
 * Resolucion de la tarea
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01.java
 */

package com.acarballeira.ud1.boletinbucles2;

import java.util.Scanner;

/**
 * Programa que pida números hasta que el usuario introduzca un cero. 
 * Para cada número indicar si es par/impar, mayor/menor/igual a cero y su cuadrado.
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;

        do {
            System.out.print("Introduce un número (0 para finalizar): ");
            x = entrada.nextInt();

            if (x != 0) {
                // Par o impar
                if (x % 2 == 0) {
                    System.out.println(x + " es par.");
                } else {
                    System.out.println(x + " es impar.");
                }

                // Comparación con cero
                if (x > 0) {
                    System.out.println(x + " es mayor que 0.");
                } else if (x < 0) {
                    System.out.println(x + " es menor que 0.");
                } else {
                    System.out.println(x + " es igual a 0.");
                }

                // Cuadrado
                System.out.println("El cuadrado de " + x + " es: " + (x * x));
                System.out.println("----------------------------");
            }

        } while (x != 0);

        System.out.println("Has introducido 0. Programa finalizado.");
        entrada.close();
    }
}

