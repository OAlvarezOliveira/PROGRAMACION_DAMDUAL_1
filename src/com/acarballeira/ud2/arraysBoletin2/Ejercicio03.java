package com.acarballeira.ud2.arraysBoletin2;

import java.util.Scanner;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class Ejercicio03 {

	private static final int TAMANHO = 5;

	public static void main(String[] args) {

		int [] v1;
		int[] v2;
		int[] suma;


		v1 = crearVector();
		v2 = crearVector();
		suma= sumarVectores(v1,v2);
		System.out.printf("Mostrando suma de Vectores V1 y V2 \n");
		imprimirVector(suma);

	}

	public static int[] crearVector() {

		int[] v = new int[TAMANHO];
		Scanner teclado = new Scanner(System.in, "UTF-8");

		for (int i = 0; i < v.length; i++) {
			System.out.printf("Añade un valor al vector caracteres ");
			v[i] = teclado.nextInt(); // Asigna el valor de caracter a la posición 'i' del vector v;
		}

		return v;

	}

	public static int[] sumarVectores(int [] v1, int[] v2) {
		
		int[] suma = new int[v1.length]; 
		
		
		for (int i = 0 ;  i < v1.length; i++ ) {
			
			suma[i]= v1[i] + v2[i];
		}
		
		return suma;
	}

	public static void imprimirVector(int[] v) {

		for (int d : v) {
			System.out.printf("%d\n", d);
		}

	}

}
