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
Se tienen los siguientes datos sobre nacimientos en una ciudad: 
sexo (“F” ó “M”) y fecha de nacimiento (DD y MM). 
Se pide realizar un algoritmo que informe cuántos son varones y 
cuántas son mujeres, cuántos nacimientos
hubo en el primer semestre y cuántos en el segundo. 
El final de lectura de datos viene dado por una lectura del sexo en blanco.
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sex;
        int dia, mes;
        int women = 0, men = 0;
        int born1semester = 0, born2semester = 0;

        System.out.println("=== Registro de Nacimientos ===");

        do {
            System.out.print("\nIntroduce sexo del bebé (F/M o Enter para salir): ");
            sex = sc.nextLine();

            // si el usuario pulsa Enter (cadena vacía), el bucle termina sin perder datos anteriores
            if (!sex.isEmpty()) {
                System.out.print("Introduce día de nacimiento: ");
                dia = sc.nextInt();

                System.out.print("Introduce mes de nacimiento: ");
                mes = sc.nextInt();
                sc.nextLine(); // limpiar salto de línea

                // clasificar por sexo
                if (sex.equalsIgnoreCase("F")) {
                    women++;
                } else if (sex.equalsIgnoreCase("M")) {
                    men++;
                }

                // clasificar por semestre
                if (mes >= 1 && mes <= 6) {
                    born1semester++;
                } else if (mes >= 7 && mes <= 12) {
                    born2semester++;
                }
            }

        } while (!sex.isEmpty()); // condición se evalúa después → no se pierde el primer registro

        // resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Primer semestre: " + born1semester + " nacimientos");
        System.out.println("Segundo semestre: " + born2semester + " nacimientos");
        System.out.println("Total mujeres: " + women);
        System.out.println("Total varones: " + men);

        System.out.println("\nFin del programa.");
        sc.close();
    }
}
