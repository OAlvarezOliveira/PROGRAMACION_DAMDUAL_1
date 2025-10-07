/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio10.java
 */

package com.acarballeira.ud1.condicionales;
import java.util.Scanner;

/**
Desarrollar un algoritmo que permita realizar la suma de dos horas distintas 
(HH, MM, SS). Tener en cuenta que si la hora supera 24 se debe contar un día.
*/
public class Ejercicio10 {

    public static void main(String[] args) {

        // Declaración de variables
        int h1, m1, s1;
        int h2, m2, s2;
        int hs, ms, ss;
        int dias;

        // Inicialización
        h1 = m1 = s1 = 0;
        h2 = m2 = s2 = 0;
        hs = ms = ss = 0;
        dias = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la primera hora:");
        System.out.print("Horas: ");
        h1 = scanner.nextInt();
        System.out.print("Minutos: ");
        m1 = scanner.nextInt();
        System.out.print("Segundos: ");
        s1 = scanner.nextInt();

        System.out.println("Introduce la segunda hora:");
        System.out.print("Horas: ");
        h2 = scanner.nextInt();
        System.out.print("Minutos: ");
        m2 = scanner.nextInt();
        System.out.print("Segundos: ");
        s2 = scanner.nextInt();

        // Operativa: suma de segundos
        ss = s1 + s2;
        if (ss >= 60) {
            ss = ss - 60;
            ms = 1;
        } else {
            ms = 0;
        }

        // Suma de minutos
        ms = ms + m1 + m2;
        if (ms >= 60) {
            ms = ms - 60;
            hs = 1;
        } else {
            hs = 0;
        }

        // Suma de horas
        hs = hs + h1 + h2;
        if (hs >= 24) {
            hs = hs - 24;
            dias = 1;
        } else {
            dias = 0;
        }

        // Salida de información
        System.out.println("Resultado de la suma:");
        System.out.printf("Hora: %02d:%02d:%02d\n", hs, ms, ss);

        if (dias == 1) {
            System.out.println("Se ha sumado un día.");
        }

        scanner.close();
    }
}

