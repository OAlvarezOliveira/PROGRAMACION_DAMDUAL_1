/**
 * Resolucion de la tarea
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio03.java
 */

package com.acarballeira.ud1.boletinbucles2;

import java.util.Scanner;

/**
 * Programa que recopile las edades de todos los alumnos matriculados y 
 * muestre la media de edad y el número de alumnos mayores de edad.  
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        int contAlum = 0;
        int contMayorEdad = 0;
        int suma = 0;
        double resultado = 0;

        do {
            System.out.print("Introduce una edad del alumno (0 para finalizar): ");
            x = entrada.nextInt();

            if (x != 0) {
                contAlum++;
                suma += x;

                if (x >= 18) {
                    contMayorEdad++;
                }
            }

        } while (x != 0);

        if (contAlum > 0) {
            resultado = (double) suma / contAlum;

            System.out.println("Hay " + contMayorEdad + " alumnos mayores de edad.");
            System.out.printf("La media de edad es de %.2f años.%n", resultado);
        } else {
            System.out.println("No se introdujeron edades.");
        }

        System.out.println("Programa finalizado. Has introducido 0.");
        entrada.close();
    }
}

