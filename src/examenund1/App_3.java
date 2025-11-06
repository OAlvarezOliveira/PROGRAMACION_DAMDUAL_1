package examenund1;

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

public class App_3 {

	public static void main(String[] args) {

		// Declaracion de variables
		int minutos;
		double total;

		Scanner entrada = new Scanner(System.in);

		// Inicializar variables
		minutos = 0; // solo por pruebas
		total = 0; // solo por pruebas

		// Toma de datos
		System.out.println("Introduce la duracion de tu estancia en minutos");
		minutos = entrada.nextInt();

		// Operativa
		if (minutos < 15) {
			System.out.println("Su estancia es gratis");

		} else if (minutos >= 15 && minutos <= 60) {
			total = 1;
			System.out.println("El importe a pagar es " + total + " Euros");

		} else if (minutos > 60 || minutos <= 480) {
			minutos = minutos - 60;
			total = (minutos) * 0.02 + 1;
			System.out.println("El importe a pagar es " + total + " Euros");

		} else if (minutos > 480) {
			minutos = minutos - 60;
			total = (minutos) * 0.015 + 1;
			System.out.println("El importe a pagar es " + total + " Euros");

		}

		entrada.close();
	}

}
