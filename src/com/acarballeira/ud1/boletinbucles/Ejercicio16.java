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
Averiguar números múltiplos de 9. Un entero es divisible para 9 si 
lo es la suma de sus cifras. Conociendo esta propiedad, realice un 
algoritmo para determinar si un número n es divisible para 9.  
Por ejemplo:  1- Numero= 1492,-> 1+4+9+2= 16-> 1+6=7;
 
Resultado=como 7 no es divisible por 9, 1492 no es divisible 
por 9 2- Numero=1548-> 1+5+4+8=18-> 1+8=9 

Resultado= como 9 es divisible por 9, 1548 es divisible por 9.
 */
public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número entero: ");
		int numero = sc.nextInt();

		int suma = numero;

		// Repetir la suma de cifras hasta que quede un solo dígito
		do {
			int temp = suma;
			suma = 0;

			while (temp > 0) {
				suma += temp % 10; // suma el último dígito
				temp /= 10; // elimina el último dígito
			}

		} while (suma > 9);

		// Mostrar resultado
		if (suma == 9) {
			System.out.println("✅ El número " + numero + " es divisible por 9.");
		} else {
			System.out.println("❌ El número " + numero + " NO es divisible por 9.");
		}

		sc.close();
	}

}
