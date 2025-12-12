/**
 * 
 */
package examenund1_2;

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

public class App_4 {

	public static void main(String[] args) {

		// Declara Variables
		int altura;
		Scanner entrada;

		// Inicializar Variables
		entrada = new Scanner(System.in);

		// Operativa y salida de datos

		System.out.printf("Introduce un número entero n (altura):");
		altura = entrada.nextInt();

		for (int i = 1; i <= altura; i++) {

			// asteriscos
			for (int j = i; j < altura; j++) {
				System.out.printf("%c", ' ');
			}

			// asteriscos
			for (int j = 0; j < 2 * i - 1; j++) {

				if (i == 1 || j == 0 || j == 2 * i - 2) {
					System.out.printf("%d", i%10);
				} else if (j == (2 * i - 2)/2) {
					System.out.printf("|");
				} else {
					System.out.printf("/");
				}

			}
			System.out.printf("%n");
		}

		entrada.close();

	}
}
