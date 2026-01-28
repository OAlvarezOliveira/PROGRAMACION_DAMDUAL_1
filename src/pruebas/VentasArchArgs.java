/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: VentasArchArgs.java
 */

package pruebas;

import java.io.InputStream;
import java.util.Scanner;

/**
 * 
 */
public class VentasArchArgs {

	/**
	 * @param args nombreArchivo.txt numProductoAnalizar
	 */
	public static void main(String[] args) {

		// Validar cantidad de argumentos
		if (args.length != 2) {
			System.out.printf("\tUso: ARGS = nombreArchivo.txt & producto válido 1-3\n");
		}

		String archivo = args[0];
		int productoValido = Integer.parseInt(args[1]);

		// Validar que edad sea positiva
		if (productoValido < 0 || productoValido > 3) {
			System.out.printf("\tLos productos seleccionables son el rango 1-3.\n");
		}

		int[][] matriz = generaMatrizDesdeArchivo(archivo);

		imprimirMatriz(matriz);

		analizarProducto(matriz, productoValido);

		calcularTotalesPorProducto(matriz, productoValido);

	}

	private static void calcularTotalesPorProducto(int[][] matriz, int productoValido) {

		System.out.printf("\tRanking por ventas totales: \n");

		for (int col = 0; col < matriz[0].length; col++) {
			int sumaSemana = 0;

			for (int fila = 0; fila < matriz.length; fila++) {

				sumaSemana += matriz[fila][col];

			}
			if (col + 1 == productoValido) {
				System.out.printf("\t%d. Producto %d: %d ventas ← SELECCIONADO \n", col + 1, col + 1, sumaSemana);
			} else {
				System.out.printf("\t%d. Producto %d: %d ventas \n", col + 1, col + 1, sumaSemana);
			}

		}

	}

	private static void analizarProducto(int[][] matriz, int productoValido) {
		int maxSemana = 0;
		int suma = 0;
		int mejorSemana = 0;
		int mejorValor = Integer.MIN_VALUE;
		int peorSemana = 0;
		int peorValor = Integer.MAX_VALUE;

		System.out.printf("\tAnálisis Producto %d: \n", productoValido);
		for (int i = 0; i < matriz.length; i++) {
			int ventasSemana = matriz[i][productoValido - 1];

			if (matriz[i][productoValido - 1] > maxSemana) {
				maxSemana = matriz[i][productoValido - 1];
			}

			if (ventasSemana > mejorValor) {
				mejorValor = ventasSemana;
				mejorSemana = i + 1;
			}

			if (ventasSemana < peorValor) {
				peorValor = ventasSemana;
				peorSemana = i + 1;
			}

			System.out.printf("\tSemana %d: %d  \n", i + 1, matriz[i][productoValido - 1]);

			suma += matriz[i][productoValido - 1];

		}

		float media = (float) suma / matriz.length;

		System.out.printf("\n");
		System.out.printf("\tVentas totales producto %d: %d\n", (productoValido), suma);
		System.out.printf("\tMedia de ventas: %.2f \n", media);
		System.out.printf("\tMejor semana: %d (Ventas: %d)\n", mejorSemana, mejorValor);
		System.out.printf("\tPeor semana: %d (Ventas: %d)\n", peorSemana, peorValor);

	}

	private static int[][] generaMatrizDesdeArchivo(String archivo) {

		int filas = 0;
		int columnas = 0;
		InputStream ip = VentasArchArgs.class.getResourceAsStream(archivo);
		Scanner sc = new Scanner(ip);

		String primeraLinea = sc.nextLine();
		String[] dimensiones = primeraLinea.split(" ");
		filas = Integer.parseInt(dimensiones[0]);
		columnas = Integer.parseInt(dimensiones[1]);

		int[][] matriz = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {
			String lineaDatos = sc.nextLine();
			String[] valores = lineaDatos.split(" ");

			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = Integer.parseInt(valores[j]);
			}

		}

		return matriz;
	}

	private static void imprimirMatriz(int[][] matriz) {
		System.out.printf("\t=== INFORME DE VENTAS ===\n");
		System.out.printf("\tMatriz de ventas:\n");
		for (int[] fila : matriz) {
			for (int numero : fila) {
				System.out.printf("\t%d", numero);
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
	}

}
