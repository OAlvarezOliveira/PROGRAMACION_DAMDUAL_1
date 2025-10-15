/**
 * Resolucion de la tarea
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio02.java
 */

package com.acarballeira.ud1.boletinbucles2;

import java.util.Scanner;

/**
 * Programa que recopile las edades de todos los alumnos matriculados y 
 * muestre la media de edad, la edad máxima y la edad mínima.  
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        int maxEdad = 0;
        int minEdad = Integer.MAX_VALUE;
        int contAlum = 0;
        int suma = 0;
        double resultado = 0;

        do {
            System.out.print("Introduce una edad del alumno (0 para finalizar): ");
            x = entrada.nextInt();

            if (x != 0) {
                contAlum++;
                suma += x;

                if (x > maxEdad) {
                    maxEdad = x;
                }
                if (x < minEdad) {
                    minEdad = x;
                }
            }

        } while (x != 0);

        if (contAlum > 0) {
            resultado = (double) suma / contAlum;

            System.out.println("El alumno mayor tiene " + maxEdad + " años.");
            System.out.println("El alumno menor tiene " + minEdad + " años.");
            System.out.printf("La media de edad es de %.2f años.%n", resultado);
        } else {
            System.out.println("No se introdujeron edades.");
        }

        System.out.println("Has introducido 0. Programa finalizado.");
        entrada.close();
    }
}
