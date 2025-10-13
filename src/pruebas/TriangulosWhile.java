package pruebas;

import java.util.Scanner;

public class TriangulosWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Puedes descomentar esta línea para entrada por teclado
		// System.out.print("Introduce el tamaño del triángulo: ");
		// int lado = scanner.nextInt();

		int lado = 4;
		int fila = 0;

		while (fila < lado) {
			int colEspacio = 0;
			int colAsterisco = 0;

			while (colEspacio < lado - fila - 1) {
				System.out.print(" ");
				colEspacio++;
			}

			while (colAsterisco < fila * 2 + 1) {
				System.out.print("*");
				colAsterisco++;
			}

			System.out.println();
			fila++;
		}

		scanner.close();
	}
}

