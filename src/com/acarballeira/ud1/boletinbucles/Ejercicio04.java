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
Leer una lista de números que finaliza cuando se ingresar el 
número 0 (cero), al finalizar emitir el valor 
mínimo de la lista.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int maximo = Integer.MIN_VALUE;

        do {
            System.out.print("Ingrese un valor (0 para terminar): ");
            num = sc.nextInt();

            if (num != 0 && num > maximo) {
                maximo = num;
                System.out.println("Número ingresado: " + num);
                System.out.println("Máximo acumulado: " + maximo);
            }

        } while (num != 0);

        if (maximo == Integer.MIN_VALUE) {
            System.out.println("No se ingresaron números válidos.");
        } else {
            System.out.println("\nMáximo de la lista: " + maximo);
        }

        System.out.println("Fin del programa. Has ingresado 0.");
        sc.close();
    }
}