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
Un número OMIRP es un número primo que tiene una particularidad
que lo hace diferente. Si se invierten los dígitos del número, 
se forma otro número. Este otro número también es un número primo,
por ello se los llama números OMIRP. 
(PRIMO al revés) Ejemplo Se desea escribir un algoritmo que 
permita determinar si un número n , tiene la característica de 
ser un número OMIRP. 
Utilizando como ejemplo el número 1597:  • 1597 es número primo, 
Se invierten sus dígitos: 7951  
Se comprueba que 7951 es primo,  •
Entonces el número 1597 es un número omirp.  
Ingresar duplas de valores formadas cada una de ellas por un
carácter y un dígito. Este ingreso no debe seguir ningún orden y 
no debe exceder las cuatro duplas. 
El carácter puede tomar los siguientes valores:
  
• U: unidades 
• D: decenas 
• C: centenas 
• M: unidades de mil.  

Calcular y mostrar el número correspondiente.  
 */
public class Ejercicio11 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int mil = 0;
	        int cen = 0;
	        int dec = 0;
	        int uni = 0;

	        System.out.println("Introduce hasta 4 duplas (letra + dígito). Letras válidas: M, C, D, U");

	        int cantidad = 0;
	        while (cantidad < 4) {
	            System.out.print("Introduce la letra (M/C/D/U) o X para terminar: ");
	            String letra = sc.next().toUpperCase();
	            if (letra.equals("X")) break;

	            if (!letra.equals("M") && !letra.equals("C") && !letra.equals("D") && !letra.equals("U")) {
	                System.out.println("Letra no válida.");
	                continue;
	            }

	            System.out.print("Introduce el dígito (0-9): ");
	            int digito = sc.nextInt();
	            if (digito < 0 || digito > 9) {
	                System.out.println("Dígito no válido.");
	                continue;
	            }

	            switch (letra) {
	                case "M": mil = digito; break;
	                case "C": cen = digito; break;
	                case "D": dec = digito; break;
	                case "U": uni = digito; break;
	            }

	            cantidad++;
	        }

	        // Formar el número completo
	        int numero = mil * 1000 + cen * 100 + dec * 10 + uni;
	        System.out.println("Número formado: " + numero);

	        // Verificar si es OMIRP
	        if (esPrimo(numero)) {
	            int invertido = invertir(numero);
	            System.out.println("Número invertido: " + invertido);

	            if (esPrimo(invertido)) {
	                System.out.println("✅ Es un número OMIRP.");
	            } else {
	                System.out.println("❌ No es OMIRP: el número invertido no es primo.");
	            }
	        } else {
	            System.out.println("❌ No es OMIRP: el número original no es primo.");
	        }

	        sc.close();
	    }

	    // Comprobación de número primo
	    public static boolean esPrimo(int n) {
	        if (n < 2) return false;
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }

	    // Invertir número
	    public static int invertir(int n) {
	        int inv = 0;
	        while (n > 0) {
	            inv = inv * 10 + (n % 10);
	            n = n / 10;
	        }
	        return inv;
	    }

}
