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
		Scanner scanner = new Scanner(System.in, "UTF-8");

		System.out.printf("Introduce el texto a cifrar: \n");
		String textoOriginal = scanner.nextLine();

		String textoCifrado = cifrarTexto(textoOriginal);

		System.out.printf("Texto original: %s \n", textoOriginal);
		System.out.printf("Texto cifrado: %s \n", textoCifrado);

		scanner.close();
	}

	private static String cifrarTexto(String texto) {
		String resultado = "";

		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);

			if (esVocal(c)) {
				resultado += cifrarVocal(c);
			} else if (esConsonante(c)) {
				resultado += cifrarConsonante(c);
			} else if (esNumero(c)) {
				resultado += cifrarNumero(c);
			} else {
				resultado += c; // Espacios y otros caracteres sin cambiar
			}
		}

		return resultado;
	}

	private static boolean esVocal(char c) {

		String vocales = "OIEAUoieau";

		if (vocales.indexOf(c) != -1) {

			return true;
		} else
			return false;

	}

	private static boolean esConsonante(char c) {
		String consonantes = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";

		if (consonantes.indexOf(c) != -1) {

			return true;
		} else
			return false;

	}

	private static boolean esNumero(char c) {
		String numeros = "0123456789";

		if (numeros.indexOf(c) != -1) {

			return true;
		} else
			return false;

	}

	private static String cifrarVocal(char c) {

		switch (Character.toUpperCase(c)) {
		case 'O':
			return "0";
		case 'I':
			return "1";
		case 'E':
			return "2";
		case 'A':
			return "3";
		case 'U':
			return "4";
		default:
			return "";
		}

	}

	private static String cifrarConsonante(char c) {

		String consonantesMayus = "BCDFGHJKLMNPQRSTVWXYZ";
		String consonantesMinus = "bcdfghjklmnpqrstvwxyz";

		String consonantes;
		if (Character.isUpperCase(c)) {
			consonantes = consonantesMayus;
		} else {
			consonantes = consonantesMinus;
		}

		int posicion = consonantes.indexOf(c);

		if (posicion != -1) {
			int siguientePosicion = (posicion + 1) % consonantes.length();
			return String.valueOf(consonantes.charAt(siguientePosicion));
		}

		return String.valueOf(c); // Si no es consonante, devolver sin cambios

	}

	private static String cifrarNumero(char c) {
		switch (c) {
		case '0':
			return "i";
		case '1':
			return "-";
		case '2':
			return "..";
		case '3':
			return "$";
		case '4':
			return "%";
		case '5':
			return "&";
		case '6':
			return "/";
		case '7':
			return "(";
		case '8':
			return ")";
		case '9':
			return "0";
		default:
			return "";
		}
	}

}
