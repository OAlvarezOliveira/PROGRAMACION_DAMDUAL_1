package com.acarballeira.ud2.arraysBoletin1;


/**
 * Resolucion de la tarea 03. Ejercicios Arrays
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

/*
 * Hacer un programa que genere e imprima un cuadrado latino de orden 10 (matriz
 * 10x10). Un cuadradado latino de orden n es aquel en el que la primera fila
 * tiene los nº naturales del 1 a n, y cada una de las filas restantes de la
 * matriz es igual a su fila superior desplazada una posicion hacia la derecha,
 * entrando por la izquierda el número que se pierde en el desplazamiento. Por
 * ejemplo, un cuadrado latino de orden 5 es:
 * 
 */

public class Ejercicio09 {

	public static void main(String[] args) {

		// Declarar Variables
		int[][] matriz;
		int numero;
		int limite;
		final int ORDEN;

		// Inicializar Variables
		ORDEN = 5;
		matriz = new int[ORDEN][ORDEN];
		numero = 1;
		limite = ORDEN;

		// Generar matriz
		for (int i = 0; i < ORDEN; i++) {

			for (int j = 0; j < ORDEN; j++) {
				
				matriz[i][j] = numero;
				numero = (numero == limite) ? 1 : ++numero;
			//	numero = (numero + 1)%10;

			}
			   numero = (numero == 1) ? limite : --numero; 
		}

		// Pintar matriz
		for (int[] fila : matriz) {

			for (int elemento : fila) {
				System.out.printf("%2d ", elemento);

			}
			System.out.printf("%n");
		} // FIN Pintar matriz

	}

}
