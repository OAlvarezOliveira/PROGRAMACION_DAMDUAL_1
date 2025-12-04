/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema245.java
 */

package aceptaelreto;

import java.util.Scanner;

/**
 * Los Dalton Tiempo máximo: 1,000-2,000 s Memoria máxima: 4096 KiB Los Dalton
 * (o también hermanos Dalton) son personajes secundarios de la serie de cómics
 * de Lucky Luke creada por Maurice de Bévère (Morris). Pocos saben que en
 * realidad estos personajes están inspirados en unos ladrones estadounidenses
 * de finales del siglo XIX.
 * 
 * Lo que sí es ampliamente conocido es su aspecto y la forma de colocarse en
 * las viñetas. Por un lado, todos ellos tienen la misma apariencia, siendo la
 * altura su única diferencia física. Por otro lado, en las viñetas siempre se
 * colocaban por orden de altura, formando una graciosa estampa reconocible al
 * instante. Aunque en los cómics finalmente hay cuatro hermanos Dalton, existe
 * la creencia de que Morris hizo bocetos en los que aparecían muchos más
 * hermanos, todos exactamente iguales salvo por su altura. Hoy coleccionistas
 * de todo el mundo buscan incansablemente esos bocetos.
 * 
 * Actualmente estamos trabajando en un software que reconozca si una viñeta
 * puede o no ser una foto de los Dalton. Tras una serie de pasos de extracción
 * de siluetas, hemos conseguido las alturas de todos los personajes que
 * aparecen en el dibujo y nos toca decidir si pueden o no ser ellos.
 * 
 * Entrada La entrada estará compuesta por la descripción de varias viñetas.
 * Cada una de ellas aparece en dos líneas. La primera tiene el número N de
 * personas que hay en la viñeta (como mínimo dos). La segunda tiene las N
 * alturas de cada uno, empezando por el personaje de la izquierda y terminando
 * por el de más a la derecha. El sistema de extracción de siluetas nos da las
 * alturas en números enteros entre 1 y 1018. Ten en cuenta que no estamos
 * seguros de cuántos hermanos son (pueden ser bastantes más de cuatro, o
 * incluso menos de cuatro).
 * 
 * La entrada termina con una viñeta sin personajes, que no deberá procesarse.
 * 
 * Salida Se escribirá una línea por cada viñeta, indicando si todos los
 * personajes que hay en ella pueden ser los Dalton (DALTON) o no
 * (DESCONOCIDOS).
 * 
 * Entrada de ejemplo
 * 
 * 4 1 2 3 4 5 10 1 2 3 4 4 1 1 2 2 0 Salida de ejemplo DALTON DESCONOCIDOS
 * DESCONOCIDOS
 */
public class Problema245 {

	public static void main(String[] args) {

		// Declarar Variables
		int numeroSiluetas;
		long alturaAnterior;
		long alturaActual;
		boolean esCreciente = true;
		boolean esValido = true;
		Scanner entrada;

		// Inicializar Variables
		entrada = new Scanner(System.in);

		// Operativa

		numeroSiluetas = entrada.nextInt();

		while (numeroSiluetas != 0) {

			// Resetear
			esValido = true;

			// Si solo hay una silueta, siempre es válida (Da igual)
			if (numeroSiluetas == 1) {
				entrada.nextLong(); // consumir altura
				System.out.println("DALTON");
				numeroSiluetas = entrada.nextInt();
				continue;
			}

			// Leer primeras dos alturas (ya hay al menos 2)
			alturaAnterior = entrada.nextLong();
			alturaActual = entrada.nextLong();

			// Determinar tendencia
			if (alturaActual > alturaAnterior) {
				esCreciente = true;
			} else if (alturaActual < alturaAnterior) {
				esCreciente = false;
			} else {
				esValido = false;
			}

			// Leer resto (ya leímos 2)
			for (int i = 2; i < numeroSiluetas; i++) {
				alturaAnterior = alturaActual;
				alturaActual = entrada.nextLong();

				if (esCreciente) {
					if (alturaActual <= alturaAnterior) {
						esValido = false;
					}
				} else {
					if (alturaActual >= alturaAnterior) {
						esValido = false;
					}
				}
			}

			// Imprimir ESTE caso
			System.out.println(esValido ? "DALTON" : "DESCONOCIDOS");

			// Leer siguiente caso
			numeroSiluetas = entrada.nextInt();
		}

		// Fin
		entrada.close();
	}
}