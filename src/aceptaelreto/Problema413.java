/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema413.java
 */

package aceptaelreto;

import java.util.Scanner;

/**
 * Claras y oscuras Tiempo máximo: 1,000 s Memoria máxima: 4096 KiB Suelo con
 * losetas en modo tablero de ajedrez (imagen de dominio público) Después de
 * muchos años ahorrando para la obra de su ruinosa casa, Paca Herse ha podido
 * por fin contratar a una cuadrilla de obreros que están prácticamente
 * haciéndole una casa nueva. Los gastos se han disparado y cualquier cosa es
 * importante para ahorrar unos eurillos.
 * 
 * Para los suelos, quiere poner unas losetas grandes con dos colores alternos
 * para que formen un patrón clásico similar al de los tableros de ajedrez. Para
 * no desaprovechar material, que luego no se puede devolver, ha estado midiendo
 * todas las estancias de la casa, para averiguar el número de losetas de ancho
 * y de alto que necesita en cada una. Ahora quiere afinar más para saber
 * exactamente cuántas necesita de cada color.
 * 
 * Entrada La entrada comienza con un número indicando la cantidad de casos de
 * prueba que el programa deberá procesar.
 * 
 * Un caso de prueba consiste en dos números naturales mayores que 0 y menores
 * que 1.000 con el número de losetas que entran en una habitación a lo ancho y
 * a lo alto.
 * 
 * Salida Para cada caso de prueba, el programa escribirá una línea con el
 * número de losetas que hay que comprar de cada tipo. Los colores aún no están
 * decididos, pero para que la casa sea lo más luminosa posible, prefiere que,
 * si hay que elegir, haya más losetas claras que oscuras. En la salida se
 * indicará primero cuántas losetas claras se necesitan, seguido del número de
 * oscuras.
 * 
 * Entrada de ejemplo 3 1 3 4 4 2 6 Salida de ejemplo 2 1 8 8 6 6
 */
public class Problema413 {

	public static void main(String[] args) {

		// Declara Variables
		int casos;
		int ancho;
		int alto;
		int losetasTotales;
		int losetasBlancas;
		int losetasNegras;

		Scanner entrada;

		// Inicializar Variables
		entrada = new Scanner(System.in);

		// Toma de datos
		// Tarea1 : Adquirir casos de prueba

		casos = entrada.nextInt();

		// Operativa

		for (int i = 0; i < casos; i++) {

			// Tarea2 : Adquiri dimensiones habitacion
			ancho = entrada.nextInt();
			alto = entrada.nextInt();
			losetasTotales = ancho * alto;

			// DEBUG System.out.println("losetasTotales "+losetasTotales);

			// Tarea3 : Calcular losetas blancas totales (mitad + 1)

			if (losetasTotales % 2 == 0) {
				losetasBlancas = losetasTotales / 2;
			} else {
				losetasBlancas = losetasTotales / 2 + 1;
			}

			losetasNegras = losetasTotales - losetasBlancas;

			System.out.printf("%d %d%n", losetasBlancas, losetasNegras);

		} // fin casos
		entrada.close();
	}

}
