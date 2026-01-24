/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: EncontrarMaximo.java
 */

package pruebas;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class EncontrarMaximo {

	public static final int FILAS = 4;
	public static final int COLUMNAS = 5;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in, "UTF-8");

		int[][] numerosAleatorios = new int[FILAS][COLUMNAS];

		rellenaMatriz(numerosAleatorios);
		imprimeMatriz(numerosAleatorios);
		buscaMaximo(numerosAleatorios);
		entrada.close();

	}

	private static void buscaMaximo(int[][] numerosAleatorios) {

		int filaMax = -1;
		int colMax = -1;
		int maximo = Integer.MIN_VALUE;

		for (int i = 0; i < numerosAleatorios.length; i++) {

			for (int j = 0; j < numerosAleatorios[i].length; j++) {

				if (maximo < numerosAleatorios[i][j]) {
					maximo = numerosAleatorios[i][j];
					filaMax = i;
					colMax = j;
				}

			}

		}

		System.out.printf("El valor máximo es %d en la posición [%d,%d]\n", numerosAleatorios[filaMax][colMax], filaMax,
				colMax);

	}
	
	private static void imprimeMatriz(int[][] matriz) {
	    System.out.println("Matriz:");
	    for (int[] fila : matriz) {
	        for (int num : fila) {
	            System.out.printf("%4d", num);  
	        }
	        System.out.printf("\n");
	    }
	    System.out.printf("\n");

	   }
	
	private static void rellenaMatriz(int[][] numerosAleatorios) {
		Random aleatorio;
		aleatorio = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {

			for (int j = 0; j < numerosAleatorios[i].length; j++) {

				numerosAleatorios[i][j] = aleatorio.nextInt(1, 101);

			}

		}

	}

}