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
import java.util.Locale;


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
public class Problema180 {

	public static void main(String[] args) {

		// Declaracion variables

		int casos;
		double ladoA;
		double ladoB;
		double ladoC;
		double anguloA;
		double anguloB;
		double anguloC;
		double cosA;
		double cosB;
		double cosC;
		double mayorAngulo;
		String tipoTriangulo;
		Scanner entrada;

		// Inicializacion variables
//		ladoA = 5; //DEBUG
//		ladoB = 8; //DEBUG
//		ladoC = 6; //DEBUG
		mayorAngulo = 0;
		tipoTriangulo = "";
		entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US); //Sugerencia Claude

		// Tarea1 : Adquirir casos de prueba

		casos = entrada.nextInt();

		// Tarea2 : Procesar cada caso de prueba
		for (int i = 0; i < casos; i++) {

			// datos de cada caso
			ladoA = entrada.nextInt();
			ladoB = entrada.nextInt();
			ladoC = entrada.nextInt();

			// Calcular ángulos usando teorema del coseno para cada caso

			// Comprobar desigualdad triangular
			if ((ladoA > 0 && ladoB > 0 && ladoC > 0) && (ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB)
					&& (ladoB + ladoC > ladoA)) {

				// Angulo A
				cosA = (Math.pow(ladoB, 2) + Math.pow(ladoC, 2) - Math.pow(ladoA, 2)) / (2 * ladoB * ladoC);
				anguloA = Math.toDegrees(Math.acos(cosA));

				// Angulo B
				cosB = (Math.pow(ladoA, 2) + Math.pow(ladoC, 2) - Math.pow(ladoB, 2)) / (2 * ladoA * ladoC);
				anguloB = Math.toDegrees(Math.acos(cosB));

				// Angulo C
				cosC = (Math.pow(ladoA, 2) + Math.pow(ladoB, 2) - Math.pow(ladoC, 2)) / (2 * ladoA * ladoB);
				anguloC = Math.toDegrees(Math.acos(cosC));


				// Angulo mayor
				mayorAngulo = anguloA;
				if (anguloB > mayorAngulo) {
				    mayorAngulo = anguloB;
				}
				if (anguloC > mayorAngulo) {
				    mayorAngulo = anguloC;
				}

//				System.out.printf("%s %.8f%n", "mayorAngulo ", mayorAngulo); //DEBUG

				// Tipo de triangulo

				if (mayorAngulo >= 89.99 && mayorAngulo <= 90.01) {
					tipoTriangulo = "RECTANGULO";
				} else if (mayorAngulo > 90) {
					tipoTriangulo = "OBTUSANGULO";
				} else {
					tipoTriangulo = "ACUTANGULO";
				}

			} else {
				tipoTriangulo = "IMPOSIBLE";
			}

			System.out.println(tipoTriangulo);
		}
		// fin programa
		entrada.close();
	}
}
