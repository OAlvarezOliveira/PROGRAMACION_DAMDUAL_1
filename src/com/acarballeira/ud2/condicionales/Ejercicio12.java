/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio12.java
 */

package com.acarballeira.ud2.condicionales;
import java.util.Scanner;

/**
Diseñe un algoritmo que permita ingresar la hora actual del día 
en tres variables (hh, mm y ss) y determine cuántas horas, minutos 
y segundos restan para las 23:59:00.
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        // Declaración de variables
        int hh, mm, ss;
        int rh, rm, rs; // variables restantes

        // Inicialización
        hh = mm = ss = 0;
        rh = rm = rs = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la hora actual (hh): ");
        hh = scanner.nextInt();

        System.out.print("Introduce los minutos actuales (mm): ");
        mm = scanner.nextInt();

        System.out.print("Introduce los segundos actuales (ss): ");
        ss = scanner.nextInt();

        // Operativa
        if (ss <= 59) {
            rs = 0 - ss;
            if (rs < 0) {
                rs = 60 + rs;
                mm = mm + 1;
            }
        }

        if (mm <= 59) {
            rm = 59 - mm;
            if (ss > 0) {
                rm = rm - 1;
            }
        }

        if (hh <= 23) {
            rh = 23 - hh;
            if (mm > 59 || ss > 0) {
                rh = rh - 1;
            }
        }

        // Salida de información
        System.out.printf("Tiempo restante hasta las 23:59:00 → %02d:%02d:%02d\n", rh, rm, rs);

        scanner.close();
    }
}

