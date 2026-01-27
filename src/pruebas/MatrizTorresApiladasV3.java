/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: MatrizTorresApiladasV3.java
 */

package pruebas;


import java.util.Scanner;

/**
 * Enunciado: Leer números separados por comas. Crear y dibujar una matriz
 * donde:
 * 
 * Filas = máximo valor Columnas = cantidad de números Cada columna se rellena
 * 
 * con su valor desde ABAJO hacia ARRIBA
 * 
 * Mostrar espacios para los ceros
 * 
 * Ejemplo entrada: 2,1,6,3 Salida: 6 6 6 6 3 2 6 3 2 1 6 3
 */
public class MatrizTorresApiladasV3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] valores;
		int[][] matriz;
		System.out.printf("Dame Valores");
		valores = entrada.nextLine().split(",");

		int maximo = Integer.MIN_VALUE;
		for (int i = 0; i < valores.length; i++) {

			int num = Integer.parseInt(valores[i]);

			if (maximo < num) {
				maximo = num;
			}

		}

//				//debug
//				System.out.println(maximo);
//				System.out.println(valores.length);

		 matriz = new int[maximo][valores.length];
		


		// rellenar matriz

		for (int col = 0; col < matriz[0].length; col++) {

			int valor = Integer.parseInt(valores[col]);

			int filaInicio = matriz.length - valor;

			for (int fila = filaInicio; fila < matriz.length; fila++) {

				matriz[fila][col] = valor;

			}

		}

		// imprime matriz

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
