/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema239.java
 */

package aceptaelreto;

import java.util.Scanner;

/**
 * Pi. Pi. Pi. Pi. Pi. Piiiii Tiempo máximo: 2,000-4,000 s Memoria máxima: 4096
 * KiB Big Ben El primer uso de señales horarias por parte de la humanidad se
 * pierde en la noche de los tiempos. El canto de un gallo o el tañido de una
 * campana sirvieron como mecanismos primitivos para avisar de los momentos en
 * los que realizar ciertos actos en común.
 * 
 * La medición del tiempo adquirió una importancia capital cuando se comenzó a
 * utilizar para averiguar la longitud de un punto cualquiera de la tierra al
 * comparar la hora local con la de un punto de referencia conocido. Si bien
 * esta solución se hizo viable por primera vez en 1760, no fue hasta la segunda
 * mitad del siglo XIX cuando comenzó a utilizarse ampliamente. En esa época se
 * establece definitivamente el meridiano que pasa por Greenwich como el
 * meridiano cero para todo el mundo. Además, se construye el famoso Big Ben,
 * reloj que servía para dar la hora oficial de Londres sincronizando así, entre
 * otras cosas, los ferrocarriles y el tráfico marítimo.
 * 
 * Pero, obviamente, las señales horarias del Big Ben no son audibles a grandes
 * distancias. Para solucionarlo, en la noche de Año Nuevo de 1924, la BBC
 * decidió retransmitir sus campanadas a todo el país. El éxito fue tal, que el
 * 5 de febrero de ese mismo año comenzaron a emitir, a todas las horas en
 * punto, las que hoy se conocen como Greenwich Time Signal o GTS ("señales de
 * la hora de Greenwich"), que terminaron extendiéndose por las radios de todo
 * el mundo tras la Segunda Guerra Mundial. Son los seis famosos pitidos, cinco
 * cortos en los últimos segundos de cada hora, y uno más largo en el primer
 * segundo de la hora siguiente, que podemos oir en prácticamente todas las
 * emisoras de radio.
 * 
 * Cada GTS supone un total de 6 segundos durante los cuales las radios de todo
 * el mundo no emiten nada más para evitar lo que los ingleses llaman "crashing
 * the pips". Con el paso de los años, eso ha ido acumulando más y más tiempo en
 * silencio. ¿Sabes cuánto?
 * 
 * Entrada El programa recibirá, por la entrada estándar, múltiples casos de
 * prueba. Cada uno consiste en dos números, el primero indicando el número de
 * días durante los cuales se ha emitido el GTS, y el segundo el número de
 * emisoras que lo han hecho.
 * 
 * El último caso de prueba, que no deberá procesarse, tendrá 0 en ambos
 * valores.
 * 
 * Salida Para cada caso de prueba el programa escribirá, en una línea
 * independiente, el tiempo dedicado por las emisoras a radiar el GTS. El
 * formato será D:HH:MM:SS, donde D indica número de días, HH número de horas,
 * MM número de minutos y SS número de segundos totales.
 * 
 * Como es lógico, HH no deberá ser mayor que 23 y MM y SS no podrán ser mayores
 * de 59. Además deberán escribirse siempre con dos dígitos. Para el número de
 * días (D), que no será nunca mayor de 1.000, no se deben escribir dígitos
 * adicionales.
 * 
 * Entrada de ejemplo 1 1 3 9 300 2 0 0 Salida de ejemplo 0:00:02:24 0:01:04:48
 * 1:00:00:00
 */
public class Problema239 {

	public static void main(String[] args) {

		// Declarar Variables
		long dias;
		long emisoras;
		long dias_Gts;
		long horas_Gts;
		long minutos_Gts;
		long segundos_Gts;
		long segundos_totales;
		final int DURACION_GTS;
		final int HORAS_EMISION_GTS;
		final int DURACION_DIAS;
		final int DURACION_HORAS;
		final int DURACION_MINUTOS;

		Scanner entrada;

		// Inicializar Variables
		DURACION_GTS = 6;
		HORAS_EMISION_GTS = 24;
		DURACION_DIAS = 86400;
		DURACION_HORAS= 3600;
		DURACION_MINUTOS = 60;
		entrada = new Scanner(System.in);

		// Operativa
		while (true) { // Procesamiento de múltiples casos hasta encontrar "0 0"
			// Entrada de Valores
			dias = entrada.nextInt();
			emisoras = entrada.nextInt();

			if (dias == 0 && emisoras == 0) {
				break;
			} else {
				segundos_totales = dias * emisoras * (DURACION_GTS * HORAS_EMISION_GTS);
				// to test	System.out.println("segundos_totales " + segundos_totales); 

				//Dias
				dias_Gts = (segundos_totales / DURACION_DIAS);
				// to test	System.out.println("Dias " + dias_Gts); 
				segundos_totales = (segundos_totales - (dias_Gts * DURACION_DIAS));
				
				// Horas
				horas_Gts = (segundos_totales /DURACION_HORAS );
				// to test	System.out.println("Horas " + horas_Gts ); 
				segundos_totales = (segundos_totales - (horas_Gts  * DURACION_HORAS));
				
				// Minutos
				minutos_Gts = (segundos_totales /DURACION_MINUTOS );
				segundos_totales = (segundos_totales - (minutos_Gts * DURACION_MINUTOS));
				// to test	System.out.println("Minutos " + minutos_Gts); 
				
				// Segundos
				segundos_Gts = segundos_totales;
				// to test				System.out.println("Segundos " + segundos_Gts); 

			}
			System.out.printf("%d:%02d:%02d:%02d\n",dias_Gts, horas_Gts, minutos_Gts, segundos_Gts);
		} // Fin while
		entrada.close();

	}

}
