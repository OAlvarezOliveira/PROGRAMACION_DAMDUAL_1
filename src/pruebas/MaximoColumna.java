/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: MaximoColumna.java
 */

package pruebas;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class MaximoColumna {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in, "UTF-8");

		int[][] numerosAleatorios = generaMatriz(entrada);

		rellenaMatriz(numerosAleatorios);
		imprimereMatriz(numerosAleatorios);
		imprimeMaximosColumna(numerosAleatorios);

		entrada.close();

	}

	private static void imprimeMaximosColumna(int[][] numerosAleatorios) {

	    for (int col = 0; col < numerosAleatorios[0].length; col++) {
	        
	        int maximo = Integer.MIN_VALUE;
	        int filaMaxPos = -1;  
	        
	        for (int fila = 0; fila < numerosAleatorios.length; fila++) {
	            
	            if (numerosAleatorios[fila][col] > maximo) {  
	                maximo = numerosAleatorios[fila][col];
	                filaMaxPos = fila;
	            }
	        }
	        
	        System.out.printf("Columna %d: máximo = %d en fila %d\n", 
	            col, maximo, filaMaxPos);
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
