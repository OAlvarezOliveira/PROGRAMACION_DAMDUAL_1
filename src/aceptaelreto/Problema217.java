
package aceptaelreto;

import java.util.Scanner;

/**
¿Qué lado de la calle?
Tiempo máximo: 1,000 s  Memoria máxima: 4096 KiB
Cuando necesitamos llegar a una dirección específica, es útil conocer la manera en la que las casas se numeran dentro de una calle para no perder demasiado tiempo buscando. Dependiendo de las reglas urbanísticas de cada lugar, esa numeración seguirá unas reglas u otras. En Japón, por ejemplo, los números se asignan por orden de construcción de los edificios, lo que no es algo particularmente amigable para un despistado turista.

En la mayoría de las ciudades y pueblos de Europa, sin embargo, se utiliza un mecanismo que facilita la búsqueda, aunque dificulta los cambios si se construyen o derrumban edificios. En concreto, se elige uno de los extremos como el inicio de la calle, utilizándose normalmente como criterio aquél que esté más cerca de un punto significativo de la ciudad (el centro urbano, el ayuntamiento, un río, el mar…). Una vez hecho eso, las viviendas que quedan al lado izquierdo (respecto al punto inicial) reciben números impares consecutivos, y las que quedan al lado derecho números pares consecutivos. Dependiendo del tamaño de cada edificio, a menudo ocurre que los números se descompensan y hay portales que tienen enfrente otros con números muy diferentes.

Entrada
El programa recibirá, por la entrada estándar, un conjunto de casos de prueba, cada uno en una línea. Cada caso de prueba estará compuesto de un número de vivienda. Se garantiza que nunca será mayor que 1.000.

El último caso, que no deberá procesarse, será el número 0.

Salida
Para cada caso de prueba el programa escribirá "IZQUIERDA" (sin las comillas) si la vivienda está situada a la izquierda de la calle, y "DERECHA" si está a la derecha.

Entrada de ejemplo
3
10
41
0
Salida de ejemplo
IZQUIERDA
DERECHA
IZQUIERDA
 */

/**
 * @author O.Alvarez
 *
 */
public class Problema217 {

	public static void main(String[] args) {

		// Declaracion de variables
		int nunVivienda;
		Scanner entrada;

		// Inicializacion de variables

		entrada = new Scanner(System.in);

		while (true) {
			nunVivienda = entrada.nextInt();

			if (nunVivienda == 0) {
				break;
			}

			if (nunVivienda % 2 == 0) {
				System.out.println("DERECHA");
			} else {
				System.out.println("IZQUIERDA");
			}
		}

		entrada.close();
	}

}
