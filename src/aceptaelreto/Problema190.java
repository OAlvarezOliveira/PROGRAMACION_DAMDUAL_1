/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema190.java
 */

package aceptaelreto;

import java.util.Scanner;

/**
 * Dividir factoriales Tiempo máximo: 1,000-4,000 s Memoria máxima: 4096 KiB Es
 * sabido que el factorial de un número positivo n, escrito n!, es la
 * multiplicación de todos los números entre 1 y n. Por ejemplo, 5! es 5 · 4 · 3
 * · 2 · 1 = 120.
 * 
 * Con un ordenador, calcular el factorial de un número es fácil, de modo que
 * esta vez te pedimos que nos digas el resultado de dividir dos factoriales.
 * ¿Eres capaz?
 * 
 * Entrada La entrada está compuesta de múltiples casos de prueba, uno por
 * línea.
 * 
 * Un caso de prueba se compone de dos números separados por un espacio, num y
 * den. Ambos serán números positivos mayores que 0 y menores que 1.000.000.
 * 
 * La entrada termina con un caso en el que num < den, que no debe procesarse.
 * 
 * Salida Para cada caso de prueba se mostrará, en una línea independiente, el
 * resultado de dividir num! y den!, es decir num!den! . Se garantiza que el
 * resultado será siempre menor que 263.
 * 
 * Entrada de ejemplo 5 2 6 5 8 3 17 8 1 2 Salida de ejemplo
 * 
 * 60 6 6720 8821612800
 */
public class Problema190 {

	public static void main(String[] args) {

		// Declarar Variables

		long num;
		long den;
		long resultado;
		Scanner entrada;

		// Inicializar Variables Generales
		num = 1;
		den = 1;
		resultado = 0;
		entrada = new Scanner(System.in);

		while (num >= den) {

			// Inicializar Variable para cada caso
			resultado = 1;

			num = entrada.nextInt();
			den = entrada.nextInt();

			if (num >= den) {
//				System.out.println("num " + num); // DEBUGG
//				System.out.println("den " + den); // DEBUGG

				// Calcular factorial
				for (long i = den + 1; i <= num; i++) {
					resultado *= i;
				}
				System.out.println(resultado);
			}

		} // Fin del caso

		entrada.close();
	}

}
