package aceptaelreto;

import java.util.Scanner;

/*
 Cubos visibles
Tiempo máximo: 1,000 s  Memoria máxima: 4096 KiB
Cubo de Rubik original
El cubo de Rubik fue un puzzle que se hizo muy popular en la década de 1970. Es un cubo en el que cada una de las caras está dividida en 3×3 pequeños cuadros. El puzzle consiste en rotar las caras del cubo para que en todas ellas los cuadrados sean del mismo color.

El puzzle tuvo tanto éxito que con el tiempo empezaron a aparecer cubos de otros tamaños, más pequeños como el de 2×2×2 o más grandes como el de 5×5×5.

Viendo el cubo original, se puede pensar que éste está formado por 3×3×3 = 27 pequeños cubitos que giran a las órdenes del jugador. En realidad es todo una invención de nuestro cerebro que se empeña en imaginar cosas donde no las hay. Al ver lo que parecen unos "cortes" de un cubo grande, es fácil creer que la parte interior, oculta, también está hecha de cubitos. Al contrario de lo que dice la intuición, el interior no está formado por más cubos sino por piezas móviles que permiten que los exteriores giren sin separarse.

En general, dado un cubo de N×N×N, ¿cuántos cubitos distintos son realmente visibles en sus 6 caras?

Entrada
La entrada comienza con un número indicando el número de casos de prueba que vienen a continuación. Cada uno aparece en una línea con un entero N (2 ≤ N ≤ 1.000.000) con las dimensiones de cada lado del cubo.

Salida
Por cada caso de prueba se escribirá una única línea con el número de cubitos visibles en un cubo de las dimensiones dadas.

Entrada de ejemplo
2
2
3
Salida de ejemplo
8
26
 **/

public class Problema373 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int casos;
		long n;
		long n2;
		long n3;
		long cubos_visibles;
		Scanner entrada = new Scanner(System.in);

		casos = entrada.nextInt();

		// Bucle para repetir por caso
		for (int i = 0; i < casos; i++) {
			n = entrada.nextInt();

			if (n == 1) { // por claridad
				cubos_visibles = 1; 

			} else {

				n3 = n * n * n;
				n2 = (n - 2) * (n - 2) * (n - 2);
				cubos_visibles = n3 - n2;
			}
			System.out.println(cubos_visibles);


		}// Fin for casos
		entrada.close();

	}

}
