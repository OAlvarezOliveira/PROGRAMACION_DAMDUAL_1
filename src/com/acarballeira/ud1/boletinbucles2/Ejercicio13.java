/**
 * Resolucion de la tarea 13 boletin bucles 2
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio12.java
 */

package com.acarballeira.ud1.boletinbucles2;
import java.util.Scanner;

/**
Pedir un número por teclado y dibujar un cuadrado hueco de esa dimensión.
*/

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la dimensión del cuadrado: ");
        int n = entrada.nextInt();

        // Bucle exterior: filas
        for (int i = 1; i <= n; i++) {

            // Bucle interior: columnas
            for (int j = 1; j <= n; j++) {

               //borde
                if ( i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println(); // salto de línea al final de cada fila
        }

        entrada.close();
    }
}


