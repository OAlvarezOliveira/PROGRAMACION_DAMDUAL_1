/**
 * 
 */
package com.acarballeira.ud1.decisionmultiple;

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

public class Ejercicio02 {

	public static void main(String[] args) {

		// Declarar Variables

		int numeroMes;
		String textoMes;
		Scanner entrada = new Scanner(System.in);

		// Inicializar Variables
		System.out.println("Introduce un numero de mes");
		numeroMes = entrada.nextInt();
		
		// Operativa
		while (numeroMes != -1) {
			textoMes = switch (numeroMes) {
			case 1 -> "Enero";
			case 2 -> "Febrero";
			case 3 -> "Marzo";
			case 4 -> "Abril";
			case 5 -> "Mayo";
			case 6 -> "Junio";
			case 7 -> "Julio";
			case 8 -> "Agosto";
			case 9 -> "Septiembre";
			case 10 -> "Octubre";
			case 11 -> "Noviembre";
			case 12 -> "Diciembre";
			default -> "No Existe";
			};
			// Salida Info
			if (numeroMes != -1) {
			System.out.println("MES: " + textoMes);
			}
		} ;

		entrada.close();	
	}

}
