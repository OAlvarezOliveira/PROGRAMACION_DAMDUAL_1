/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema1491.java
 */

package aceptaelreto;

import java.util.Scanner;

/**
 * San Fermines Tiempo máximo: 1,000-3,000 s Memoria máxima: 4096 KiB Un buen
 * corredor de San Fermines intenta mantener la emoción para fomentar el
 * espectáculo. Este tipo de corredores está muy en forma y son capaces de
 * correr mucho más deprisa que los toros. Sin embargo, para mantener la
 * emoción, no lo hacen. Se limitan a mantener una velocidad adecuada para que
 * los toros se mantenga siempre cerca, pero no lleguen a pillarles.
 * 
 * El problema consiste en, dadas las velocidades de todos los toros que
 * participan en los San Fermines (y que se suponen constantes), ¿a qué
 * velocidad deben ir estos corredores expertos para mantener el espectáculo
 * conservando su integridad?
 * 
 * Entrada La entrada consta de una serie de casos de prueba, cada uno en una
 * línea. El primer número de la misma indica el número de toros que intervienen
 * en la carrera (n ≥ 1). A continuación aparece un entero por cada uno de los
 * toros, indicando la velocidad a la que correrá ese toro (recuerda, es
 * velocidad constante). La velocidad es siempre positiva y no excede 109.
 * 
 * Salida Para cada caso de prueba se mostrará una línea en la que aparecerá la
 * velocidad a la que deberán ir los corredores expertos para mantener el
 * espectáculo.
 * 
 * Entrada de ejemplo
 * 
 * 7 1 9 8 7 10 3 12 1 10 Salida de ejemplo 12 10
 */
public class Problema149 {

	public static void main(String[] args) {

		// INICIALIZACION VARIABLES
		int toros;
		int velocidadToro;
		int velMaxima;

		Scanner entrada;

		// DECLARACION VARIABLES

		entrada = new Scanner(System.in);

		// OPERATIVA
		while (entrada.hasNextInt()) {

			// Tarea1: Pide toros y resetea velocidadMaxima para calcualar el caso

			toros = entrada.nextInt();
			velMaxima = 0;

			// Tarea 2: Pide y comprueba velocidad por cada toro

			for (int i = 0; i < toros; i++) {

				velocidadToro = entrada.nextInt();

				if (velocidadToro > velMaxima) {
					velMaxima = velocidadToro;
				}

			}// Fin for Toros

			// SALIDA DE DATOS
			// Tarea 3: Muestra velocidad maxima
			System.out.printf("%d%n", velMaxima);

		} // Fin while Toros

		// Fin programa
		entrada.close();
	}
}
