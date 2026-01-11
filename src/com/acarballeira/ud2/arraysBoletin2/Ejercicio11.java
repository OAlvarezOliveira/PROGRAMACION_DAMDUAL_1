/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejecicio11.java
 */

package com.acarballeira.ud2.arraysBoletin2;

/**
Crear de forma estática un array de dúas dimensións que almacene o nome de 5 equipos da LNFS, 
indicando o nome do equipo, cidade e nome do estadio. 
Amosa o contido do array.

 */
public class Ejercicio11 {


	public static void main(String[] args) {


		String[][] equipos = {
			    {"Barça", "Barcelona", "Palau Blaugrana"},
			    {"Inter FS", "Madrid", "Pabellón Jorge Garbajosa"},
			    {"ElPozo Murcia", "Murcia", "Palacio de los Deportes"},
			    {"Palma Futsal", "Palma", "Son Moix"},
			    {"Levante UD FS", "Valencia", "Pabellón Fonte San Lluís"}
			};

		mostrarEquipos(equipos);
		
	}

	private static void mostrarEquipos(String[][] equipos) {
		
		for (int i = 0; i < equipos.length; i++) {
		    System.out.printf("Equipo %d: \n", i+1);
		    for (int j = 0; j < equipos[i].length; j++) {
		        System.out.printf("  %s \n", equipos[i][j]);
		    }
		    System.out.printf("\n");
		}
		
	}

}
