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
 * 2. Crea un programa que pida un número de mes al usuario (por ejemplo, el 4)
 * y el programa conteste cuántos días tiene (por ejemplo, 30) y el nombre del
 * mes. Debes usar dos vectores. Para simplificarlo vamos a suponer que febrero
 * tiene 28 días.
 * 
 */

public class Ejercicio02 {

	public static void main(String[] args) {

		int nMes;

		// Array con el número de días para cada mes (sin contar años bisiestos para
		// febrero)
		int[] cantDias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// Array con los nombres de los meses
		String[] nombreMes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		System.out.printf("Introduce el mes que deseas conocer \n");

		Scanner teclado = new Scanner(System.in, "UTF-8");
		nMes = teclado.nextInt();

		if (nMes > 12 || nMes < 0) {
			System.out.printf("Mes no válido !!!");
		} else {
			System.out.printf("Nº días: d%. Mes:%s", nombreMes[nMes - 1], cantDias[nMes - 1]);
		}

		teclado.close();
	}

}
