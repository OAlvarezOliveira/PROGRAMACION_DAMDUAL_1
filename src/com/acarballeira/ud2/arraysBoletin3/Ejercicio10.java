/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio10.java
 */

package com.acarballeira.ud2.arraysBoletin3;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio10 {

	private final static int FILAS = 3;
	private final static int COLUMNAS = 3;
	static Scanner entrada = new Scanner(System.in, "UTF-8");

	public static void main(String[] args) {

		tresEnraya();

	}

	private static void tresEnraya() {

		String[][] tablero = new String[FILAS][COLUMNAS];
		int jugadas = 0;
		String player1 = "O";
		String player2 = "X";

		while (jugadas < 9) {

			jugadas = añadeficha(entrada, player1, tablero, jugadas);
			
			if (jugadas < 9) { 
				
				jugadas = añadeficha(entrada, player2, tablero, jugadas);

			}

			System.out.printf("No hay mas jugadas, Fin de partida");

		}

	}

	private static int añadeficha(Scanner entrada, String player, String[][] tablero, int jugadas) {

		boolean posicionValida = false;
		int posX;
		int posY;
		while (!posicionValida) {

			System.out.printf("Jugador " + player + ", introduce posición (fila columna):");
			posX = entrada.nextInt();
			posY = entrada.nextInt();

			if (posX >= 0 && posX < FILAS && posY >= 0 && posY < COLUMNAS && tablero[posX][posY] == null) {
				tablero[posX][posY] = player;
				posicionValida = true;
				jugadas++;
			} else {
				System.out.printf("Posicion no valida:");
			}
		}

		imprimeTablero(tablero);
		return jugadas;

	}

	private static void imprimeTablero(String[][] tablero) {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (tablero[i][j] == null) {
					System.out.printf("- ");
				} else {
					System.out.printf("%s ", tablero[i][j]);
				}
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
	}

}
