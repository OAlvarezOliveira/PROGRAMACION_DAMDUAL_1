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
Crear un algoritmo para convertir un número de base numérica genérica
 x a base y. Sugerencia, convierta el número de la base X primero a 
 decimal y luego transforme el resultado a la siguiente base 
 numérica Y.  
 */
public class Ejercicio13 {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("--- Conversor entre bases numéricas ---");

	        System.out.print("Introduce el número original: ");
	        String numero = sc.nextLine().toUpperCase(); // acepta letras A-F para hexadecimales

	        System.out.print("Introduce la base original (X): ");
	        int baseX = sc.nextInt();

	        System.out.print("Introduce la base destino (Y): ");
	        int baseY = sc.nextInt();

	        // Paso 1: base X → decimal
	        int decimal = convertirABaseDecimal(numero, baseX);

	        // Paso 2: decimal → base Y
	        String convertido = convertirDecimalABaseY(decimal, baseY);

	        System.out.println("Resultado en base " + baseY + ": " + convertido);

	        sc.close();
	    }

	    // Convierte número en base X (como string) a decimal
	    public static int convertirABaseDecimal(String numero, int baseX) {
	        int decimal = 0;
	        int potencia = 1;

	        for (int i = numero.length() - 1; i >= 0; i--) {
	            char c = numero.charAt(i);
	            int valor;

	            if (Character.isDigit(c)) {
	                valor = c - '0';
	            } else {
	                valor = c - 'A' + 10; // A=10, B=11, etc.
	            }

	            if (valor >= baseX) {
	                System.out.println("¡Error! Dígito no válido para base " + baseX);
	                return 0;
	            }

	            decimal += valor * potencia;
	            potencia *= baseX;
	        }

	        return decimal;
	    }

	    // Convierte número decimal a base Y como string
	    public static String convertirDecimalABaseY(int decimal, int baseY) {
	        if (decimal == 0) return "0";

	        String resultado = "";

	        do {
	            int resto = decimal % baseY;
	            char c = (resto < 10) ? (char) ('0' + resto) : (char) ('A' + resto - 10);
	            resultado = c + resultado;
	            decimal /= baseY;
	        } while (decimal > 0);

	        return resultado;
	    }

}
