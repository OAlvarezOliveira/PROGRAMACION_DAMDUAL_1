/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema216.java
 */

package aceptaelreto;

import java.util.Scanner;

/**
 * Goteras Tiempo máximo: 4,000 s Memoria máxima: 4096 KiB Cubo con el agua de
 * una gotera Con la llegada de las lluvias, has descubierto una molesta gotera
 * en el salón. Con precisión suiza, las gotas caen una vez por segundo desde el
 * techo hasta un improvisado cubo que te ves obligado a vaciar periódicamente
 * hasta que encuentres una solución.
 * 
 * Convivir con una gotera es complicado porque tienes que sincronizar tu vida
 * alrededor de los vaciados del cubo…
 * 
 * Entrada La entrada estará compuesta de un primer número indicando cuántos
 * casos de prueba vendrán a continuación.
 * 
 * Cada caso de prueba será un número mayor que cero con el número de gotas que
 * entran en el cubo.
 * 
 * Salida Para cada caso de prueba, el programa escribirá en una línea el tiempo
 * máximo que puedes estar sin cambiar el cubo en el formato HH:MM:SS, donde HH
 * indica el número de horas, MM el número de minutos y SS el número de
 * segundos.
 * 
 * Ningún cubo es tan grande como para poder estar más de un día completo sin
 * cambiarse.
 * 
 * Entrada de ejemplo 3 70 3600 3661 Salida de ejemplo 00:01:10 01:00:00
 * 01:01:01
 */
public class Problema216 {

	public static void main(String[] args) {

		// Declaracion
		int casos;
		int tamaño_cubo;
		int horas;
		int minutos;
		int segundos;
		final int DURACION_HORAS;
		final int DURACION_MINUTOS;
		Scanner entrada;

		// Incializar Variables

		DURACION_HORAS = 3600;
		DURACION_MINUTOS = 60;
		entrada = new Scanner(System.in);

		// Entrada casos
		casos = entrada.nextInt();

		// Operativa
		for (int i = 0; i < casos; i++) {

			tamaño_cubo = entrada.nextInt();

				// Horas
				horas = (tamaño_cubo / DURACION_HORAS);
				// to test System.out.println("Horas " + horas );
				tamaño_cubo = (tamaño_cubo - (horas * DURACION_HORAS));

				// Minutos
				minutos = (tamaño_cubo / DURACION_MINUTOS);
				tamaño_cubo = (tamaño_cubo - (minutos * DURACION_MINUTOS));
				// to test System.out.println("Minutos " + minutos);

				// Segundos
				segundos = tamaño_cubo;
				// to test System.out.println("Segundos " + segundos);
				System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);


		} // FIN FOR
		entrada.close();
	}

}
