package com.acarballeira.ud2.arraysBoletin1;


/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class PruebasArrays {

	public static void main(String[] args) {
		int [] notas;
		notas = new int [20];
		
		notas[2] = 7;
		notas[7] = 10;

				
			
		//Analizar los valores por defecto
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("%d-",notas[i]);
		}
		System.out.println();

		//blucle for-each
		for (int nota : notas) {
			System.out.printf("%d-",nota);
			
		}
			
		int [][] nota_asignatura;
		nota_asignatura = new int [3][4];

	}

}
