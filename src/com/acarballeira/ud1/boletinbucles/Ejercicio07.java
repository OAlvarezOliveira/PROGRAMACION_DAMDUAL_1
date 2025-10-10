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
Diseñar el algoritmo para resolver una ecuación de segundo grado. El algoritmo
deberá ingresar A, B y C e ir ingresando x. El programa finaliza cuando ingresa x =
99
 */
public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int x = 0;
		double determinante;

		System.out.println("Introduce [99] en el valor de X para finalizar");
		System.out.print("Ingrese el valor de A:  ");
		a = sc.nextInt();
		System.out.print("Ingrese el valor de B:  ");
		b = sc.nextInt();
		System.out.print("Ingrese el valor de C:  ");
		c = sc.nextInt();
		do {
			System.out.print("Ingrese el valor de x:  ");
			x = sc.nextInt();
			
			
            //calculo determinante
			determinante = Math.sqrt((b*b)-4*a*c);
			// System.out.print(determinante );
		
			
			if(determinante > 0 || determinante < 0 ){
				double Solucion1 = (-b + determinante/2*a*c)/x;
				double Solucion2 = (-b - determinante/2*a*c)/x;
				System.out.print("Solucion1" + Solucion1 );
				System.out.print("Solucion2" + Solucion2);				
			}
			if(determinante == 0) {
			System.out.print("el sistema puede no tener solución o tener infinitas soluciones");}
  

		} while (x != 99);
		sc.close();
		System.out.print("Fin del Programa , has metido X con valor a 99");

	}
}