/**
 * Resolucion de la tarea
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: TorresDesdeArriba.java
 */

package pruebas;

import java.util.Scanner;

/**
 * A3 - Torres desde arriba
 * 
 * Programa que lee números separados por comas, crea una matriz donde:
 * - Filas = máximo valor introducido
 * - Columnas = cantidad de números
 * - Cada columna se rellena con su valor desde la fila 0 hacia abajo
 * 
 * Ejemplo entrada: 2,1,4,3
 * Salida:
 * 2 1 4 3  (Fila 0)
 * 2 - 4 3  (Fila 1)
 * - - 4 3  (Fila 2)
 * - - 4 -  (Fila 3)
 */
public class TorresDesdeArriba {

	/**
	 * Método principal que coordina la lectura, procesamiento y visualización
	 * de la matriz de torres
	 * 
	 * @param args argumentos de línea de comandos (no utilizados)
	 */
	public static void main(String[] args) {

		// Variables Main
		Scanner entrada = new Scanner(System.in, "UTF-8");
		String datos;
		String[] valores;
		int[][] matriz;
		int maximo;

		// Entrada de datos
		System.out.printf("Introduce números separados por comas: ");
		datos = entrada.nextLine();

		// Operativa
		valores = datos.split(",");
		maximo = buscaMaximo(valores);
		matriz = new int[maximo][valores.length];
		matriz = llenaMatriz(valores, matriz);

		// Salida de datos y fin de programa
		imprimeMatriz(matriz);
		entrada.close();

	}

	/**
	 * Busca el valor máximo en un array de strings que representan números
	 * 
	 * @param valores array de strings con los números a analizar
	 * @return el valor máximo encontrado como entero
	 */
	private static int buscaMaximo(String[] valores) {
		int maximo = 0;
		for (String v : valores) {
			int num = Integer.parseInt(v.trim());
			if (num > maximo)
				maximo = num;
		}
		return maximo;
	}

	/**
	 * Imprime la matriz en formato tabla, mostrando espacios para valores 0
	 * 
	 * @param matriz matriz bidimensional de enteros a imprimir
	 */
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

	/**
	 * Rellena la matriz por columnas desde arriba hacia abajo.
	 * Cada columna se rellena con su valor correspondiente tantas veces
	 * como indique dicho valor.
	 * 
	 * @param valores array de strings con los números para cada columna
	 * @param matriz matriz bidimensional a rellenar
	 * @return la matriz rellenada
	 */
	private static int[][] llenaMatriz(String[] valores, int[][] matriz) {

		for (int col = 0; col < valores.length; col++) {

			int valor = Integer.parseInt(valores[col].trim());

			for (int fila = 0; fila < valor; fila++) {
				matriz[fila][col] = valor;

			}

		}
		return matriz;
	}

}
