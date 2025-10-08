/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01While.java
 */

package com.acarballeira.ud1.bucles;

/**
 * Imprimir los números impares entre 1-10
 */

public class Ejercicio01While {

	public static void main(String[] args) {

		int i;
		i = 1;
		while (i < 10) {
			if (i % 2 != 0) {System.out.println(i);}
			i++;
		}
	}

}
