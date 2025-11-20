package aceptaelreto;

import java.util.Scanner;

/*
 Hay múltiples juegos y acertijos que empiezan con cerillas en una mesa colocadas formando cuadrados como en la figura:

Cerillas
Las preguntas suelen ser del estilo de "¿Cuántas cerillas hay que quitar como mínimo para conseguir tres rectángulos?". Nosotros nos planteamos algo más sencillo: ¿cuántas cerillas se necesitan para crear una figura con N×M cuadrados?

Entrada
La entrada comienza con un número que indica cuántos casos de prueba vendrán a continuación, cada uno en una línea.

Cada caso de prueba contiene dos números indicando el número de cuadrados que se quieren formar en horizontal y vertical respectivamente. Ambos son mayores que 0 y menores que 1.000.

Salida
Para cada caso de prueba se escribirá una línea indicando el número de cerillas necesarias para construir el tablero solicitado.

Entrada de ejemplo
2
1 1
3 3
Salida de ejemplo
4
24
 * */

public class  Problema340 {

	public static void main(String[] args) {

		// Declaracion
		int casos;
		long n;
		long m;
		long cerillas;
		Scanner teclado;

		// Inicializacion
		teclado = new Scanner(System.in);

		// Operativa
		casos = teclado.nextInt();
		for (int i = 0; i < casos; i++) {
			n = teclado.nextLong();
			m = teclado.nextLong();

			cerillas = (m + 1) * n + (n + 1) * m;

			System.out.println(cerillas);

		}

		teclado.close();

	}

}
