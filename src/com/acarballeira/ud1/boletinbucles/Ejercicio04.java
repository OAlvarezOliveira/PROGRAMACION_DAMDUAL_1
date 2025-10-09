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
Leer una lista de números que finaliza cuando se ingresar el 
número 0 (cero), al finalizar emitir el valor 
mínimo de la lista.
 */
public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int maximo = Integer.MIN_VALUE;

		do {
			System.out.print("Ingrese el valor a almacenar:  ");
			num = sc.nextInt();
			if (num != 0 && (num > maximo ) ){
			     maximo = num ;
			     System.out.println("numero"+ num);
			     System.out.println("maximo acumulado"+ maximo);
			}	
		}	while (num != 0);
		sc.close();
		System.out.println("maximo de la lista"+ maximo);
		System.out.print("Fin del Progrma , has metido 0");

   }
}