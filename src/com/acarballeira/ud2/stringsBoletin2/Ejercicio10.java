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
Crear una función contrasinalForte que reciba la contraseña. Deberá verificar que:
a. La longitud sea como mínimo de 8.
b. Deberá tener 2 o más mayúsculas, 1 o más minúscula y más de 5 números.
c. La función indicará si es o no Fuerte la contraseña evaluada
 *
 */

import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio10 {

	public static void main(String[] args) {

		if (contrasinalForte("AAbc12345..")) {
			System.out.printf("Es fuerte");
		} else {
			System.out.printf("No es fuerte");
		}

	}

	private static boolean contrasinalForte(String passw) {

		String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numeros = "0123456789";
		boolean esFuerte;
		int cont;

		esFuerte = true;

		if (passw.length() < 8) {
			esFuerte = false;
		}

		// Comprobo mayúsculas
		cont = 0;
		for (int i = 0; i < passw.length(); i++) {
			if (letras.indexOf(passw.charAt(i)) != -1) {
				cont++;
			}
		}

		if (cont < 2) {
			esFuerte = false;
		}
		// Comprobo minúsculas
		letras = letras.toLowerCase();
		cont = 0;
		for (int i = 0; i < passw.length(); i++) {
			if (letras.indexOf(passw.charAt(i)) != -1) {
				cont++;
			}
		}

		if (cont < 1) {
			esFuerte = false;
		}

		// Comprobamos números
		cont = 0;
		FUERA: for (int i = 0; i < passw.length(); i++) {
			if (numeros.indexOf(passw.charAt(i)) != -1) {
				cont++;
				if (cont == 5) {
					break FUERA;
				}
			}
		}

		if (cont < 5) {
			esFuerte = false;
		}

		return esFuerte;

	}

}
