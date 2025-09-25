package com.acarballeira.ud1.secuencial;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */
import java.util.Scanner;

public class Ejercicios03 {

	public static void main(String[] args) {

		// Declaracion de variables
		double radio;
		double area;
		Scanner teclado = new Scanner(System.in);

		// Inicializacion

		// Entrada de datos
		System.out.println("introduce el radio:");
		radio = teclado.nextDouble();

		// Operativa
		area = Math.PI * Math.pow(radio, 2);
		// Salida de informacion
		System.out.println("El Area de un circulo de radio" + radio + "es " + area);

	}

}
