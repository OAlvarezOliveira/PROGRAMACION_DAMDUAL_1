/**
 * Resolución de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio11.java
 */

/*
 Programa que pida un número en el rango [1-99] 
 y lo imprima en letras: Ej 56 -> cincuenta y seis  
*/

package com.acarballeira.ud1.condicionales2;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        // Declaración de variables
        int x;
        String texto = "";

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero entre 1 y 99: ");
        x = scanner.nextInt();
        scanner.close();
        
        //Operativa
        if (x < 1 || x > 99) {
            System.out.println("Número fuera de rango.");
        } else {
            if (x < 30) {
                String[] unidades = {
                    "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve",
                    "diez", "once", "doce", "trece", "catorce", "quince",
                    "dieciséis", "diecisiete", "dieciocho", "diecinueve",
                    "veinte", "veintiuno", "veintidós", "veintitrés", "veinticuatro", 
                    "veinticinco", "veintiséis", "veintisiete", "veintiocho", "veintinueve"
                };
                texto = unidades[x];
            } else {
                String[] decenas = {
                    "", "", "", "treinta", "cuarenta", "cincuenta",
                    "sesenta", "setenta", "ochenta", "noventa"
                };
                int decena = x / 10;
                int unidad = x % 10;

                texto = decenas[decena];
                if (unidad != 0) {
                    String[] unidades = {
                        "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"
                    };
                    texto += " y " + unidades[unidad];
                }
            }

            // Salida
            System.out.println("Número en letras: " + texto);
        }


    }
}