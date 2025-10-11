/**
 * Resolución de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01DoWhile.java
 */

package com.acarballeira.ud1.bucles;

/**
 * Imprimir los números impares entre 1 y 10 usando do...while
 */

public class Ejercicio01DoWhile {

    public static void main(String[] args) {

        int i = 1;

        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i < 10);
    }
}

