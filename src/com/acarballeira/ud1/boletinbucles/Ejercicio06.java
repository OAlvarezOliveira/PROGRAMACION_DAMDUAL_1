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
Escribir un programa que permite ingresar dos valores A y B que determinan un
intervalo, luego ir acumulando los valores que se ingresan a continuación siempre y
cuando estos pertenezcan al intervalo. El ingreso de números finaliza cuando
ingresa el 99
 */
public class Ejercicio06 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int a, b, num;
	        int menor, mayor;
	        int suma = 0;

	        // Leer los límites del intervalo
	        System.out.print("Ingrese el primer límite del intervalo: ");
	        a = sc.nextInt();
	        System.out.print("Ingrese el segundo límite del intervalo: ");
	        b = sc.nextInt();

	        // Determinar menor y mayor
	        if (a > b) {
	            mayor = a;
	            menor = b;
	        } else {
	            mayor = b;
	            menor = a;
	        }

	        System.out.println("Intervalo válido: [" + menor + ", " + mayor + "]");

	        // Leer y acumular valores
	        do {
	            System.out.print("Ingrese un número (99 para terminar): ");
	            num = sc.nextInt();

	            if (num != 99 && num >= menor && num <= mayor) {
	                suma += num;
	            }

	        } while (num != 99);

	        System.out.println("\nSuma total de valores dentro del intervalo: " + suma);
	        System.out.println("Fin del programa. Has ingresado 99.");
	        sc.close();
	    }
}