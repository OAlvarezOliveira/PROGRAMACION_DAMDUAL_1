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
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int minimo = Integer.MAX_VALUE;


		do {
			System.out.print("Ingrese el primer valor  ");
			num = sc.nextInt();
			if (num != 0 && (num < minimo ) ){
			     minimo = num ;
			     System.out.println("numero"+ num);
			     System.out.println("minimo acumulado"+ minimo);
			}	
		}	while (num != 0);
		sc.close();
		System.out.println("minimo de la lista"+ minimo);
		System.out.print("Fin del Progrma , has metido 0");

   }
}