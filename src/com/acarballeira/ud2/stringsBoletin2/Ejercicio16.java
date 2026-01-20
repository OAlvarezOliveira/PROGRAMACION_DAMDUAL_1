/**
 * 
 */
package com.acarballeira.ud2.stringsBoletin2;

import java.io.InputStream;
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
 * Emprega a clase Scanner para ler as liñas dun ficheiro de texto e amosa o
 * resultado mediante consola.
 */
public class Ejercicio16 {

	public static void main(String[] args) {

		lerTexto();
	}

	static void lerTexto() {

		InputStream ip = Ejercicio16.class.getResourceAsStream("miArchivo.txt");
		Scanner sc = new Scanner(ip);

		while (sc.hasNext()) {
			System.out.printf("%s%n", sc.nextLine());
		}

	}

}
