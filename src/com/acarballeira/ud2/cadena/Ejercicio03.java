package com.acarballeira.ud2.cadena;

import java.util.Scanner;

/*
3. Contar el número de palabras de una frase.
 * */

public class Ejercicio03 {

	public static void main(String[] args) {

		String frase;
		String[] resultado;

		System.out.printf("Introduce una frase para procesar %n");
		Scanner entrada = new Scanner(System.in);

		frase = entrada.nextLine();

		resultado = frase.trim().split("\\s+");

		System.out.println(resultado.length);
		entrada.close();
	}

}
