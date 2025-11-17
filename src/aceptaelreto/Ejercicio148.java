package aceptaelreto;

import java.util.Scanner;

/**
 * Nochevieja Tiempo máximo: 1,000 s Memoria máxima: 4096 KiB Ramón se pasa el
 * día de Nochevieja contando los minutos que faltan para que den las uvas.
 * ¿Puedes ayudarle?
 * 
 * Entrada La entrada consiste en una serie de horas, cada una en una línea.
 * Cada hora está formada por las horas y los minutos separados por : y
 * utilizando siempre dos dígitos. Se utiliza una representación en formato 24
 * horas (es decir, desde 00:00 a 23:59).
 * 
 * La entrada termina cuando la hora es la medianoche (00:00), que no debe
 * procesarse.
 * 
 * Salida Para cada caso de prueba se mostrará una línea con el número de
 * minutos que faltan para medianoche.
 * 
 * Entrada de ejemplo 23:45 21:30 00:01 00:00 Salida de ejemplo 15 150 1439
 */

public class Ejercicio148 {

	public static void main(String[] args) {

		// Declaracion
		Scanner teclado;
		String hora;
		String h;
		String m;
		int minutos_restantes;

		// Inicializacion
		teclado = new Scanner(System.in);
		hora = teclado.nextLine();
		h = hora.substring(0, 2);
		m = hora.substring(3);

		int hN = Integer.parseInt(h);
		int mN = Integer.parseInt(m);
		// Operativa
		while (!hora.equalsIgnoreCase("00:00")) {

			minutos_restantes = ((23 - hN) * 60) + 60 - mN;
			System.out.println(minutos_restantes);
			hora = teclado.nextLine();
			h = hora.substring(0, 2);
			m = hora.substring(3);
			hN = Integer.parseInt(h);
			mN = Integer.parseInt(m);

		}
		teclado.close();

	}

}
