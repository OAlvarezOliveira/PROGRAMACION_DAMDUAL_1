/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema241.java
 */

package aceptaelreto;

import java.util.Scanner;

/**
 * Me quiere, no me quiere Tiempo máximo: 2,000 s Memoria máxima: 4096 KiB
 * Trebol de tres hojas El hermano pequeño de Diana está descubriendo lo que es
 * el amor. Anda siempre despistado de un lado para otro, sin prestar atención a
 * los demás y con la cabeza llena de pájaros.
 * 
 * Alguien le enseñó el juego de "me quiere, no me quiere" con margaritas, pero
 * él prefiere, sin lugar a dudas, los tréboles. Y es que, quitando una por una
 * sus tres hojas, su enamorada ¡siempre le quiere! El resultado es que cada vez
 * que en el jardín encuentra una zona en la que han crecido varios tréboles, se
 * dedica a deshojarlos uno por uno repitiendo, para sí, la rítmica
 * cancioncilla.
 * 
 * Diana ha dejado ya de creer en esas cosas de niños. Pero todavía sigue
 * pensando que encontrar un trébol de cuatro hojas le traería suerte. Cada vez
 * que descubre en el jardín el resultado de las locuras de amor de su hermano
 * entra en cólera porque sólo quedan las hojas de los desafortunados tréboles
 * desperdigadas por el suelo, y no puede buscar su suerte allí.
 * 
 * ¿O sí?
 * 
 * Entrada El programa recibirá, por la entrada estándar, un primer número
 * indicando cuántos casos de prueba vendrán a continuación. Cada uno estará
 * compuesto por un único número, en una línea, mayor que 0 y menor que 20.000,
 * indicando el número de hojas de trébol que Diana ha encontrado en el jardín.
 * 
 * Salida Para cada caso de prueba el programa escribirá, en una línea
 * independiente, el menor número posible de tréboles de cuatro hojas que ha
 * encontrado, y deshojado, su hermano. Si es imposible que se encuentre con ese
 * número de hojas, se escribirá IMPOSIBLE. Se debe asumir que los tréboles
 * tendrán siempre 3 o 4 hojas. Entrada de ejemplo 3 1 3 7 Salida de ejemplo
 * IMPOSIBLE 0 1
 */
public class Problema241 {

	public static void main(String[] args) {

		int casos;
		int hojas;
		int hojasRestantes;
		int treboles4;
		Scanner entrada;
		boolean imposible;

		// declaro variables

		entrada = new Scanner(System.in);
		treboles4 = 0;
		hojasRestantes = 0;
		imposible = false;

		// Tarea1 : Adquirir casos de prueba

		casos = entrada.nextInt();

		// Tarea2 : Procesar cada caso de prueba
		for (int i = 0; i < casos; i++) {

			hojas = entrada.nextInt();
			// reset del caso
			treboles4 = 0;
			imposible = false;

			if (hojas < 3) {
				imposible = true;
			} else {
				hojasRestantes = hojas % 3;

				if (hojasRestantes == 0) {
					treboles4 = 0;
				} else if (hojasRestantes == 1) {
					if (hojas >= 4) {
						treboles4 = 1;
					} else {
						imposible = true;
					}
				} else { // hojasRestantes == 2
					if (hojas >= 8) {
						treboles4 = 2;
					} else {
						imposible = true;
					}
				}
			}

			if (imposible) {
				System.out.println("IMPOSIBLE");
			} else {
				System.out.println(treboles4);
			}

		} // Fin de caso

		entrada.close();

	} // Fin Programa

}
