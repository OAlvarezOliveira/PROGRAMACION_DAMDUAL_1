package aceptaelreto;

/*
Área de un rectángulo
Tiempo máximo: 1,000-3,000 s  Memoria máxima: 4096 KiB
El área de un polígono es la cantidad de superficie que encierran sus lados. El área de un rectángulo es la multiplicación de la base por la altura. ¿Sabes calcularla?

Entrada
La entrada consta de una serie de casos de prueba. Cada uno contiene la definición de un rectángulo en una sola línea con cuatro números enteros no negativos menores o iguales que 10.000. Los dos primeros definen la posición del vértice inferior izquierdo del rectángulo y los dos siguientes la del vértice superior derecho.

Ejemplo de área
El último caso de prueba, que no debe procesarse, proporciona un rectángulo en el que el segundo vértice está debajo o a la izquierda del primero.

Salida
Para cada caso de prueba se escribirá, en una línea independiente, el área del rectángulo dado.

Entrada de ejemplo
1 1 4 3
0 0 1 1
9 7 3 6
Salida de ejemplo
6
1
 *
 */

import java.util.Scanner;

public class Ejercicio164 {

	public static void main(String[] args) {

		// Declarar variables
		int base;
		int altura;
		int x1;
		int x2;
		int y1;
		int y2;
		int area;
		Scanner entrada;

		// Inicializar Variables
		entrada = new Scanner(System.in);

		while (true) {
			x1 = entrada.nextInt();
			y1 = entrada.nextInt();
			x2 = entrada.nextInt();
			y2 = entrada.nextInt();
			if (x2 < x1 || y2 < y1) {
				break;
			} else {
				base = x2 - x1;
				altura = y2 - y1;
//				System.out.println(base); // para depurar
//				System.out.println(altura); // para depurar
				area = base * altura;
				System.out.println(area);
			}
		} // fin while

		entrada.close();
	}

}
