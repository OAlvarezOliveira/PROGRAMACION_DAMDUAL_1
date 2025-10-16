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
 */
public class Ejercicio11B {
	
	
	static boolean esPrimo(int num) {
		
		int divisor;
		boolean esPrimo;
		
		esPrimo = true;
		divisor = 2;
		while(divisor <= num/2 && esPrimo) {
			if(num % divisor == 0) {
				esPrimo = false;
			}
			divisor++;
		}
		
		return esPrimo;
	}

	public static void main(String[] args) {
		
		//Declaración
		Scanner teclado;
		int numero;
		int digito;
		int invertido;
		
		//Inicialización
		teclado = new Scanner(System.in);
		
		//Entrada
//		System.out.print("Introduzca un número: ");
//		numero = teclado.nextInt();
		numero = 1597;		
		
		//Operativa
			
		if(esPrimo(numero)) {
			//Invertir número
			invertido = 0;
			while(numero != 0) {
				digito = numero % 10;
				numero = numero / 10;
				invertido = invertido * 10 + digito;
			}						
			if(esPrimo(invertido)) {
				System.out.println("Es primo y OMIRP");
			} else {
				System.out.println("Es primo pero no OMIRP");
			}
		} else {
			System.out.println("No es primo y tampoco OMIRP");
		}
		
		

	}

}


