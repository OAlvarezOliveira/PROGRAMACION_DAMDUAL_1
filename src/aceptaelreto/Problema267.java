package aceptaelreto;

import java.util.Scanner;

/**
 * Postes para un cercado Tiempo máximo: 3,000 s Memoria máxima: 4096 KiB Toro
 * con riesgo de fuga Amanda ha heredado un terreno, de forma rectangular, en el
 * pueblo donde se criaron sus abuelos. Siempre ha sido utilizado para cultivo,
 * pero ella está decidida a utilizarlo para pastoreo de ganado por lo que se ve
 * en la obligación de cercarlo para evitar que las reses se escapen.
 * 
 * Ha preguntado por el coste de una cerca electrificada, y la han dicho que
 * éste depende únicamente del número de postes que sea necesario colocar. Como
 * es lógico, es obligatorio poner un poste en cada una de las esquinas del
 * terreno. Luego habrá que poner en cada lado postes situados a una distancia
 * máxima los unos de los otros, para evitar que el viento, o los animales,
 * vuelquen la cerca.
 * 
 * Amanda se ha dado cuenta de que averiguar el mínimo número de postes
 * necesarios no es tan fácil. ¿La ayudas?
 * 
 * Entrada La entrada consta de un conjunto de casos de prueba. Cada uno ocupa
 * una línea, y contiene tres números mayores que 0 con las distancias de cada
 * uno de los dos lados del rectángulo, así como la máxima distancia a la que se
 * pueden colocar los postes. Todos los valores serán menores que 231.
 * 
 * La entrada acaba con una línea con tres ceros.
 * 
 * Salida El programa escribirá, para cada caso de prueba, una línea con el
 * número mínimo de postes necesarios para cercar el terreno. Se garantiza que
 * el resultado será menor que 231.
 * 
 * Entrada de ejemplo 10 10 10 6 6 10 10 15 10 0 0 0 Salida de ejemplo 4 4 6
 */

public class Problema267 {

	public static void main(String[] args) {

		// Declarar Variables
		long distanciaBase;
		long distanciaAltura;
		long distanciaPostePoste;
		long totalPostes;
		long postesExtraBase;
		long postesExtraAltura;

		Scanner entrada;

		// Inicializar Variables
		entrada = new Scanner(System.in);
		postesExtraBase = 0;
		postesExtraAltura = 0;
		// Forzar el While
		distanciaBase = -1;
		distanciaAltura = -1;
		distanciaPostePoste = -1;

		while (distanciaBase != 0 && distanciaAltura != 0 && distanciaPostePoste != 0) {
			// Entrada de datos
			distanciaBase = entrada.nextInt();
			distanciaAltura = entrada.nextInt();
			distanciaPostePoste = entrada.nextInt();

			if (distanciaBase != 0 && distanciaAltura != 0 && distanciaPostePoste != 0) {

				// Operativa

				if (distanciaBase % distanciaPostePoste == 0) {

					postesExtraBase = distanciaBase / distanciaPostePoste;

				} else {

					postesExtraBase = (distanciaBase / distanciaPostePoste) + 1;
				}

				// System.out.println("postesExtraBase:" + postesExtraBase);

				if (distanciaAltura % distanciaPostePoste == 0) {

					postesExtraAltura = distanciaAltura / distanciaPostePoste;

				} else {

					postesExtraAltura = (distanciaAltura / distanciaPostePoste) + 1;
				}

				// System.out.println("postesExtraAltura:" + postesExtraAltura);

				// Salida datos

				totalPostes = (postesExtraBase + postesExtraAltura) * 2;

				System.out.println(totalPostes);
			}
		}

		// Fin y cierre de scanner
		entrada.close();

	}
}
