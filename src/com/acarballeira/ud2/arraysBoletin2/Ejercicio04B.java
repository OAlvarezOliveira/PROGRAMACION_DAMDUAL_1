package com.acarballeira.ud2.arraysBoletin2;

import java.util.Scanner;

/**
* Resolucion de la tarea 1. Boletin arrays 2
 * 
 * Curso 2025-26
 * 
 * @author Oscar Alvarez
 * @version 1.0
 */

/*
Queremos guardar los nombres y la edades de los alumnos de un curso (máximo de 35
alumnos). Realiza un programa que introduzca el nombre y la edad de cada alumno. El
proceso de lectura de datos terminará cuando se introduzca como nombre un asterisco
(*) Al finalizar se mostrará los siguientes datos:
• Todos los alumnos mayores de edad.
• Los alumnos mayores (los que tienen más edad)
 * */

public class Ejercicio04B {
	
	private static final int MAX_ALUMNOS = 35;
	private static final int MAIORIA_IDADE = 18;
	private static int numAlumnos = 0;

	public static void main(String[] args) {
		
		String[][] alumnos;
		
		alumnos = leerDatos();
		System.out.printf("Mostrando alumnos mayores de edad.\n");
		mostrarMayoresEdad(alumnos);
		System.out.printf("Mostrando alumnos mayores de edad.\n");
		mostrarMayores(alumnos);		
		
	}
	
	private static void mostrarMayores(String[][] m) {
		
		int mayor;
		
		mayor = 0;
		
		//Calculo la edad mayor
		for(int i = 0; i < numAlumnos; i++) {			
			if (Integer.parseInt(m[i][1]) > mayor) {
                mayor = Integer.parseInt(m[i][1]);
            }	
		}
		
		//Ahora recorro el bucle buscando los nombres cuya edad = mayor
		for(int i = 0; i < numAlumnos; i++) {			
			if (Integer.parseInt(m[i][1]) == mayor) {
                System.out.printf("\t- %s \n", m[i][0]);
            }	
		}
	}

	private static String[][] leerDatos() {
		
		Scanner teclado;
		String [][] matriz;
		String dato;
		
		matriz = new String[MAX_ALUMNOS][2];		
		teclado = new Scanner(System.in, "UTF-8");
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.printf("Indícame el nombre: ");
			dato = teclado.next();			
			if(dato.equals("*")) {
				break;
			}	
			
			numAlumnos++;
			matriz[i][0] = dato;
			System.out.printf("Indícame la edad: ");
			matriz[i][1] = teclado.next();
		}
		
		teclado.close();
		return matriz;
	}
	
	private static void mostrarMayoresEdad(String[][] m) {
		
		for(int i = 0; i < numAlumnos; i++) {			
			if (Integer.parseInt(m[i][1]) > MAIORIA_IDADE) {
                System.out.printf("\t- %s \n", m[i][0]);
            }	
		}
	}

}

