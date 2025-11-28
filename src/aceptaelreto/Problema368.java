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

/**
 * Cociendo huevos Tiempo máximo: 1,000 s Memoria máxima: 4096 KiB Cinco huevos
 * cociendo Cuando Enrique salió de su pueblecito camino a la gran ciudad para
 * incorporarse a la universidad como estudiante de informática, entró en un
 * colegio mayor. Así el cambio de vida no fue tan drástico; al menos no tuvo
 * que preparse la comida.
 * 
 * Una vez que empezó segundo, la cosa cambió. Su hermano, un año menor,
 * empezaba también los estudios superiores, así que les salía más rentable
 * alquilar un pequeño pisito que pagar dos habitaciones. Y eso añadió la
 * necesidad de aprender a cocinar. La cantidad de horas que pasaron al teléfono
 * con sus padres al otro lado dictándoles recetas es inconfesable.
 * 
 * Ahora, muchos años después, aún recuerdan entre risas una de aquellas
 * conversaciones. Pedro, el hermano de Enrique, al teléfono; a su lado,
 * Enrique; al otro lado de la línea, su madre:
 * 
 * Pedro: Mamá, tenemos que cocer tres huevos. ¿Cómo era? Madre: Ponlos en una
 * olla con agua hirviendo. Pedro: Ya, ya, eso ya. Pero no sé durante cuánto
 * tiempo. Madre: Dejadlos unos 10 minutos. Enrique: Pero espera, que venían los
 * de tu clase, tendremos que cocer al menos cinco. Pedro: Oye mamá, ¿y si en
 * lugar de tres son cinco? Madre: Pues lo mismo, 10 minutos. Enrique: ¡Ostras!
 * ¡Entonces cocer huevos es O (1)! Pedro: No, porque en la olla no entran
 * infinitos huevos. Enrique: Ah, claro… Madre: ¿¿¡¡Qué!!?? Y, como siempre, le
 * tocó a Pedro explicar a su madre de qué hablaban.
 * 
 * La respuesta de la madre había hecho pensar inicialmente a Enrique que el
 * tiempo de cocción es el mismo, independientemente del número de huevos. Pero,
 * como bien vio Pedro, no es exactamente así porque la capacidad de la olla es
 * finita, por lo que no se puede cocer cualquier cantidad de huevos al mismo
 * tiempo.
 * 
 * Como demostración de que el tiempo necesario para conseguir h huevos cocidos
 * es en realidad proporcional a ese h, vamos a calcularlo para distintos h y
 * tamaños de ollas.
 * 
 * Entrada La entrada estará compuesta por distintos casos de prueba, cada uno
 * en una línea.
 * 
 * Cada caso de prueba consiste en dos números, h (1 ≤ h ≤10.000) y c (1 ≤ c
 * ≤1.000) que indican el número de huevos que queremos cocer y la capacidad (en
 * huevos) de la olla.
 * 
 * La entrada termina con una línea con dos ceros que no debe procesarse.
 * 
 * Salida Para cada caso de prueba se escribirá una línea con el número mínimo
 * de minutos de cocción necesarios para conseguir los huevos indicados si
 * tenemos una olla con la capacidad dada. Ten en cuenta que, según la madre de
 * Enrique y Pedro, éstos necesitan un tiempo de cocción de 10 minutos.
 */
public class Problema368 {

	public static void main(String[] args) {

		double h;
		double c;
		double tandas;
		int tiempoTotal;
		final int COCCION = 10;
		Scanner entrada = new Scanner(System.in);

		while (true) {
			h = entrada.nextDouble(); // huevos
			c = entrada.nextDouble(); // capacidad

			if (h == 0 && c == 0) {
				break;
			} // condición de fin


// 			tandas = (int) Math.ceil((double) h / c); // redondeo hacia arriba con funcion

			tandas = h / c; 			
			if (tandas >= 0) {

           if (tandas == (int) tandas) {
            	tandas = (int) tandas; 
	            } else {
	                // Si no es un entero, le sumamos 1
	            	tandas  = (int) tandas + 1;
	            }
	        } else {

	        	tandas =  (int) tandas;
	        }
			
			tiempoTotal = (int) (tandas * COCCION);

			System.out.println(tiempoTotal);
		}

		entrada.close();
	}
}