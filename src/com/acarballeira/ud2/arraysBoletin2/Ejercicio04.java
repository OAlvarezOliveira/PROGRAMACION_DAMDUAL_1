package com.acarballeira.ud2.arraysBoletin2;

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

/*
Queremos guardar los nombres y la edades de los alumnos de un curso (máximo de 35
alumnos). Realiza un programa que introduzca el nombre y la edad de cada alumno. El
proceso de lectura de datos terminará cuando se introduzca como nombre un asterisco
(*) Al finalizar se mostrará los siguientes datos:
• Todos los alumnos mayores de edad.
• Los alumnos mayores (los que tienen más edad)
 * */

public class Ejercicio04 {
	
	private static final int CANTIDAD_ALUMNOS = 3;
	private static final int CANTIDAD_ATRIBUTOS = 2; 
	private static final int MAYORIA_EDAD = 18; 
	
	

	public static void main(String[] args) {

		String [][] matrizAlumnos;

		matrizAlumnos = new String [CANTIDAD_ALUMNOS][CANTIDAD_ATRIBUTOS];
		
		leerDatos(matrizAlumnos);
		mostrarMayoresEdad(matrizAlumnos);

	}

	private static String [][] leerDatos( String [][] matrizAlumnos) {
		
		
		Scanner scanner = new Scanner(System.in, "UTF-8");
		String dato;

		for (int i = 0; i < CANTIDAD_ALUMNOS; i++) {
			
			System.out.printf("Añade el nombre del alumno ");
			dato = scanner.next(); 
			if(dato.equals("*")) {break;}
			matrizAlumnos[i][0] = dato; 
			System.out.printf("Añade la edad del alumno ");
			matrizAlumnos[i][1] = scanner.next(); 
	 }
		scanner.close();	
		return matrizAlumnos;

	}
	
	private static void mostrarMayoresEdad (String [][] matrizAlumnos) {
		
		for(String [] fila : matrizAlumnos) {
			
			if(Integer.parseInt(fila[1]) > MAYORIA_EDAD ) {System.out.printf("\t- %s \n",fila[0]);}
		}
		
		
	}

}