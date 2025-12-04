/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema411.java
 */

package aceptaelreto;

import java.util.Scanner;

/**
 * Sobre la tela de una araña Tiempo máximo: 1,000-2,000 s Memoria máxima: 4096
 * KiB Dos elefantes saltando en una tela de araña Un elefante se balanceaba
 * sobre la tela de una araña. Como veía que no se caía, fue a llamar a otro
 * elefante.
 * 
 * Dos elefantes se balanceaban sobre la tela de una araña. Como veían que no se
 * caían, fueron a llamar a otro elefante.
 * 
 * Tres elefantes se balanceaban…
 * 
 * Pero, ¿hasta cuándo? ¿Cuántos elefantes pueden llegar a balancearse encima de
 * una tela de araña antes de que se rompa? La canción no arroja ninguna luz
 * sobre este particular, pero quizá tú puedas ayudarnos.
 * 
 * Entrada Cada caso, leído de la entrada estándar, consiste en dos líneas. La
 * primera contiene el peso máximo soportado por la tela de araña. La segunda
 * contiene los pesos de cada elefante, separados por espacio, en el orden en el
 * que van llegando, y termina con un 0. Todos los números son enteros positivos
 * menores que 109.
 * 
 * La entrada acaba también con un 0, que no deberá procesarse.
 * 
 * Salida Para cada caso de prueba, el programa indicará, en la salida estándar,
 * el número de elefantes que pudieron balancearse en la tela, antes de que ésta
 * se rompiera o de que no hubiera más elefantes dispuestos a arriesgarse.
 * 
 * Los elefantes se van incorporando a la diversión por estricto orden de
 * llegada.
 * 
 * Entrada de ejemplo 10 1 2 3 4 5 0 20 3 3 0 30 10 10 20 10 0 0 Salida de
 * ejemplo 4 2 2
 */
public class Problema411 {

	public static void main(String[] args) {

		// Declaracion de variables
		int pesoMaximoSoportado;
		int pesoElefantes;
		int pesoAcumulado;
		int cuentaElefantes;
		boolean cabe;
		Scanner entrada;

		// Inicializacion de variables
		entrada = new Scanner(System.in);

		// Lectura del primer caso
		pesoMaximoSoportado = entrada.nextInt();

		// Bucle principal: termina cuando el peso maximo sea 0
		while (pesoMaximoSoportado != 0) {

			// Reiniciar valores por caso
			pesoAcumulado = 0;
			cuentaElefantes = 0;
			cabe = true;

			// Leer primer elefante del caso
			pesoElefantes = entrada.nextInt();

			// Bucle para elefantes hasta que llegue el 0
			while (pesoElefantes != 0) {

				// Solo sumamos si todavía cabe
				if (cabe && pesoAcumulado + pesoElefantes <= pesoMaximoSoportado) {
					pesoAcumulado += pesoElefantes;
					cuentaElefantes++;
				} else {
					// A partir de ahora ya no cabe ninguno
					cabe = false;
				}

				// Leer siguiente elefante
				pesoElefantes = entrada.nextInt();
			}

			// Salida del caso
			System.out.printf("%d%n", cuentaElefantes);

			// Leer el siguiente caso
			pesoMaximoSoportado = entrada.nextInt();
		}

		entrada.close();
	} // Fin main

}
