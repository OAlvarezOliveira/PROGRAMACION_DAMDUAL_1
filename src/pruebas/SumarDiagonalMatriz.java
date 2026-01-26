/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: SumarDiagonalMatriz.java
 */

package pruebas;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class SumarDiagonalMatriz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in, "UTF-8");

		int[][] numerosAleatorios = generaMatriz(entrada);

		rellenaMatriz(numerosAleatorios);

		int sumaDiagonal = sumarDiagonal(numerosAleatorios);
		imprimereMatriz(numerosAleatorios);

		System.out.printf("la suma de la diagonal es %d", sumaDiagonal);

		entrada.close();

	}

	private static int sumarDiagonal(int[][] numerosAleatorios) {

		int sumaDiagonal = 0;

		for (int filas = 0; filas < numerosAleatorios.length; filas++) {

			for (int columnas = 0; columnas < numerosAleatorios[filas].length; columnas++) {

				if (columnas == filas) {
					sumaDiagonal += numerosAleatorios[filas][columnas];
				}

			}
		}

		return sumaDiagonal;
	}

	private static void imprimereMatriz(int[][] numerosAleatorios) {
		for (int[] fila : numerosAleatorios) {
			for (int numero : fila) {
				System.out.printf("\t%d", numero);
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
