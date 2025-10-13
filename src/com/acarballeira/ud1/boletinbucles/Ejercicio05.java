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
Leer una lista de números que finaliza 
cuando se ingresar el número 0 (cero), al
finalizar emitir el valor máximo de la lista, 
y la ubicación del máximo dentro de la
lista. (Suponer un único máximo). 
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int maximo = Integer.MIN_VALUE;
        int posicionMax = 0;
        int contador = 0;

        do {
            System.out.print("Ingrese el valor a almacenar (0 para terminar): ");
            num = sc.nextInt();

            if (num != 0) {
                contador++;

                if (num > maximo) {
                    maximo = num;
                    posicionMax = contador;
                }

                System.out.println("Número ingresado: " + num);
                System.out.println("Máximo acumulado: " + maximo);
                System.out.println("Posición del máximo: " + posicionMax);
            }

        } while (num != 0);

        if (maximo == Integer.MIN_VALUE) {
            System.out.println("No se ingresaron números válidos.");
        } else {
            System.out.println("\nMáximo de la lista: " + maximo);
            System.out.println("Ubicación del máximo: " + posicionMax);
        }

        System.out.println("Fin del programa. Has ingresado 0.");
        sc.close();
    }
}