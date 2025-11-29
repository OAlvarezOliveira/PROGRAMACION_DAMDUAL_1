/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema157.java
 */

package aceptaelreto;

import java.util.Scanner;

/**
 ¿Cuantos días faltan?
Tiempo máximo: 1,000 s  Memoria máxima: 4096 KiB
Dado un día del año, ¿sabrías decir cuantos días faltan para Nochevieja? Asumiremos que nos encontramos en un año no bisiesto.

Entrada
La entrada comenzará con un entero para especificar el número de casos de prueba que vendrá a continuación. Para cada caso de prueba se mostrará una línea en la que aparecerán dos enteros, el primero de ellos será correspondiente al día y el segundo correspondiente al mes de una fecha válida.

Salida
Para cada fecha de la entrada, se mostrarán el número de días completos que faltan hasta el día de Nochevieja.

Entrada de ejemplo
3
28 12
30 12
1 1
Salida de ejemplo
3
1
364 
 */
public class Problema157 {

	public static void main(String[] args) {
		
		//Declarar variables
		int numCasos;
		int diaActual;
		int mesActual;
		int diasRestantes;
		Scanner entrada;
		
		
		//Inicializar Variables
		diasRestantes = 0; 
		entrada = new Scanner(System.in);
		
		//Entrada de numero de casos a procesar
		
		numCasos = entrada.nextInt();

		
		for (int i = 0; i < numCasos; i++) {
			
			//Entrada de datos para cada caso

			diaActual = entrada.nextInt();
			mesActual = entrada.nextInt();
			
			switch (mesActual) {
			case 1 -> diasRestantes = 365  - diaActual;
			case 2 -> diasRestantes = 334   - diaActual;
			case 3 -> diasRestantes = 306   - diaActual;
			case 4 -> diasRestantes = 275   - diaActual;
			case 5 -> diasRestantes = 245   - diaActual;
			case 6 -> diasRestantes = 214   - diaActual;
			case 7 -> diasRestantes = 184   - diaActual;
			case 8 -> diasRestantes = 153   - diaActual;
			case 9 -> diasRestantes = 122   - diaActual;
			case 10 ->diasRestantes = 92     - diaActual;
			case 11 ->diasRestantes = 61     - diaActual;
			case 12 ->diasRestantes = 31   - diaActual;
			
			}//fin Swicht
			
			System.out.println(diasRestantes);
		}

		
		//Fin y cierre de entradas
		entrada.close();
	}

}
