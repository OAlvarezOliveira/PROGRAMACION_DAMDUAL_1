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
Leer una lista de números que finaliza 
cuando se ingresar el número 0 (cero), al
finalizar emitir el valor máximo de la lista, 
y la ubicación del máximo dentro de la
lista. (Suponer un único máximo). 
 */
public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int maximo = Integer.MIN_VALUE;
		int posicion = 0;

		do {
			System.out.print("Ingrese el valor a almacenar:  ");
			num = sc.nextInt();
			if (num != 0 && (num > maximo ) ){
			     maximo = num ;
			     posicion ++;
			     System.out.println("numero"+ num);
			     System.out.println("maximo acumulado"+ maximo);
			     System.out.println("Posicion maximo"+ posicion);
			}	
		}	while (num != 0);
		sc.close();
		System.out.println("maximo de la lista"+ maximo);
		System.out.println("Y ocupa la posición"+ posicion);
		System.out.print("Fin del Progrma , has metido 0");

   }
}