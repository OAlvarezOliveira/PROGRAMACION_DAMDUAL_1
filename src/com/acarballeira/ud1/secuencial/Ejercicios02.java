package com.acarballeira.ud1.secuencial;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */
import java.util.Scanner;

public class Ejercicios02 {

	public static void main(String[] args) {

		// Declaracion de variables
		double altura;
		double base;
		double res;
		Scanner teclado = new Scanner(System.in);
		teclado.close();


		// Inicializacion

		// Entrada de datos
		System.out.println("introduce la altura:");
		altura = teclado.nextDouble();
		System.out.println("introduce la base:");
		base = teclado.nextDouble();

		// Operativa
		res = (altura * base) / 2;
		// Salida de informacion
		System.out.println("El resultado es:" + res);

	}

}
