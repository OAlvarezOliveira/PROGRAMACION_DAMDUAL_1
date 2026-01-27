/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: LeerContarArch.java
 */

package pruebas;

/**
 * 
 */
import java.io.InputStream;
import java.util.Scanner;

public class LeerContarArch {
	public static void main(String[] args) {
		contarLineas();
	}

	static void contarLineas() {
		InputStream ip = LeerContarArch.class.getResourceAsStream("numeros.txt");
		Scanner sc = new Scanner(ip);

		int totalLineas = 0;
		int lineasNoVacias = 0;

		while (sc.hasNext()) {
			String linea = sc.nextLine();
			totalLineas++;

			if (linea.length() != 0) {
				lineasNoVacias++;
			}

		}

		System.out.println("Total líneas: " + totalLineas);
		System.out.println("Líneas no vacías: " + lineasNoVacias);

		sc.close();
	}
}