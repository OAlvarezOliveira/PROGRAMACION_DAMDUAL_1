package com.acarballeira.ud2.cadena;

import java.util.Scanner;

/*5. Contar el número de veces que aparece un carácter en un texto.*/

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase;
		char caracter;
		int contador;
		Scanner entrada;

		contador = 0;
		entrada = new Scanner(System.in);

		System.out.printf("Introduce una frase para procesar %n");
		frase = entrada.nextLine();

		System.out.printf("Introduce el caracter a buscar en la frase anterior %n");
		caracter = entrada.next().charAt(0);

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == caracter) {
				contador++;
			}

		}

		System.out.printf("El resultado es: %d %n", contador);
		entrada.close();
	}

}
