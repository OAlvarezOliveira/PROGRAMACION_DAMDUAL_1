/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio170.java
 */

package aceptaelreto;

import java.util.Scanner;

/**
 * Triángulos con piedras Tiempo máximo: 6,000 s Memoria máxima: 4096 KiB En su
 * última clase, Dianthe aprendió lo que son los números triangulares. "Si
 * tenéis un número triangular de piedrecitas — les decía Pitágoras — podréis
 * formar un triángulo con el mismo número de piedras en cada lado". Cogiendo
 * pequeñas piedras del suelo, les hizo una demostración:
 * 
 * Ejemplos de triángulos con piedras Con una sola piedra, se puede formar un
 * triángulo de lado 1. Con 3, se puede formar un triángulo de lado 2. Serán
 * necesarias 10 piedras para formar un triángulo de lado 4. En cada paso, se
 * suma una piedra más a las que se añadieron en el paso anterior. Es decir,
 * primero se pone una piedra, luego dos más, luego tres más, y así
 * sucesivamente.
 * 
 * Dianthe se pregunta de qué tamaño será el triángulo más grande que puede
 * formar así, si tiene 1000 piedras (aunque es posible que le sobren algunas).
 * ¿Puedes ayudarla?
 * 
 * Entrada La entrada estará compuesta por múltiples casos de prueba. Cada uno
 * contendrá un único número en una línea, indicando el número de piedras que
 * tiene Dianthe (hasta 250.000.000).
 * 
 * La entrada terminará cuando el valor sea 0, que no deberá procesarse.
 * 
 * Salida Para cada caso de prueba se debe indicar el tamaño de los lados del
 * triángulo más grande que se puede formar con las piedras disponibles, así
 * como el número de piedras que sobrarán.
 * 
 * Entrada de ejemplo 1 6 13 0 Salida de ejemplo 1 0 3 0 4 3
 */
public class Problema170 {

	public static void main(String[] args) {

		// Declaracion
		Scanner entrada;
		long piedrasIniciales;
		long piedrasUsadas;
		long piedrasRestantes;
		int lado;
		boolean procesa;

		// Inicializacion
		procesa = true;
		piedrasUsadas = 0;
		piedrasRestantes = 0;
		lado = 0;
		entrada = new Scanner(System.in);

		// Operativa
		while (procesa) {
			piedrasIniciales = entrada.nextInt();
			// piedrasIniciales = 25;

			if (piedrasIniciales == 0) {
				procesa = false; // finaliza la lectura
			} else {

				piedrasRestantes = piedrasIniciales;
				piedrasUsadas = 0;

				for (int i = 1; piedrasUsadas + i <= piedrasIniciales; i++) {
					piedrasUsadas += i;
					lado = i; // Guarda cuál fue el último lado completado
				}

				piedrasRestantes = piedrasIniciales - piedrasUsadas;
				//Salida de datos
				System.out.printf("%d %d%n", lado, piedrasRestantes);

			}

		} // Fin While
		entrada.close();
	}
}