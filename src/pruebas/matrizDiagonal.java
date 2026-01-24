/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: matrizDiagonal.java
 */

package pruebas;

import java.util.Scanner;

/**
 * A2 - MEDIO: Matriz diagonal Enunciado: Pedir N números por teclado (separados
 * por comas o uno a uno, como prefieras). Encontrar el máximo. Crear una matriz
 * cuadrada de tamaño [máximo][máximo]. Rellenar la diagonal principal con los
 * números introducidos (si hace falta, repetirlos cíclicamente). El resto en 0.
 * Imprimir.
 * 
 * Ejemplo entrada: 3, 5, 2, 8
 * 
 * Máximo = 8 Matriz 8x8 Diagonal: [3,5,2,8,3,5,2,8] (se repiten porque solo hay
 * 4 números)
 * 
 * Salida esperada: 3 0 0 0 0 0 0 0 0 5 0 0 0 0 0 0 0 0 2 0 0 0 0 0 0 0 0 8 0 0
 * 0 0 0 0 0 0 3 0 0 0 0 0 0 0 0 5 0 0 0 0 0 0 0 0 2 0 0 0 0 0 0 0 0 8
 * 
 */
public class matrizDiagonal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in, "UTF-8");
		int[][] matriz = null;
		String datos;
		String[] valores;

		System.out.printf("Introduce números separados por comas: ");
		datos = entrada.nextLine();
		valores = datos.split(",");

		matriz = generaMatriz(entrada, valores);
		llenaMatriz(matriz, valores);
		imprimeMatriz(matriz);

	}

	private static void imprimeMatriz(int[][] matriz) {
		for (int[] fila : matriz) {
			for (int elementoFila : fila) {
				System.out.printf("\t%d", elementoFila);
			}
			System.out.printf("\n");
		}

	}

	private static int[][] generaMatriz(Scanner entrada, String[] valores) {

		int maximo = 0;
		for (String v : valores) {
			int num = Integer.parseInt(v.trim());
			if (num > maximo) {
				maximo = num;
			}
		}
		int[][] matriz = new int[maximo][maximo];

		return matriz;
	}

	private static void llenaMatriz(int[][] matriz, String[] valores) {

		int k = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					int indiceActual = k % valores.length;
					matriz[i][j] = Integer.parseInt(valores[indiceActual]);
					k++;
				}
			}
		}
	}

}
