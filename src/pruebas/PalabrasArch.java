/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: PalabrasArch.java
 */

package pruebas;

import java.io.InputStream;
import java.util.Scanner;

/**
 * 
 */
public class PalabrasArch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		InputStream ip = PalabrasArch.class.getResourceAsStream("texto.txt");
		Scanner entrada = new Scanner(ip);
		int cantLineas = 0;
		int cantPalabras = 0;
		int comienzanVocales = 0;
		int posicionMasLarga = 0;
		String linea;
		String[] palabras = null;

		String palabraMasLarga = "";
		int longitudMaxima = Integer.MIN_VALUE;

		while (entrada.hasNext()) {

			linea = entrada.nextLine();
			// Total de líneas no vacías
			if (!(linea.isEmpty())) {
				cantLineas++;
			}

			palabras = linea.split(" ");

			// Total de palabras
			cantPalabras += palabras.length;

			for (int i = 0; i < palabras.length; i++) {
				String palabra = palabras[i];
				// Palabras que empiezan con vocal
				if ("aeiouáéíóúAEIOUÁÉÍÓÚ".indexOf(palabra.charAt(0)) != -1) {
					comienzanVocales++;
				}

				// Palabra más larga (y su longitud)

				if (palabras[i].length() > longitudMaxima) {

					longitudMaxima = palabras[i].length();
					palabraMasLarga = palabras[i];
					posicionMasLarga = i;
				}
			} // Fin FOR

		} // Fin WHILE

		System.out.printf("\t=== ANÁLISIS DE TEXTO ===\n");

		System.out.printf("\tTotal de palabras: %d \n", cantPalabras);

		System.out.printf("\tTotal de líneas no vacías: %d \n", cantLineas);

		System.out.printf("\tTotal de palabras que comienzan por vocales: %d \n", comienzanVocales);

		System.out.printf("\tLa palabra mas larga es : %s \n", palabraMasLarga);

		System.out.printf("\tLongitud de la palabra mas larga: %d \n", longitudMaxima);
	}

}
