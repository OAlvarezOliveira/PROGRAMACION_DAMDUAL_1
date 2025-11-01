/**
 * 
 */
package com.acarballeira.ud1.aleatorios;

import java.util.Random;


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
 * Ejercicio 4 — Precio del petróleo (30 días)
 * 
 * Enunciado:
 * 
 * Simula la evolución del precio del barril de petróleo durante 30 días.
 * 
 * Cada día el programa generará un precio aleatorio entre 130 € y 150 € (ambos
 * incluidos).
 * 
 * En cada iteración se mostrará el día y el precio generado.
 * 
 * Al finalizar:
 * 
 * Muestra el precio promedio de los 30 días.
 * 
 * Muestra el precio mínimo y el día en que se registró ese mínimo
 */
public class Ejercicio04 {

	public static void main(String[] args) {

		int precio;
		int precioMinimo = 400;
		int diaMinimo = 0;
		double suma = 0.0;
		double promedio;

		Random aleatorio = new Random();

		for (int dia = 1; dia <= 30; dia++) {

			precio = aleatorio.nextInt(130, 151); // [130–150]
			System.out.println("Día " + dia + " -> Precio del petróleo: " + precio + " €");

			suma += precio;

			if (precio < precioMinimo) {
				precioMinimo = precio;
				diaMinimo = dia;
			}
		}

		promedio = suma / 30;
		System.out.printf("%nPrecio promedio de los 30 días: %.2f €%n", promedio);
		System.out.println("El precio mínimo fue " + precioMinimo + " € y se registró por primera vez el día " + diaMinimo + ".");
	}
}
