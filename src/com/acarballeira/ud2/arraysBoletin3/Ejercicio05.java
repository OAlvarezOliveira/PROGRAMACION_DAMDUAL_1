/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio05.java
 */

package com.acarballeira.ud2.arraysBoletin3;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class Ejercicio05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] combinacionGanadora = new int[6];
		int[] apuesta = new int[6];

		// Rellenar apuesta
		generaBoleto(entrada, apuesta);

		// Sorteo
		realizarSorteo(combinacionGanadora);

		// Calcular aciertos
		int aciertos = contarAciertos(combinacionGanadora, apuesta);

		System.out.printf("\nNúmero de aciertos: %d", aciertos);

		entrada.close();
	}

	private static int contarAciertos(int[] combinacionGanadora, int[] apuesta) {

		int aciertos = 0;

		for (int i = 0; i < apuesta.length; i++) {

			for (int j = 0; j < combinacionGanadora.length; j++) {

				if (apuesta[i] == combinacionGanadora[j]) {
					aciertos++;
				}

			}
		}

		return aciertos;
	}

	private static void realizarSorteo(int[] combinacionGanadora) {

		Random aleatorio = new Random();

		for (int i = 0; i < combinacionGanadora.length; i++) {

			int numAleatorio = aleatorio.nextInt(1, 50);
			combinacionGanadora[i] = numAleatorio;

		}

	}

	private static void generaBoleto(Scanner entrada, int[] apuesta) {

		for (int i = 0; i < apuesta.length; i++) {

			System.out.printf("Introduce un numero para tu apuesta: ");
			apuesta[i] = entrada.nextInt();
		}
	}

}
