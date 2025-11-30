/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema180.java
 */

package aceptaelreto;

import java.util.Scanner;

/**
 * Triángulos Tiempo máximo: 2,000 s Memoria máxima: 4096 KiB Es bien sabido que
 * la suma de los ángulos de cualquier triángulo es siempre 180 grados. En
 * función del ángulo mayor, los triángulos se pueden clasificar en tres tipos:
 * 
 * Acutángulo: el mayor de los tres ángulos es agudo (menor de 90 grados).
 * Rectángulo: el mayor de los tres ángulos es recto (exactamente 90 grados).
 * Obtusángulo: el mayor de los tres ángulos es obtuso (mayor de 90 grados).
 * Tipos de triángulos según sus ángulos ¿Eres capaz de, a partir de la longitud
 * de tres segmentos, decir el tipo de triángulo que forman?
 * 
 * Entrada La entrada consistirá en un primer número indicando el número de
 * casos de prueba que vendrán después.
 * 
 * Cada caso de prueba ocupará una línea, y estará compuesto de tres números
 * enteros no negativos menores que 215 − 1, separados por espacios y no
 * necesariamente ordenados. Cada entero representará la longitud de cada uno de
 * los lados de un triángulo.
 * 
 * Salida Para cada caso de prueba, el programa indicará el tipo de triángulo,
 * escribiendo ACUTANGULO, RECTANGULO u OBTUSANGULO. Si resulta imposible formar
 * un triángulo con esos segmentos, escribirá IMPOSIBLE.
 * 
 * Entrada de ejemplo 
 * 4 
 * 3 4 4 
 * 5 3 4
 * 3 4 6 
 * 3 4 7 
 * Salida de ejemplo
 * 
 * ACUTANGULO 
 * RECTANGULO 
 * OBTUSANGULO 
 * IMPOSIBLE
 */

public class Problema180B {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int casos = entrada.nextInt();

		for (int i = 0; i < casos; i++) {

			long a = entrada.nextLong();
			long b = entrada.nextLong();
			long c = entrada.nextLong();

			// Si algún lado es 0 → imposible
			if (a <= 0 || b <= 0 || c <= 0) {
				System.out.println("IMPOSIBLE");
			} else {

				// Ordenamos: x ≤ y ≤ z
				long x = Math.min(a, Math.min(b, c));
				long z = Math.max(a, Math.max(b, c));
				long y = a + b + c - x - z;

				// Desigualdad triangular
				if (x + y <= z) {
					System.out.println("IMPOSIBLE");
				} else {

					// Usamos cuadrados para evitar decimales
					long suma = x * x + y * y;
					long mayor = z * z;

					if (suma == mayor) {
						System.out.println("RECTANGULO");
					} else if (suma > mayor) {
						System.out.println("ACUTANGULO");
					} else {
						System.out.println("OBTUSANGULO");
					}
				}
			}
		}

		entrada.close();
	}
}