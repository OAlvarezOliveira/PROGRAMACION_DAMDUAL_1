/**
 * Resolución de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio11.java
 */
package com.acarballeira.ud2.condicionales2;
import java.util.Scanner;

/*
 *  Programa que pida los grados de un ángulo y muestre su equivalente en radianes. 
 *  Si el ángulo introducido no se encuentra en el rango de [0-360], 
 *  hay que transformarlo a dicho rango. 
 */


public class Ejercicio15 {

	  public static void main(String[] args) {

	        // Declaración de variables
	        double grados;
	        double gradosNormalizados;
	        double radianes;
	        Scanner scanner = new Scanner(System.in);

	        // Entrada de datos
	        System.out.print("Introduce los grados del ángulo: ");
	        grados = scanner.nextDouble();
	        scanner.close();

	        // Normalización del ángulo al rango [0, 360)
	        gradosNormalizados = (grados % 360 + 360) % 360;

	        // Conversión a radianes: rad = grados * π / 180
	        radianes = gradosNormalizados * Math.PI / 180;

	        // Salida
	        System.out.println("Ángulo normalizado: " + gradosNormalizados + "°");
	        System.out.println("Equivalente en radianes: " + radianes);
	    }
}