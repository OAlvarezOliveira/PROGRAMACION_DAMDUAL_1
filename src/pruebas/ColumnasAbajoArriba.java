/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: ColumnasAbajoArriba.java
 */

package pruebas;

import java.util.Scanner;

/**
 * 
 */
public class ColumnasAbajoArriba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] valores;

		System.out.printf("Dame Valores");
		valores = entrada.nextLine().split(",");

		int[][] numerosAleatorios = creaMatriz(entrada, valores);

		rellenaMatriz(numerosAleatorios, valores);

		imprimereMatriz(numerosAleatorios);

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

	private static void rellenaMatriz(int[][] numerosAleatorios, String[] valores) {

		for (int col = 0; col < numerosAleatorios[0].length; col++) {

			int num = Integer.parseInt(valores[col]);

			int filaInicio = numerosAleatorios.length - num;

			for (int fila = filaInicio; fila < numerosAleatorios.length; fila++) {

				numerosAleatorios[fila][col] = num;
			}

		}
	}

	private static int[][] creaMatriz(Scanner entrada, String[] valores) {

		int filas = Integer.MIN_VALUE;
		// Encuentra mayor de Valores

		for (int i = 0; i < valores.length; i++) {

			int num = Integer.parseInt(valores[i]);

			if (filas < num) {
				filas = num;
			}

		}
		int[][] numerosAleatorios = new int[filas][valores.length];
		System.out.println(filas);
		return numerosAleatorios;
	}

}
