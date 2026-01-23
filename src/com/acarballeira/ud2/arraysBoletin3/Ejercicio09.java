/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio09.java
 */

package com.acarballeira.ud2.arraysBoletin3;

import java.util.Scanner;

/**
 * Dada una entrada de teclado formada por una serie de números naturales
 * separados por comas, crear y dibujar una matriz bidimensional que la
 * represente. P.e: 2,1,6,3
 * 
 * 6 6 6 6 3 2 6 3 2 1 6 3
 * 
 */
public class Ejercicio09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in, "UTF-8");
		String[] tokens = leeYsepara(entrada);
		
		int[] valores = new int[tokens.length];
		for (int i = 0; i < tokens.length; i++) {
			valores[i] = Integer.parseInt(tokens[i].trim());
		}

		int maximo = encuentraMaximo(valores);
		int[][] matriz = new int[maximo][valores.length];
		rellenaColumnas(valores, maximo, matriz);
		imprimeSalida(valores, maximo, matriz);

	}

	private static void imprimeSalida(int[] valores, int maximo, int[][] matriz) {
		for (int i = 0; i < maximo; i++) {
			for (int j = 0; j < valores.length; j++) {
				if (matriz[i][j] == 0) {
					System.out.print("  "); 
				} else {
					System.out.print(matriz[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	private static void rellenaColumnas(int[] valores, int maximo, int[][] matriz) {
		for (int col = 0; col < valores.length; col++) {
			int valor = valores[col];
			int filaInicio = maximo - valor;

			for (int fila = filaInicio; fila < maximo; fila++) {
				matriz[fila][col] = valor;
			}
		}
	}

	private static int encuentraMaximo(int[] valores) {
		// Paso 3: Encontrar máximo
		int maximo = 0;
		for (int v : valores) {
			if (v > maximo)
				maximo = v;
		}
		return maximo;
	}

	private static String[] leeYsepara(Scanner entrada) {
		// Paso 1: Leer y separar
		String linea = entrada.nextLine();
		String[] tokens = linea.split(",");
		return tokens;
	}

}
