package com.acarballeira.ud1.breakcontinue;


/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

/*

Elaborar un programa Java que calcule e amose a suma dos 100 primeiros números
naturales. Non se debe contabilizar a suma dos números, 3, 6 e 5. No caso de que a suma
acumule un valor superior a 150 debes deixar de acumular valores.
 
*/

public class Ejercicio01 {

	public static void main(String[] args) {
		
		//Declaracion de Variables
		final byte N_MAX;
		int suma;
		
		
		//Inicializacion de Variables
		N_MAX = 100;
		suma = 0 ;
		
		
        for(int i = 1 ; i <= N_MAX; i++) {
			if(i ==3 ||i ==5 ||i ==6){continue; }
        	System.out.println("ciclo:"+i); // imprimo i for debug
        	suma+=i;
			if(suma > 150){break; }

		}
		System.out.println("Suma:"+suma); // imprimo suma for debug

	}

}
