/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: MinimoFila.java
 */

package pruebas;

import java.util.Random;
import java.util.Scanner;

/**
 * Enunciado: Pedir filas y columnas. Crear matriz con aleatorios [1-50].
 * Encontrar e imprimir el mínimo de cada fila con su posición (columna donde
 * está). Ejemplo salida: Matriz: 23 45 12 67 34 12 90 45 56 78 34 12
 * 
 * Fila 0: mínimo = 12 en columna 2 Fila 1: mínimo = 12 en columna 1 Fila 2:
 * mínimo = 12 en columna 3
 */
public class MinimoFila {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in, "UTF-8");

		int[][] numerosAleatorios = generaMatriz(entrada);

		rellenaMatriz(numerosAleatorios);

		imprimereMatriz(numerosAleatorios);
		imprimereMinimosFila(numerosAleatorios);

		entrada.close();

	}

	private static void imprimereMinimosFila(int[][] numerosAleatorios) {

		for (int fila = 0; fila < numerosAleatorios.length; fila++) {
			int minimo = Integer.MAX_VALUE;
			int columnaMin = -1;

			for (int col = 0; col < numerosAleatorios[fila].length; col++) {

				if (minimo > numerosAleatorios[fila][col]) {

					minimo = numerosAleatorios[fila][col];
					columnaMin = col;
				}

				// Imprimir resultado de esta fila
			}

			System.out.printf("Fila %d: mínimo = %d en columna %d \n", fila, numerosAleatorios[fila][columnaMin],
					columnaMin);
		}

	}

	private static void imprimereMatriz(int[][] numerosAleatorios) {
		for (int[] fila : numerosAleatorios) {
			for (int numero : fila) {
				System.out.printf("%d\t", numero);
			}
			System.out.printf("\n");

		}
		System.out.printf("\n");
		System.out.printf("\n");
	}

	private static void rellenaMatriz(int[][] numerosAleatorios) {
		Random aleatorio;
		aleatorio = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {

			for (int j = 0; j < numerosAleatorios[i].length; j++) {

				numerosAleatorios[i][j] = aleatorio.nextInt(1, 51);

			}

		}

	}

	private static int[][] generaMatriz(Scanner entrada) {

		int filas;
		int columnas;

		System.out.println("Introduce el nº de Filas de la matriz");
		filas = entrada.nextInt();
		System.out.println("Introduce el nº de Columnas de la matriz");
		columnas = entrada.nextInt();
		int[][] matriz = new int[filas][columnas];

		return matriz;

	}

}
