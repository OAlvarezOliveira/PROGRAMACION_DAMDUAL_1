/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: ValidarDNI.java
 */

package pruebas;

import java.util.Scanner;

/**
 * 
 */
public class ValidarDNI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in, "UTF-8");
		boolean dniValido;
		dniValido = validarFormatoDNI(entrada);

		if (dniValido) {
			System.out.printf("El DNI introducido es un DNI Español correcto");
		} else {
			System.out.printf("El DNI introducido NO es un DNI Español correcto");
		}

	}

	private static boolean validarFormatoDNI(Scanner entrada) {
		String patron;
		String letras = "TRWAGMYFPDXBNJZSQVHLCKET";
		String dni;
		int numDNI;
		char letraDNI;
		boolean esValido = false;

		patron = "\\d{8}[A-Z]";

		System.out.printf("Introduce el DNI a  validar: \n");
		dni = entrada.nextLine();


		if (dni.matches(patron)) {

			numDNI = Integer.parseInt(dni.substring(0,8));
			letraDNI = dni.charAt(8);

			System.out.printf("numDNI: %d \n", numDNI);
			System.out.printf("letraDNI: %c \n", letraDNI);

			if (letraDNI == letras.charAt(numDNI % 23)) {
				esValido = true;
			}

		} else {
			esValido = false;
		}

		return esValido;

	}

}
