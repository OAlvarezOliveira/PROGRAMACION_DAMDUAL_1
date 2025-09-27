/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @version 1.0
 * File: Ejercicio27.java
 */

package com.acarballeira.ud2.condicionales;
import java.util.Scanner;

/**
Ingresar un número de mes válido y un año.
Mostrar la cantidad de días que puede tener ese mes,
considerando si el año es bisiesto o no.
 */
public class Ejercicio27 {

    public static void main(String[] args) {

        // Declaración de variables
        int mes, año, dias;

        // Inicialización
        mes = año = dias = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número del mes (1–12): ");
        mes = scanner.nextInt();

        System.out.print("Introduce el año: ");
        año = scanner.nextInt();

        // Operativa: determinar los días del mes
        if (mes >= 1 && mes <= 12) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                dias = 31;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                dias = 30;
            } else if (mes == 2) {
                // Verificar si el año es bisiesto
                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
            }

            // Salida de información
            System.out.println("El mes " + mes + " del año " + año + " tiene " + dias + " días.");
        } else {
            System.out.println("Número de mes no válido.");
        }

        scanner.close();
    }
}
