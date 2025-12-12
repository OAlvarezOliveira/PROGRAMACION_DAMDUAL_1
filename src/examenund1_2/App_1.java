/**
 * 
 */
package examenund1_2;

import java.util.Scanner;

/**
 * Resolucion de la tarea examenund1_2
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class App_1 {

	public static void main(String[] args) {

		int numero1;
		int numero2;

		int suma1;
		int suma2;
		Scanner entrada;

		entrada = new Scanner(System.in);
		suma1 = 0;
		suma2 = 0;
		numero1 = -1;
		numero2 = -1;

		// Perfecto 1
		while (numero1 != 0) {

			numero1 = entrada.nextInt();
			suma1 = 0;

			for (int i = 1; i <= numero1 / 2; i++) {

				if (numero1 % i == 0) {
					suma1 += i;
				}

			}

		}

		// Perfecto 2
		while (numero2 != 0) {

			numero2 = entrada.nextInt();
			suma2 = 0;

			for (int i = 1; i <= numero2 / 2; i++) {

				if (numero1 % i == 0) {
					suma2 += i;
				}

			}

		}
		
		if (suma1 == suma2) {
			
			System.out.printf("Son Amigos");

			
		}else {
			
			System.out.printf("No son Amigos");

		}	

		entrada.close();
	}

}
