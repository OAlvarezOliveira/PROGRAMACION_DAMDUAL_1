/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01While.java
 */

package com.acarballeira.ud1.buclesfor;

import java.util.Scanner;

/*
Dibuja un triángulo creciente de asteriscos, 
del tamaño que indique el usuario.
 */

public class Ejercicio08 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño del triángulo: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
        	
            // Imprimir espacios
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos con espacio
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Saltar a la siguiente línea
            System.out.println();
        }

        scanner.close();
    }
}
