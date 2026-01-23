/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01.java
 */

package com.acarballeira.ud2.arraysBoletin3;

import java.util.Random;

/**
Crear un vector de diez elementos inicializado con números aleatorios en el rango [1-100]. 
Mostrar la suma total.
 */
public class Ejercicio01 {

final static int LONGITUD = 10;
	
	public static void main(String[] args) {
		

		int[] vAleatorios = new int [LONGITUD];
		int suma;
		
		
		suma= sumaElementos(vAleatorios);
		
		System.out.printf("La suma del total de elementos del vector es %d",suma);
	}

	private static int sumaElementos(int[] vAleatorios) {
		Random aleatorio = new Random();
		int suma = 0;
		for (int i = 0; i < LONGITUD; i++) {
			
			vAleatorios[i]= aleatorio.nextInt(1,101);
			suma += vAleatorios[i];
			
		}
		
		return suma;
	}

}
