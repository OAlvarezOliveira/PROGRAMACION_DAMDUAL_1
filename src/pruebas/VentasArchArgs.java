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
	 * @param args
	 */
	public static void main(String[] args) {

		// Validar cantidad de argumentos
		if (args.length != 2) {
			System.out.printf("Uso: ARGS = nombreArchivo.txt & producto válido 1-3\n");
			return;
		}

		String archivo = args[0];
		int productoValido = Integer.parseInt(args[1]);

		// Validar que edad sea positiva
		if (productoValido < 0 || productoValido > 3) {
			System.out.printf("Los productos seleccionables son el rango 1-3.\n");
			return;
		}

		int[][] matriz = generaMatrizDesdeArchivo(archivo);

		

		// calcularTotalesPorProducto( matriz);

		imprimirMatriz(matriz);
		
		analizarProducto(matriz, productoValido);

	}

	private static void analizarProducto(int[][] matriz, int productoValido) {
		int maxSemana = 0;
		for (int i = 0; i < matriz.length; i++) {
				if(matriz[i][productoValido-1] > maxSemana) { maxSemana = matriz[i][productoValido-1];  }
				System.out.printf("Semana %d: %d \n", i+1, matriz[i][productoValido-1]);
		}
		

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
		System.out.printf("=== INFORME DE VENTAS ===\n");
		System.out.printf("Matriz de ventas:\n");
		for (int[] fila : matriz) {
			for (int numero : fila) {
				System.out.printf("\t%d", numero);
			}
			System.out.printf("\n");
		}
		
	}

}
