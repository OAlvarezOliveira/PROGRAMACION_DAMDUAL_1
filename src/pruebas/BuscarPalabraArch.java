/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: BuscaPalabraArch.java
 */

package pruebas;

import java.io.InputStream;
import java.util.Scanner;

public class BuscarPalabraArch {
	public static void main(String[] args) {

		buscarPalabra("java");
	}

	static void buscarPalabra(String palabra) {
		InputStream ip = BuscarPalabraArch.class.getResourceAsStream("palabras.txt");
		Scanner sc = new Scanner(ip);

		int contador = 0;

		while (sc.hasNext()) {
			String linea = sc.nextLine();

			linea = linea.toLowerCase();
			if (linea.contains(palabra)) {
				contador++;
				System.out.printf("%s \n", linea);
			}
		}

		System.out.println("Líneas con \"" + palabra + "\": " + contador);
		sc.close();
	}
}
