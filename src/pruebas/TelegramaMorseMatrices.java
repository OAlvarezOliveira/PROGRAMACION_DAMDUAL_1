/**
 * 
 */
package pruebas;

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
 * @author O.Alvarez
 *
 */

public class TelegramaMorseMatrices {

	static String[][] morse = { { "A", ".-" }, { "B", "-..." }, { "C", "-.-." }, { "D", "-.." }, { "E", "." },
			{ "F", "..-." }, { "G", "--." }, { "H", "...." }, { "I", ".." }, { "J", ".---" }, { "K", "-.-" },
			{ "L", ".-.." }, { "M", "--" }, { "N", "-." }, { "O", "---" }, { "P", ".--." }, { "Q", "--.-" },
			{ "R", ".-." }, { "S", "..." }, { "T", "-" }, { "U", "..-" }, { "V", "...-" }, { "W", ".--" },
			{ "X", "-..-" }, { "Y", "-.--" }, { "Z", "--.." }, { "!", "-.-.--" }, { "?", "..--.." }, };

	public static void main(String[] args) {

		int numCasos;
		int tiempo;
		String linea;
		String letra;
		String codigo;

		numCasos = Integer.parseInt(leerTexto());

		for (int i = 0; i < numCasos; i++) {
			tiempo = 0;
			codigo = "";
			linea = leerTexto();
			linea = linea.toUpperCase();

			// Calcular el valor de tiempo
			// Leemos letra a letra
			for (int j = 0; j < linea.length(); j++) {
				// letra = "" + linea.charAt(j);
				// letra = linea.substring(j, j + 1);
				letra = String.valueOf(linea.charAt(j));

				if (letra.equals(" ")) {
					tiempo += 5;
					continue;
				}
				// Buscar letra en la matriz "morse"
				for (int k = 0; k < morse.length; k++) {
					if (letra.equals(morse[k][0])) {
						codigo = morse[k][1];
						break;
					}
				}

				System.out.println(codigo);
				// Ahora con el código calculamos el tiempo ocupado
				for (int k = 0; k < codigo.length(); k++) {
					if (codigo.charAt(k) == '.') {
						tiempo += 1;
					} else {
						tiempo += 3;
					}
					// Separación entre dos símbolos. Descartamos el último
					if (k < codigo.length() - 1) {
						tiempo += 1;
					}
				}

				// Espacio temporal entre letras, salvo la última
				if (j < linea.length() - 1 && linea.charAt(j + 1) != ' ') {
					tiempo += 3;
				}
			} // for

			// Salida
			System.out.printf("%d%n", tiempo);
		} // for numCasos

	}

	static String leerTexto() {

		Scanner teclado;
		teclado = new Scanner(System.in);
		return teclado.nextLine();

	}

}
