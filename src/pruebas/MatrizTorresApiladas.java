/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: MatrizTorresApiladas.java
 */

package pruebas;

import java.util.Scanner;

/**
 * 
 */
public class MatrizTorresApiladas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in, "UTF-8");
		String[] valores = leeValores(entrada);

		int[][] matriz = crearMatrizVacia(entrada, valores);
		rellenaMatriz(valores, matriz);
		imprimeMatriz(matriz);
		entrada.close();

	}

	private static void rellenaMatriz(String[] valores, int[][] matriz) {
		// Rellenar matriz (columna por columna, desde abajo)

		for (int col = 0; col < matriz[0].length; col++) {
			int num = Integer.parseInt(valores[col]);

			// Calcular filaInicio
			int filaInicio = matriz.length - num;

			for (int fila = filaInicio; fila < matriz.length; fila++) {

				matriz[fila][col] = num;

			}

		}
	}

	private static String[] leeValores(Scanner entrada) {
		System.out.printf("Dame lista de datos a procesar , separados por comas: \n");
		String datos = entrada.nextLine();
		String[] valores = datos.split(",");
		return valores;
	}

	private static int[][] crearMatrizVacia(Scanner entrada, String[] valores) {

		int maximo = Integer.MIN_VALUE;

		// buscar dimensiones

		int columnas = valores.length;
		for (int i = 0; i < valores.length; i++) {

			int num = Integer.parseInt(valores[i]);

			if (num > maximo) {
				maximo = num;
			}

		}

		int[][] matriz = new int[maximo][columnas];

		return matriz;
	}

	private static void imprimeMatriz(int[][] matriz) {
		for (int[] fila : matriz) {
			for (int elementoFila : fila) {
				if (elementoFila == 0) {
					System.out.printf("\t ");
				} else {
					System.out.printf("\t%d", elementoFila);
				}

			}
			System.out.printf("\n");
		}

	}

}
