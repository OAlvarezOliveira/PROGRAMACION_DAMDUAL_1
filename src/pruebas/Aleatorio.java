package pruebas;

import java.util.Random;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class Aleatorio {

	public static void main(String[] args) {
		Random aleatorio;
		int  num;
		aleatorio = new Random();
		
		num = aleatorio.nextInt(10,101);
		
		num = Math.abs(7 -15);

		System.out.println (num);
		
		
	}

}
