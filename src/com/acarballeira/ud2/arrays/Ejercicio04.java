 package com.acarballeira.ud2.arrays;

import java.util.Random;


/**
 * Resolucion de la tarea
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

/*
Programa en el que se declare una matriz de dimensiones 5 x 8 (5 filas y 8 columnas) de datos de tipo entero. Asignarle a los elementos de la matriz valores generados al azar y comprendidos entre 20 y 40. Calcular cuál es el elemento mas pequeño y mayor de la tabla.
Escribir también la tabla para comprobar los resultados. La salida tiene que tener el formato:
Elemento menor:   XX           Fila: XX Columna:   XX
Elemento mayor:   XX           Fila: XX Columna:   XX
 */

public class Ejercicio04 {

	public static void main(String[] args) {

		// Declarar Variables
		int[][] matriz;
		final int LONGITUD_FIL;
		final int LONGITUD_COL;
		int eleMayor;
		int eleMenor;
		Random aleatorio;
		int filaMayor;
		int columnaMayor;
		int filaMenor;
		int columnaMenor;
		

		// Inicializar Variables
		LONGITUD_COL = 8;
		LONGITUD_FIL = 5;
		eleMayor     = 0 ;
		eleMenor     = 100;
		filaMayor    = 0 ;
		columnaMayor = 0 ;
		filaMenor    = 0 ;
		columnaMenor = 0 ;

		matriz = new int[LONGITUD_FIL][LONGITUD_COL];
		aleatorio = new Random();

        //Generar matriz
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {
				
				matriz[i][j] = aleatorio.nextInt(20,41);

			}

		}
		
		 //Determinar Mayor & Menor
		
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {
				
			if	(matriz[i][j]> eleMayor  ) { 
				eleMayor = matriz[i][j];
				filaMayor = i;
				columnaMayor = j;
						}
			else if (matriz[i][j]< eleMenor  ) { eleMenor = matriz[i][j]  ;
			filaMenor = i;
			columnaMenor = j;
			}

			}

		}
		
		
        //Pintar matriz
		for (int[] fila : matriz) {

			for (int elemento : fila) {
				System.out.printf("%02d ", elemento);

			}
			System.out.printf("%n");
		}
		System.out.printf("%n");
		// Imprime el elemento menor
		System.out.printf("Elemento menor:   %d           Fila: %d Columna:   %d\n", eleMenor, filaMenor, columnaMenor);

		// Imprime el elemento mayor
		System.out.printf("Elemento mayor:   %d           Fila: %d Columna:   %d\n", eleMayor, filaMayor, columnaMayor);


	}

}

