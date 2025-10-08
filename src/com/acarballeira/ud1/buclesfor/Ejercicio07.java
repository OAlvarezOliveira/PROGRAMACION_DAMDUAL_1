/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01While.java
 */

package com.acarballeira.ud1.buclesfor;

import java.util.Scanner;

/**
Dibuja un cuadrado de asteriscos.
Debe solicitar al usuario el lado del cuadrado. 
Por ejemplo, para el valor 4:
 * 
 */

public class Ejercicio07 {

	public static void main(String[] args) {

        Scanner scanner; 
        int lado;
        

        System.out.print("Introduce el tamaño del lado del cuadrado: ");
        scanner = new Scanner(System.in);
        lado= scanner.nextInt();
        scanner.close();

		for (int i=0 ; i < lado;i++) {

			for (int j=0 ; j < lado;j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}
}
