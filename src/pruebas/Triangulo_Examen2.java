package pruebas;

import java.util.Scanner;

public class Triangulo_Examen2 {

	public static void main(String[] args) {

		// Declara Variables
		int altura;
		Scanner  entrada;
		
		//Inicializar Variables
		entrada = new Scanner(System.in);
		
		
		//Operativa y salida de datos

		System.out.printf("Introduce un número entero n (altura):");
		altura = entrada.nextInt();

		for (int i = 1; i <= altura; i++) {

			// espacios
			for (int j = i; j < altura; j++) {
				System.out.printf("%c", ' ');
			}

			// asteriscos
			for (int j = 0; j < 2 * i - 1; j++) {

				if (i <= 9) {
					if (j == 0 || j == 2 * i-2 ){
						System.out.printf("%d", i);
					} else if (j == i-1) {
						System.out.printf("|");
					}else {
						System.out.printf("/");
					}
				}else {				
					if (j == 0 || j == 2 * i-2) {
						System.out.printf("%d", i%10);
					} else if (j == i-1) {
						System.out.printf("|");
					}else {
						System.out.printf("/");
					}
					
				}
				
			}

			System.out.printf("%n");

		}
		entrada.close();
	}
}