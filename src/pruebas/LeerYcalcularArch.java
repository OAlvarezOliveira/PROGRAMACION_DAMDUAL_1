/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: LeerYcalcular.java
 */

package pruebas;

import java.io.InputStream;
import java.util.Scanner;

public class LeerYcalcularArch {
	public static void main(String[] args) {
		procesarNumeros();
	}

	static void procesarNumeros() {
		InputStream ip = LeerYcalcularArch.class.getResourceAsStream("numeros2.txt");
		Scanner sc = new Scanner(ip);

		int suma = 0;
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int contador = 0;

		while (sc.hasNext()) {
			int num = sc.nextInt();

			// mayor
			if (num > mayor) {
				mayor = num;
			}

			// menor
			if (num < menor) {
				menor = num;
			}

			suma += num;

			contador++;
		}

		double media = (double) suma / contador;

		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
		System.out.println("Mayor: " + mayor);
		System.out.println("Menor: " + menor);

		sc.close();
	}
}