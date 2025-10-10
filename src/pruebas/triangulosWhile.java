package pruebas;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01While.java
 */

import java.util.Scanner;

/*
Dibuja un triángulo creciente de asteriscos, 
del tamaño que indique el usuario.
 */

public class triangulosWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// System.out.print("Introduce el tamaño del triángulo: ");
		// int lado = scanner.nextInt();

		int lado = 4;
		int fila = 0;
		int colEspacio = 0;
		int colAsterisco = 0;

		// Filas
		while (fila < lado) {

			// Imprimir espacios
			while (colEspacio < lado - fila - 1) {
				System.out.print(" ");
				colEspacio++;
			}

			// Imprimir asteriscos 
			while (colAsterisco < fila * 2 + 1) {			
				System.out.print("*");
				colAsterisco++;
			}

			// Saltar a la siguiente Fila
			System.out.println();
			colAsterisco= 0;
			colAsterisco= 0;
			fila++;
		}
		scanner.close(); 
	}
}
