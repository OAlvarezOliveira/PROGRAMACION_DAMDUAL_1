/**
 * 
 */
package com.acarballeira.ud1.aleatorios;

import java.util.Random;
import java.util.Scanner;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

/**
Realizar un programa que permita generar tiradas de un dado. 
El programa preguntará por el número de tiradas y 
escribirán en el terminal el resultado de cada tirada.
 */
public class Ejercicio02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       
		int n;
		int generado;
		Random aleatorio = new Random();
		Scanner entrada = new Scanner (System.in);
		
		
		System.out.println("Introduzca el numero de tiradas a generar: ");
		n=entrada.nextInt();
          
		
		for (int i=n ; i>0 ; i--) {
			
			generado = aleatorio.nextInt(1, 7); // simulamos lanzamiento de 1D6 
 			System.out.println("Ha salido : "+generado);
			
		}
		entrada.close();
	}

}
