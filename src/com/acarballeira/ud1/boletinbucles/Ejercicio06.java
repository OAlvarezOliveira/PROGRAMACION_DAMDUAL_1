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

<<<<<<< HEAD

			System.out.println("Introduce [99] en algun valor de rango para finalizar");
			System.out.print("Ingrese el valor de un limite del intervalo:  ");
			a = sc.nextInt();
			System.out.print("Ingrese el valor del otro limite del intervalo ");
			b = sc.nextInt();
			
            //determino rango 
			if (a > b) {
				mayor = a;
				menor = b;
				System.out.println("Rango:" + "["+ menor + ":" + mayor + "]");
			} else {
				mayor = b;
				menor = a;
				System.out.println("Rango:" + "["+ menor + ":" + mayor + "]");
			}
			
			do {
				System.out.print("Ingrese el a incrementar en rango A :  ");
				acumulaA = sc.nextInt();
				System.out.print("Ingrese el a incrementar en rango B ");
				acumulaB = sc.nextInt();
				
			if (acumulaA < menor )	{
			acumulaA=+menor;
			System.out.println(acumulaA);
			}else {
				acumulaA=+mayor;
				System.out.println(acumulaA);				
			}
			if (acumulaB < menor )	{
				acumulaB=+menor;
				System.out.println(acumulaA);
				}else {
					acumulaB=+mayor;
					System.out.println(acumulaB);				
				}
=======
	        // Leer los límites del intervalo
	        System.out.print("Ingrese el primer límite del intervalo: ");
	        a = sc.nextInt();
	        System.out.print("Ingrese el segundo límite del intervalo: ");
	        b = sc.nextInt();
>>>>>>> branch 'master' of https://github.com/OAlvarezOliveira/PROGRAMACION_DAMDUAL_1

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