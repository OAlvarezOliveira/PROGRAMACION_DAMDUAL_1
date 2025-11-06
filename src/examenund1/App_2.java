package examenund1;

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

public class App_2 {

	public static void main(String[] args) {

		// Declaracion de variables
		int a;
		int b;
		Scanner entrada = new Scanner(System.in);

		// Inicializar variables

		// Toma de datos
		System.out.println("Introduce el alto del rectangulo");
		a = entrada.nextInt();
		System.out.println("Introduce el ancho del cuadrado");
		b = entrada.nextInt();

		// Operativa
		for (int i = 0; i < a; i++) {

			for (int j = 0; j < b; j++) {

				if (i == 0 || j == 1 || j == 0 || i == b - 1 || j == b - 2 || j == b - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();

		}
		entrada.close();
	}

}