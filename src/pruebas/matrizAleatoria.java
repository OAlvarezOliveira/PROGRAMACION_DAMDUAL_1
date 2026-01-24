/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: matrizAleatoria.java
 */

package pruebas;

import java.util.Random;
import java.util.Scanner;

/**
 * A1 - BÁSICO: Matriz aleatoria Enunciado: Pedir al usuario filas y columnas.
 * Crear una matriz de ese tamaño, rellenarla con números aleatorios entre 1 y
 * 50, e imprimirla de forma bonita. Objetivo: Dominar creación dinámica de
 * matrices y recorrido para imprimir.
 */
public class matrizAleatoria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in, "UTF-8");

		int[][] numerosAleatorios = generaMatriz(entrada);

		rellenaMatriz(numerosAleatorios);
		imprimereMatriz(numerosAleatorios);
		entrada.close();

	}

	private static void imprimereMatriz(int[][] numerosAleatorios) {
	    for (int[] fila : numerosAleatorios) {          
	        for (int numero : fila) {                     
	            System.out.printf("\t%d", numero);
	        }
	        System.out.printf("\n");
	    }
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
