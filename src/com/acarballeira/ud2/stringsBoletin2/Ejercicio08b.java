package com.acarballeira.ud2.stringsBoletin2;

import java.util.Scanner;

/**
 * Programa que lee una frase y visualiza cada palabra en columnas
 * seguida del número de letras SIN usar StringTokenizer
 */
public class Ejercicio08b {

    public static void main(String[] args) {
        
        // Declarar variables
        String frase;
        Scanner entrada;
        String[] palabras;
        int numLetras;
        
        // Inicializar
        entrada = new Scanner(System.in);
        
        // Toma de datos
        System.out.printf("Introduce una frase:%n");
        frase = entrada.nextLine();
        
        // Procesar con split (divide por espacios)
        palabras = frase.trim().split("\\s+");
        
        System.out.printf("%n%-20s %s%n", "PALABRA", "Nº LETRAS");
        System.out.printf("%-20s %s%n", "-------", "---------");
        
        for (String palabra : palabras) {
            numLetras = palabra.length();
            System.out.printf("%-20s %d%n", palabra, numLetras);
        }
        
        entrada.close();
    }
}
