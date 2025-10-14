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
12. Conversión binario a decimal y decimal a binario:
Realizar los algoritmos Binario a Decimal y Decimal a 
Binario usando e
l bucle Repetir-MientrasQue.  
 */
public class Ejercicio12 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int opcion;

	        do {
	            System.out.println("\n--- MENÚ DE CONVERSIÓN ---");
	            System.out.println("1. Binario a Decimal");
	            System.out.println("2. Decimal a Binario");
	            System.out.println("3. Salir");
	            System.out.print("Elige una opción: ");
	            opcion = sc.nextInt();

	            switch (opcion) {
	                case 1:
	                    convertirBinarioADecimal(sc);
	                    break;
	                case 2:
	                    convertirDecimalABinario(sc);
	                    break;
	                case 3:
	                    System.out.println("Saliendo del programa...");
	                    break;
	                default:
	                    System.out.println("Opción no válida.");
	            }
	        } while (opcion != 3);

	        sc.close();
	    }

	    // Función: Binario a Decimal
	    public static void convertirBinarioADecimal(Scanner sc) {
	        int binario, decimal = 0, potencia = 1;

	        System.out.print("Introduce un número binario (ej: 1011): ");
	        binario = sc.nextInt();

	        do {
	            int digito = binario % 10;
	            decimal += digito * potencia;
	            potencia *= 2;
	            binario /= 10;
	        } while (binario > 0);

	        System.out.println("Resultado en decimal: " + decimal);
	    }

	    // Función: Decimal a Binario
	    public static void convertirDecimalABinario(Scanner sc) {
	        int decimal;
	        String binario = "";

	        System.out.print("Introduce un número decimal: ");
	        decimal = sc.nextInt();

	        int original = decimal;

	        if (decimal == 0) {
	            binario = "0";
	        } else {
	            do {
	                int resto = decimal % 2;
	                binario = resto + binario;
	                decimal /= 2;
	            } while (decimal > 0);
	        }

	        System.out.println("Resultado en binario: " + binario);
	    }

}
