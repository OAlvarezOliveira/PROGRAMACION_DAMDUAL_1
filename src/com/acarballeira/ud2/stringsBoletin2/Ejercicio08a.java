package com.acarballeira.ud2.stringsBoletin2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Programa que lee una frase y visualiza cada palabra en columnas
 * seguida del número de letras usando StringTokenizer
 */
public class Ejercicio08a {

    public static void main(String[] args) {
        
        // Declarar variables
        String frase;
        Scanner entrada;
        StringTokenizer tokenizer;
        String palabra;
        int numLetras;
        
        // Inicializar
        entrada = new Scanner(System.in);
        
        // Toma de datos
        System.out.printf("Introduce una frase:%n");
        frase = entrada.nextLine();
        
        // Procesar con StringTokenizer
        tokenizer = new StringTokenizer(frase);
        
        System.out.printf("%n%-20s %s%n", "PALABRA", "Nº LETRAS");
        System.out.printf("%-20s %s%n", "-------", "---------");
        
        while (tokenizer.hasMoreTokens()) {
            palabra = tokenizer.nextToken();
            numLetras = palabra.length();
            System.out.printf("%-20s %d%n", palabra, numLetras);
        }
        
        entrada.close();
    }
}