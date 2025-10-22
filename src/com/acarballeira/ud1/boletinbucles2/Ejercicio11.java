/**
 * Resolucion de la tarea 11 boletin bucles 2
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
 * Programa que convierta un número en binario a su representación decimal.
 */
public class Ejercicio11 {

    public static void main(String[] args) {

        // Declaración
        String binario;
        int decimal;
        int potencia;
        Scanner entrada;
        
        
        //Inicializacion
        decimal = 0;
        potencia = 1; // empieza en 2^0 = 1
        entrada = new Scanner(System.in);
        
        // Entrada
        System.out.print("Introduce un número binario: ");
        binario = entrada.nextLine();

        // Proceso
        for (int i = binario.length() - 1; i >= 0; i--) {
            char bit = binario.charAt(i);
            if (bit == '1') {
                decimal += potencia;
            }
            potencia *= 2;
        }

        // Salida
        System.out.println("El número en decimal es: " + decimal);

        entrada.close();
    }
}

