package com.acarballeira.ud1.breakcontinue;



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
 * 
 * Crea un programa en Java que amose a suma dos números 1000 a 1100 ambos
 * inclusive. Debes implementar a solución mediante un bucle while infinito.
 * 
 */

public class Ejercicio04 {

	public static void main(String[] args) {

		// Declaracion de Variables
		int cont;
		int acum;

		// Inicializacion de Variables

		cont = 1000;
		acum = 0;

		// Operativa

		while (true) {

			if (cont > 1100) {
				break;
			}
			acum += cont++;

		}
		System.out.println("La suma de 1000 a 1100 es :" + acum);

	}

}
