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
		int a;
		int b;
		int acumulaA = 0;
		int acumulaB = 0;
		int mayor;
		int menor;

		do {
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

		} while ((a != 99) || (b != 99));
		sc.close();
		System.out.print("Fin del Programa , has metido algun valor a 99");

	}
}