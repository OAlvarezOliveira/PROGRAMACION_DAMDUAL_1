/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema158.java
 */

package aceptaelreto;

import java.util.Scanner;

/**
 * Los saltos de Mario Tiempo máximo: 1,000-2,000 s Memoria máxima: 4096 KiB
 * Mario se encuentra ante el castillo final. Puede verlo desde lo alto del muro
 * en el que se encuentra. En breve podrá entrar en la Cámara de Koopa,
 * enfrentarse (y vencer) al monstruo final y salvar a la princesa.
 * 
 * Sin embargo, tiene ante sí una serie de muros que tendrá que sobrepasar. Para
 * eso, saltará desde el primero de ellos, donde se encuentra, al siguiente, y
 * desde él al siguiente, y así sucesivamente hasta llegar al último.
 * 
 * La pregunta que nos hacemos es, ¿cuántos de estos saltos serán hacia arriba y
 * cuántos hacia abajo? Mario realiza un salto hacia arriba cuando tiene que
 * alcanzar un muro que está por encima de él, y hacia abajo cuando tiene que
 * alcanzar un muro que está por debajo.
 * 
 * Entrada El primer valor de la entrada es un número que indica la cantidad de
 * casos de prueba a evaluar. Cada caso de prueba comienza con un entero mayor
 * que cero y no mayor que 109 que indica el número de muros del escenario
 * (recuerda que Mario se encuentra situado en la parte de arriba del primero).
 * A continuación se proporciona la serie de enteros que indican la altura de
 * cada uno de ellos.
 * 
 * Salida Para cada caso de prueba se mostrará una línea en la que aparecerán
 * dos enteros, uno con los saltos hacia arriba y otro con los saltos hacia
 * abajo, separados por un espacio.
 * 
 * Entrada de ejemplo 3 8 1 4 2 2 3 5 3 4 2 9 9 5 1 2 3 4 5 Salida de ejemplo 4
 * 2 0 0 4 0
 */
public class Problema158 {

	public static void main(String[] args) {

		// Declarar Variables

		int casos;
		int muros;
		int posicionInicial;
		int posicionFinal;
		int saltoArriba;
		int saltoAbajo;

		Scanner entrada;

		// Inicializar Variables
		entrada = new Scanner(System.in);
		saltoArriba = 0;
		saltoAbajo = 0;

		// Toma de datos
		// Tarea1 : Adquirir casos de prueba

		casos = entrada.nextInt();
		// DEBUGG System.out.println("casos "+casos);

		// Tarea 2 : procesar caso y acumular salto arriba o salto abajo segun posicion

		for (int i = 0; i < casos; i++) {

			// Tarea2 : Adquiri numero de muros
			muros = entrada.nextInt();
			// DEBUGG System.out.println("muros "+muros);

			// Tarea3 : Adquiri posicion de partida
			posicionInicial = entrada.nextInt();
			
			//reset para siguiente caso
			saltoArriba = 0;
			saltoAbajo  = 0;

			for (int j = 1; j < muros; j++) {

				
				// Tarea4 : Adquirir siguiente posicion
				posicionFinal = entrada.nextInt();
				// DEBUGG System.out.println("posicionFinal "+posicionFinal);

				if (posicionInicial < posicionFinal) {
					saltoArriba++;
				} else if (posicionInicial > posicionFinal){
					saltoAbajo++;
				}

				posicionInicial = posicionFinal;

//  DEBUGG			System.out.println("posicionInicial "+posicionInicial);
//	DEBUGG			System.out.println("posicionFinal "+posicionFinal);		
//	DEBUGG			System.out.println("saltoArriba "+saltoArriba);
//	DEBUGG			System.out.println("saltoAbajo "+saltoAbajo);

				
			} // Fin muro
			
			//Salida datos
			System.out.printf("%d %d%n", saltoArriba, saltoAbajo);


		} // fin casos
		entrada.close();
	}

}
