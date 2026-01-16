/**
 * 
 */
package com.acarballeira.ud2.stringsBoletin2;

import java.util.Iterator;

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
 * @author  O.Alvarez
 *
 */
public class Ejercicio06B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num;
		
		num=numeroConsontates ("Julio Mosquera Gonzalez");
		System.out.printf("Numero de consonantes distintas %d",num);
		
		
		
	}

	private static int numeroConsontates(String cadena) {
		
		char[] consonantes = {'B','C','D','F','G','H','J','K','L','M','N','Ñ','P','Q','R','S','T','V','W','X','Y','Z'};
		int cont;
		
		cont = 0;
		
		for (int i = 0; i < consonantes.length; i++) {
			
			if (cadena.indexOf(consonantes[i]) != -1 ) {cont++;}
			
		}
		
		return cont;
	}

}
