/**
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema210.java
 */

package aceptaelreto;

import java.util.Scanner;

/**
 * Sombras en el camping Tiempo máximo: 2,000-4,000 s Memoria máxima: 4096 KiB
 * Se acerca el verano y los aficionados a la naturaleza pasarán buena parte de
 * él en campings, disfrutando del aire libre.
 * 
 * Un requisito imprescindible en los meses de calor es colocar la tienda de
 * campaña bajo la sombra de un buen árbol para poder pasar frescos las horas de
 * siesta. Pero, dependiendo de la zona, eso no siempre es fácil. En los
 * campings nuevos, el número de árboles es escaso, y también lo es por tanto el
 * número de parcelas aptas para tiendas.
 * 
 * Árboles en un camping Figura 1: primer ejemplo de entrada destacando las
 * zonas de sombra Sabiendo que cada árbol proporciona sombra a las ocho
 * parcelas adyacentes, ¿cuántas tiendas de campaña disfrutarán de sombra en un
 * camping?
 * 
 * Entrada El programa deberá procesar múltiples casos de prueba recibidos por
 * la entrada estándar. Cada uno representa un camping formado por una
 * cuadrícula de parcelas de igual tamaño en los que puede haber hueco para una
 * tienda, o un árbol.
 * 
 * Cada caso de prueba comienza con dos números 1 ≤ c, f ≤ 50, indicando el
 * número de columnas y de filas de la cuadrícula de parcelas. A continuación se
 * indica el número a de árboles del camping.
 * 
 * Si hay árboles, en la siguiente línea aparece la posición de todos ellos,
 * indicando para cada uno la columna (1…c) y la fila (1…f) que ocupan. En
 * total, aparecerán 2×a números.
 * 
 * La entrada termina con una línea con tres ceros (camping con dimensiones
 * nulas y sin árboles), que no debe procesarse.
 * 
 * Salida Por cada caso de prueba el programa indicará, en una línea, el número
 * de parcelas que disfrutarán de sombra.
 * 
 * Entrada de ejemplo 7 7 8 7 2 3 3 4 3 4 4 3 5 4 5 1 7 2 7 5 3 1 3 2 0 0 0
 * Salida de ejemplo 22 8
 */

public class Problema210 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); // Sin UTF-8
		boolean procesa = true;
		int columnas;
		int filas;
		int numArboles;

		while (procesa) {
			columnas = entrada.nextInt();
			filas = entrada.nextInt();
			numArboles = entrada.nextInt();

			if (columnas == 0 && filas == 0 && numArboles == 0) {
				procesa = false;
			} else {
				int cantidadSombras = 0;
				boolean[][] sombra = new boolean[filas][columnas];

				for (int i = 0; i < numArboles; i++) {
					int col = entrada.nextInt();
					int fila = entrada.nextInt();
					marcarSombras(sombra, col, fila, columnas, filas);
				}

				for (int f = 0; f < filas; f++) {
					for (int c = 0; c < columnas; c++) {
						if (sombra[f][c]) {
							cantidadSombras++;
						}
					}
				}

                System.out.println(cantidadSombras);  // println en vez de printf
			}
		}

	}

	private static void marcarSombras(boolean[][] sombra, int col, int fila, int maxCol, int maxFila) {
		int[][] direcciones = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };

		for (int i = 0; i < 8; i++) {
			int nuevaFila = fila + direcciones[i][0];
			int nuevaCol = col + direcciones[i][1];

			if (nuevaFila >= 1 && nuevaFila <= maxFila && nuevaCol >= 1 && nuevaCol <= maxCol) {
				sombra[nuevaFila - 1][nuevaCol - 1] = true;
			}
		}
	}
}