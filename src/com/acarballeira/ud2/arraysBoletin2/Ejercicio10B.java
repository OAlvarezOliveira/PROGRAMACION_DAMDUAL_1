/**
 * Resolucion de la tarea 1. Boletin arrays 2
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio10.java
 */

package com.acarballeira.ud2.arraysBoletin2;

import java.util.Scanner;

/**
 * Crea un programa que pida por pantalla cuatro países y a continuación tres
 * ciudades de cada uno de estos países. Los nombres de ciudades deben
 * almacenarse en un array multidimensional cuyo primer índice sea el número
 * asignado a cada país y el segundo índice el número asignado a cada ciudad.
 * Ejemplo de resultados que debe mostrar el programa:
 * 
 * País: Portugal Ciudades : Lisboa Porto Setúbal País: España Ciudades : Madrid
 * Barcelona Sevilla País: Francia Ciudades : Paris Lyon Niza País: Italia
 * Ciudades : Roma Napoles Sicilia
 * 
 */

public class Ejercicio10B {
	
	
	
	public static void main(String[] args) {
		
		String [][][] ciudades = 			
			{
					{
						{"Portugal", "PT"},
						{"Lisboa", "Porto", "Setúbal", "Lamego"}
					},
					
					{
						{"España", "ES"},
						{"Madrid", "Barcelona", "Sevilla"}
					},
					
					{
						{"Francia", "FR"},
						{"París", "Niza", "Lyon"}
					},
					
					{
	                    {"Italia", "IT"},
	                    {"Roma", "Nápoles", "Sicilia"},                    
	                }
			};
		
		for (int i = 0; i < ciudades.length; i++) {
			System.out.printf("País: %s \tCiudades: ", ciudades[i][0][0]);
			for (int j = 0; j < ciudades[i][1].length; j++) {
				System.out.printf("%s\t", ciudades[i][1][j]);				
			}
			System.out.printf("\n");
		}
		
		
	}

}

