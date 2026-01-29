/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: ValidaciónDNI.java
 */

package pruebas;

import java.io.InputStream;
import java.util.Scanner;

/**
 * 
 */
public class ValidaciónDNIArch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		InputStream ip = ValidaciónDNIArch.class.getResourceAsStream("dnis.txt");
		Scanner entrada = new Scanner(ip);
		String linea;
		int conDNIVal = 0;
		int conDNIINVal = 0;

		while (entrada.hasNext()) {

			linea = entrada.nextLine();

			boolean dniValido = validarFormatoDNI(linea);

			if (dniValido) {
				conDNIVal++;
			} else {
				conDNIINVal++;
			}

		} // FIN WHILE

		System.out.printf("numDNI Validos procesados: %d \n", conDNIVal);
		System.out.printf("numDNI NO Validos procesados: %d \n", conDNIINVal);
		
		entrada.close();
	}

	private static boolean validarFormatoDNI(String linea) {
		String patron = "\\d{8}[A-Z]";
		String letras = "TRWAGMYFPDXBNJZSQVHLCKET";
		int numDNI;
		char letraDNI;
		boolean esValido = false;

		if (linea.matches(patron)) {

			numDNI = Integer.parseInt(linea.substring(0, 8));
			letraDNI = linea.charAt(8);

			if (letraDNI == letras.charAt(numDNI % 23)) {
				esValido = true;
			}

		} else {
			esValido = false;
		}

		return esValido;

	}

}
