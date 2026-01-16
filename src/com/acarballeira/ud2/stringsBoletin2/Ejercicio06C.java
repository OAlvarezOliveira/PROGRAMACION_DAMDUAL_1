/**
 * 
 */
package com.acarballeira.ud2.stringsBoletin2;

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
 * @author O.Alvarez
 *
 */
public class Ejercicio06C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num;

		num = numeroConsontates("Julio Mosquera Gonzalez");
		System.out.printf("Numero de consonantes distintas %d", num);

	}

	private static int numeroConsontates(String cadena) {

		char[] consonantes = { 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'P', 'Q', 'R', 'S', 'T', 'V',
				'W', 'X', 'Y', 'Z' };
		int cont;
		boolean encontrado;

		cont = 0;
		cadena = cadena.toUpperCase();

		for (int i = 0; i < consonantes.length; i++) {
			encontrado = false;

			for (int j = 0; j < cadena.length() && !encontrado; j++) {
				if (consonantes[i] == cadena.charAt(i)) {
					cont++;
					encontrado= true;
				}

			}

		}

		return cont++;
	}

}
