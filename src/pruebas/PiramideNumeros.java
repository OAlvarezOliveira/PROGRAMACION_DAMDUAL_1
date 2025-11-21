/**
 * 
 */
package pruebas;

import java.util.Random;
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

/**
 * @author  O.Alvarez
 *
 */
public class PiramideNumeros {

	public static void main(String[] args) {

		// Declara Variables
		int altura;
		int  num;
		Random aleatorio;


		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un número entero n (altura):");
		altura = entrada.nextInt();

		for (int i = 1; i <=  altura; i++) {

			// Espacios
			for (int j = i; j < altura  ; j++) {
				System.out.print("  "); //doble espacio
			}

			// Random
			for (int j = 0; j < i   ; j++) {

				aleatorio = new Random();
				num = aleatorio.nextInt(10,100);
				System.out.print(num+"  ");//num + doble espacio
			}

			System.out.println();

		}
		entrada.close();
	}
}
