package com.acarballeira.ud2.arraysBoletin3;

import java.util.Random;

/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01.java
 */

/**
 * Diseñar una función que reciba un vector de enteros y devuelva el máximo
 * valor contenido en el vector.
 */

public class Ejercicio03 {

	final static int LONGITUD = 10;

	public static void main(String[] args) {

		int[] vAleatorios = new int[LONGITUD];
		int posicionMayor;

		posicionMayor = encuentraMayor(vAleatorios);

		System.out.printf("El mayor valor del vector es %d y está en la posicion %d", vAleatorios[posicionMayor],
				posicionMayor);

	}

	private static int encuentraMayor(int[] vAleatorios) {
		Random aleatorio = new Random();
		int posicionMayor = 0;
		int mayor = Integer.MIN_VALUE;

		for (int i = 0; i < LONGITUD; i++) {
			vAleatorios[i] = aleatorio.nextInt(1, 101);

			if (mayor < vAleatorios[i]) {
				mayor = vAleatorios[i];
				posicionMayor = i;
			}

		}

		return posicionMayor;
	}

}
