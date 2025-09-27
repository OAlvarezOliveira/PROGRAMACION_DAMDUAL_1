/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @version 1.0
 * File: Ejercicio26.java
 */

package com.acarballeira.ud2.condicionales;
import java.util.Scanner;

/**
Siendo los datos tres enteros válidos que representan una fecha: dd, mm, aa,
se pide obtener y mostrar la fecha del día siguiente (sin librerías).
 */
public class Ejercicio26 {

    public static void main(String[] args) {

        // Declaración de variables
        int dd, mm, aa;
        int dias_mes;

        // Inicialización
        dd = mm = aa = 0;
        dias_mes = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el día (dd): ");
        dd = scanner.nextInt();

        System.out.print("Introduce el mes (mm): ");
        mm = scanner.nextInt();

        System.out.print("Introduce el año (aa): ");
        aa = scanner.nextInt();

        // Determinar número de días del mes
        if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
            dias_mes = 31;
        } else if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
            dias_mes = 30;
        } else if (mm == 2) {
            // Año bisiesto
            if ((aa % 4 == 0 && aa % 100 != 0) || (aa % 400 == 0)) {
                dias_mes = 29;
            } else {
                dias_mes = 28;
            }
        }

        // Calcular el día siguiente
        if (dd < dias_mes) {
            dd = dd + 1;
        } else {
            dd = 1;
            if (mm < 12) {
                mm = mm + 1;
            } else {
                mm = 1;
                aa = aa + 1;
            }
        }

        // Salida de información
        System.out.printf("La fecha del día siguiente es: %02d/%02d/%04d\n", dd, mm, aa);

        scanner.close();
    }
}
