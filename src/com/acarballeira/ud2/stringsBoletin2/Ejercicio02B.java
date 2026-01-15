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
public class Ejercicio02B {

	public static void main(String[] args) {

		String resultado = ""; 
		int veces;
		
		veces = Integer.parseInt(args[0]) *Integer.parseInt(args[1]);
		

		for (int i = 0; i < veces; i++) {

		    resultado = resultado.concat(args[2]);

		}
		System.out.println(resultado);
	}

}
