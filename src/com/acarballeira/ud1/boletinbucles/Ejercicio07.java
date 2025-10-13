/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01.java
 */

package com.acarballeira.ud1.boletinbucles;

import java.util.Scanner;

/*
Diseñar el algoritmo para resolver una ecuación de segundo grado. 
El algoritmo deberá ingresar A, B y C e ir ingresando x. 
El programa finaliza cuando ingresa x = 99
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x, resultado;

        // Leer coeficientes
        System.out.print("Ingrese el valor de A: ");
        a = sc.nextDouble();
        System.out.print("Ingrese el valor de A: ");
        b = sc.nextDouble();
        System.out.print("Ingrese el valor de A: ");
        c = sc.nextDouble();

        // Repetir hasta que x = 99
        do {
            System.out.print("Ingrese un valor de x (99 para terminar): ");
            x = sc.nextDouble();

            if (x != 99) {
                resultado = a * Math.pow(x, 2) + b * x + c;
                System.out.println("f(" + x + ") = " + resultado);
            }

        } while (x != 99);

        System.out.println("Fin del programa. Has ingresado 99.");
        sc.close();
    }
}
