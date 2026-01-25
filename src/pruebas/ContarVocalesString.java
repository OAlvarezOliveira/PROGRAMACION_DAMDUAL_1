/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: ContarVocalesString.java
 */

package pruebas;

import java.util.Scanner;

/**
 * 
 */
public class ContarVocalesString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in, "UTF-8");

		int numeroVocales;

		numeroVocales = contarVocales(entrada);

		System.out.printf("La palabra introducida contiene: %d vocales \n", numeroVocales);

	}

	private static int contarVocales(Scanner entrada) {

		int cuentaVocales = 0;
		String palabra;
		String vocales = "aeiouáéíóú";
		char c;
		System.out.printf("Introduce la palabra/frase para contar Vocales \n");
		palabra = entrada.nextLine();

		for (int i = 0; i < palabra.length(); i++) {

			c = Character.toLowerCase(palabra.charAt(i));

			if (vocales.indexOf(c) != -1) {
				cuentaVocales++;
			}

		}
		return cuentaVocales;

	}

}
