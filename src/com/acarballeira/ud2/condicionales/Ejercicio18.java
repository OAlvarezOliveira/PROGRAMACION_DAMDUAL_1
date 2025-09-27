/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio18.java
 */

package com.acarballeira.ud2.condicionales;
import java.util.Scanner;

/**
Ingresar un número c y determinar si pertenece al intervalo [a, b], 
donde a y b también son ingresados por teclado.
 */
public class Ejercicio18 {

    public static void main(String[] args) {

        // Declaración de variables
        double a, b, c;
        double menor, mayor;

        // Inicialización
        a = b = c = 0;
        menor = mayor = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de a: ");
        a = scanner.nextDouble();

        System.out.print("Introduce el valor de b: ");
        b = scanner.nextDouble();

        System.out.print("Introduce el número c: ");
        c = scanner.nextDouble();

        // Determinar el menor y mayor (por si a > b)
        if (a < b) {
            menor = a;
            mayor = b;
        } else {
            menor = b;
            mayor = a;
        }

        // Verificar si c pertenece al intervalo [a, b]
        if (c >= menor && c <= mayor) {
            System.out.println("El número " + c + " pertenece al intervalo [" + menor + ", " + mayor + "].");
        } else {
            System.out.println("El número " + c + " no pertenece al intervalo [" + menor + ", " + mayor + "].");
        }

        scanner.close();
    }
}

