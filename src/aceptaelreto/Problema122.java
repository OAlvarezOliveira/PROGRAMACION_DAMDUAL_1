/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema122.java
 */

package aceptaelreto;

import java.util.Scanner;

/**
 Avituallamiento en las etapas ciclistas
Tiempo máximo: 1,000-5,000 s  Memoria máxima: 4096 KiB
En toda etapa ciclista que se precie hay un momento en el que se permite a los participantes recuperar fuerzas recogiendo comida que voluntarios apostados en los márgenes de la carretera les dan dentro de unas bolsas.

La organización de esas etapas debe decidir en qué punto kilométrico colocan la zona de avituallamiento (el lugar en el que se les proporciona las bolsas). El sentido común indica que:

Debe ser en una zona llana (si es subida los ciclistas estarán más concentrados en pedalear que en comer; si es bajada estarán atentos a no caerse con el incremento de velocidad).
La zona llana debe ser la más larga que haya en toda la etapa, para darles tiempo a comer con calma.
Para tomar esta decisión, te han pedido ayuda. Ellos te darán la altura sobre el nivel del mar a la que empieza cada uno de los kilómetros de la etapa, y tendrás que decidir en qué punto kilométrico se deberán colocar los encargados del avituallamiento.

Como ejemplo, supongamos una etapa de 4 kilómetros, en la que la salida, situada en el punto kilométrico (P.K.) 0, esté sobre el nivel del mar, los P.P.K.K. 1, 2 y 3 estén a una altura de 50 metros y, por último, la meta (P.K. 4), esté a 100 metros de altitud. Con esta configuración de etapa, existen dos kilómetros llanos (que comienzan en los P.P.K.K. 1 y 2), por lo que el avituallamiento se colocará en el P.K. 1, para que los corredores tengan dos kilómetros completos para comer.


Entrada
La entrada está compuesta de múltiples etapas, cada una en una línea. Una etapa está formada por una secuencia de al menos dos números mayores o iguales que cero separados por espacios. Cada uno de esos números representa la altura sobre el nivel del mar al principio del kilómetro, siendo el primer número la altura al principio del primer kilómetro (P.K. 0), el segundo al principio del segundo kilómetro, etc. Cada etapa termina con un -1 que no debe tenerse en cuenta en el cálculo. La última altura válida leída es la altura a la que se encuentra la meta.

La entrada termina con una "etapa vacía", es decir una línea que contiene únicamente un -1.

Salida
Para cada etapa se escribirá una línea donde aparecerán dos números separados por un espacio: el punto kilométrico donde colocar el punto de avituallamiento y el número de kilómetros llanos que tienen por delante.

Ten en cuenta que:

El principio de la etapa se considera el kilómetro cero.
Si hay más de una zona candidata, se elegirá la que ocurra antes en la etapa.
Si en la etapa no hay ninguna zona llana, se escribirá HOY NO COMEN.

Entrada de ejemplo
0 50 50 50 100 -1
10 10 -1
0 5 -1
0 50 50 100 100 -1
0 50 50 3 3 3 -1
-1
Salida de ejemplo
1 2
0 1
HOY NO COMEN
1 1
3 2
 */
public class Problema122 {


	public static void main(String[] args) {
		
		// DECLARACIÓN

		Scanner entrada;

		
		// INICIALIZACIÓN
		entrada = new Scanner(System.in);

		
		while (entrada.hasNextInt()) {
		    int alturaAnterior = entrada.nextInt();
		    
		    // Comprobar fin de entrada
		    if (alturaAnterior == -1) {
		        break;
		    }
		    
		    // Variables para la etapa actual
		    int mejorInicio = -1;
		    int mejorLongitud = 0;		    
		    int inicioActual = 0;
		    int longitudActual = 1;
		    int km = 1;
		    
		    while (true) {
		        int alturaActual = entrada.nextInt();
		        
		        if (alturaActual == -1) {
		            break;  // Fin de esta etapa
		        }
		        
		        // Comprobar si sigue la zona llana
		        if (alturaActual == alturaAnterior) {
		            longitudActual++;
		        } else {
		            // Se acabó la zona llana anterior
		            // ¿Es la mejor hasta ahora?
		            if (longitudActual >= 2 && longitudActual > mejorLongitud) {
		                mejorInicio = inicioActual;
		                mejorLongitud = longitudActual;
		            }
		            
		            // Empezar nueva zona
		            inicioActual = km;
		            longitudActual = 1;
		        }
		        
		        alturaAnterior = alturaActual;
		        km++;
		    }
		    
		    // Comprobar la última zona (por si la etapa termina en zona llana)
		    if (longitudActual >= 2 && longitudActual > mejorLongitud) {
		        mejorInicio = inicioActual;
		        mejorLongitud = longitudActual;
		    }
		    
		    // Imprimir resultado
		    if (mejorInicio == -1) {
		        System.out.println("HOY NO COMEN");
		    } else {
		        System.out.println(mejorInicio + " " + (mejorLongitud - 1));
		    }
		}

		
		
		//Fin de programa	
			entrada.close();
			
		}
		
		
	}
	

	


