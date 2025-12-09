/**
 * 
 */
package examenund1_2;

import java.util.Scanner;

/**
 * Resolucion de la tarea  examenund1_2
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
		boolean perfecto1;
		boolean perfecto2;
		int suma;
		Scanner entrada;

		entrada = new Scanner(System.in);
		numero1 = -1;
		numero2 = -1;

		//Perfecto 1
		while (numero1 != 0) {

			numero1 = entrada.nextInt();
			suma = 0;

			for (int i = 1; i <= numero1 / 2; i++) {

				if (numero1 % i == 0) {
					suma += i;
				}

			}
			if (numero1 != 0) {

				if (suma == numero1) {
					perfecto1 = true;
				} else {
					perfecto2 = true;
				}

			}

		}
		
		//Perfecto 2
				while (numero2 != 0) {

					numero2 = entrada.nextInt();
					suma = 0;

					for (int i = 1; i <= numero2 / 2; i++) {

						if (numero1 % i == 0) {
							suma += i;
						}

					}
					if (numero2 != 0) {

						if (suma == numero2) {
							perfecto1 = true;
						} else {
							perfecto2 = true;
						}

					}

				}

		entrada.close();
	}

}
