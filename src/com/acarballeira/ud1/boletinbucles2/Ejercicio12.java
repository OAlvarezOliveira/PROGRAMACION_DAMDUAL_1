/**
 * Resolucion de la tarea 12 boletin bucles 2
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio12.java
 */
package com.acarballeira.ud1.boletinbucles2;
import java.util.Scanner;

/**
 * Dibuja el triángulo de Pascal para n filas (n introducido por teclado).
 */
public class Ejercicio12 {

    static int factorial(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {

        int altura;
        int valor;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número de filas del triángulo de Pascal a dibujar: ");
        altura = entrada.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                valor = factorial(i) / (factorial(j) * factorial(i - j));
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        entrada.close();
    }
}

