package aceptaelreto;

import java.util.Scanner;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

/*
 Contando en la arena
Tiempo máximo: 1,000 s  Memoria máxima: 4096 KiB
Surcos en la arena
Es ampliamente conocido que escribimos los números utilizando base 10, en la que expresamos las cantidades utilizando 10 dígitos distintos (0…9). El valor de cada uno de ellos depende de la posición que ocupe dentro del número, pues cada dígito se multiplica por una potencia de 10 distinta según cuál sea esa posición.

La descomposición, por ejemplo, del número 1.234 es:

1.234 = 1×103 + 2×102 + 3×101 + 4×100

Otra base muy conocida es la base 2 al ser la utilizada por los dispositivos electrónicos. En ella sólo hay dos dígitos distintos (0 y 1), que se ven multiplicados por potencias de 2.

Mucho antes de que llegaran la base 2, la base 10 e incluso los números romanos, los primeros seres humanos contaban haciendo surcos en la arena, muescas en un trozo de madera o colocando palos en línea. Estaban, sin saberlo, usando base 1. En ella sólo hay un símbolo y cada dígito es multiplicado por una potencia de 1. Dado que 1n = 1 el resultado es que todos los dígitos tienen el mismo peso.

Entrada
La entrada estará compuesta por distintos números mayores que 0 y que nunca serán mayores que 1.000, cada uno en una línea.

La entrada termina con un 0, que no debe procesarse.

Salida
Para cada número se debe escribir, en una línea independiente, su codificación en base 1.

Entrada de ejemplo
 */

public class Problema369 {
	public static void main(String[] args) {
		int numero;
		Scanner entrada = new Scanner(System.in);

		numero = entrada.nextInt();
		
		while (numero != 0) {
		for (int i = 0; i < numero; i++) {

				System.out.print(1);
				
		}
		System.out.println();
		numero = entrada.nextInt();
		}
		entrada.close();
	}
}
