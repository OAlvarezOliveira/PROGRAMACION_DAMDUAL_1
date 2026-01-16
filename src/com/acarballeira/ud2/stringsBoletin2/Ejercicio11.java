/**
 * 
 */
package com.acarballeira.ud2.stringsBoletin2;

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
 * Crear un programa de cifrado de cadenas, que implemente un algoritmo que
 * tiene como entrada un texto. El texto de entrada no contendrá ni tildes ni
 * eñes. • El algoritmo de cifrado de mensajes de texto estará basado en las
 * reglas siguientes: • Las vocales se sustituirán por un número, según la tabla
 * siguiente. O=0 I=1 E=2 A=3 U=4 0 1 2 3 4 • Cada consonante debe sustituirse
 * por el carácter siguiente según el abecedario, no teniendo en cuenta las
 * vocales • Los números se codificarán según la siguiente tabla. = i - .. $ % &
 * / ( ) 0 1 2 3 4 5 6 7 8 9
 */
public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String texto;

		Scanner entrada = new Scanner(System.in);

		texto = entrada.nextLine();

		cifraTexto(texto);

	}

	private static String cifraTexto(String texto) {

		String vocales = "OIEAUoieau";
		String cifraVocales = "0123401234";
		String textoCifrado;

		for (int i = 0; i < texto.length(); i++) {
			char caracterActual = texto.charAt(i);
			int indiceVocal = vocales.indexOf(caracterActual);

			if (indiceVocal != -1) {
				// Si es vocal, añadir el número correspondiente
				textoCifrado.append(cifraVocales.charAt(indiceVocal));

				return textoCifrado;

			}

		}

	}

}
