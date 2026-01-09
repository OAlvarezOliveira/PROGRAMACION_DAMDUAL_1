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

/*
 * Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector
 * con datos leídos por el teclado. Copia los elementos del vector en otro
 * vector pero en orden inverso, y muéstralo por la pantalla.
 */

public class Ejercicio01 {
	
	private static final int TAMANHO = 5;

	public static void main(String[] args) {

		String[] v;
		String[] copia;

		v = crearVector();
		copia= copiarVector(v);
		System.out.printf("Vector Original \n");
		imprimirVector(v);
		System.out.printf("Vector Copia \n");
		imprimirVector(copia);

	}

	public static String[] crearVector() {

		String[] v = new String[TAMANHO];
		Scanner teclado = new Scanner(System.in, "UTF-8");

		for (int i = 0; i < v.length; i++) {
			System.out.printf("Añade un valor al vector caracteres ");
			v[i] = teclado.nextLine(); // Asigna el valor de caracter a la posición 'i' del vector v;
		}
		teclado.close();
		return v;

	}

	public static String[] copiarVector(String[] vectorOriginal) {
		
		String[] copia = new String[vectorOriginal.length]; 
		
		
		for (int i = 0 ,j = TAMANHO - 1;  i < vectorOriginal.length; i++, j-- ) {
			
			copia[j]=vectorOriginal[i];
		}
		
		return copia;
	}

	public static void imprimirVector(String[] v) {

		for (String s : v) {
			System.out.printf("%s\n", s);
		}

	}

}
