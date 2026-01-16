/**
 * 
 */
package com.acarballeira.ud2.stringsBoletin2;

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
 * @author  O.Alvarez
 *
 */

public class Ejercicio07B {
	
	public static void main(String[] args) {
				
		String dni;
		char letraDNI;
		
		dni = leerDNI();
		letraDNI = obtenerLetraDNI(dni.substring(0, dni.length() - 1));
		
		if(letraDNI == dni.charAt(dni.length() - 1)) {
			System.out.printf("DNI correcto");
		} else {
			System.out.printf("DNI INcorrecto");
		}
						
	}

	/**
	 * 
	 * @param dni El DNI sin letra
	 * @return la letra del DNI pasado por parámetro. Si el número
	 * no está comprendido entre 00000000 y 99999999 devuelve ' '
	 */
	private static char obtenerLetraDNI(String dni) {
		
		var letras ="TRWAGMYFPDXBNJZSQVHLCKET";
		char letraCalculada;
		
		if(Integer.parseInt(dni) > 0 && Integer.parseInt(dni) < 99999999) {
			letraCalculada = letras.charAt(Integer.parseInt(dni) % 23);	
		} else {
			letraCalculada = ' ';
		}
		
		return letraCalculada;
	}

	private static String leerDNI() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Introduzca DNI con letra: ");
		return teclado.next();
		
	}
	
	
}






