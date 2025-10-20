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

public class Bucle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * int contador; int num; num = 7; contador=0;
		 * 
		 * while(contador <= 10){ System.out.println(num+" x " + contador + "=\t" +
		 * (num*contador)); contador++; }
		 * 
		 * for (int i = 0 ; i<=10;i++ ) { System.out.println(i);
		 * 
		 * }
		 */
		Scanner teclado = new Scanner(System.in);
		char letra;
		System.out.println("Introduce opcion:");
		letra = teclado.next().charAt(0);
		while (letra != 'x') {
			System.out.println("Hola");
			System.out.print("Introduce opcion:");
			letra = teclado.next().charAt(0);
		}
		teclado.close();
	}

}
