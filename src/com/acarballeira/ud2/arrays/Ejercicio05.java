/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio5.java
 */

package com.acarballeira.ud2.arrays;

import java.util.Scanner;

/*
Crear una matriz de enteros de 3 filas x 3 columnas. Pedir por teclado el 
valor de la primera fila primera columna, segunda fila segunda columna y 
tercera fila tercera columna. Los valores a la derecha de los introducidos 
por teclado se rellenarán con potencias sucesivas
del número tecleado, comenzando por la potencia 2.
Los valores a la izquierda de los introducidos por teclado se rellenarán con 
el número a su derecha desplazado dos bits a la derecha.
 */

public class Ejercicio05 {


    public static void main(String[] args) {

        // Declarar Variables
        int[][] matriz;
        int dato;
        int potencia;
        int valorDerecha;
        int valorIzquierda;
        final int LONGITUD_FIL;
        final int LONGITUD_COL;
        Scanner teclado;

        // Inicializar Variables
        LONGITUD_COL = 3;
        LONGITUD_FIL = 3;
        potencia = 2;
        teclado = new Scanner(System.in);
        matriz = new int[LONGITUD_FIL][LONGITUD_COL];

        // ============================
        // ENTRADA F1 C1
        // ============================
        System.out.printf("Dame [0][0]: ");
        dato = teclado.nextInt();
        matriz[0][0] = dato;

        // DERECHA
        valorDerecha = (int) Math.pow(dato,potencia++);
        matriz[0][1] = valorDerecha;
       

        valorDerecha = (int) Math.pow(dato,potencia++);
        matriz[0][2] = valorDerecha;


        // ============================
        // ENTRADA F2 C2
        // ============================
        //reset potecia por cada fila
        potencia = 2;
   
        System.out.printf("Dame [1][1]: ");
        dato = teclado.nextInt();
        matriz[1][1] = dato;

        // DERECHA
        valorDerecha = (int) Math.pow(dato,potencia++);
        matriz[1][2] = valorDerecha;

        // IZQUIERDA
        valorIzquierda = valorDerecha >> 2;
        matriz[1][0] = valorIzquierda;

        // ============================
        // ENTRADA F3 C3
        // ============================
        //reset potecia por cada fila
        potencia = 2;
        System.out.printf("Dame [2][2]: ");
        dato = teclado.nextInt();
        matriz[2][2] = dato;

        // IZQUIERDA → primera posición
        valorIzquierda = dato >> 2;
        matriz[2][1] = valorIzquierda;

        // IZQUIERDA → segunda posición
        valorIzquierda = valorIzquierda >> 2;
        matriz[2][0] = valorIzquierda;

        // ============================
        // IMPRIMIR MATRIZ
        // ============================
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.printf("%03d ", elemento);
            }
            System.out.println();
        }

        teclado.close();
    }
}