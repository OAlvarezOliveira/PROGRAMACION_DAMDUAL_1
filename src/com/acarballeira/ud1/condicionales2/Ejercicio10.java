/**
 * Resolución de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio06.java
 */

package com.acarballeira.ud1.condicionales2;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

/**
Pedir día, mes y año y comprobar que la fecha compuesta sea correcta.  . 
 */
public class Ejercicio10 {

	public static void main(String[] args) {

		// Declaración de variables
		int  dia;
		int  mes;
		int  anio;
		LocalDate fecha;

		// Entrada de datos
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introdece el día que es hoy: ");
		dia = scanner.nextInt();
		System.out.print("Introdece el mes que es hoy: ");
		mes = scanner.nextInt();
		System.out.print("Introdece el año que es hoy: ");
		anio = scanner.nextInt();
		scanner.close();


		// Operativa
		try {
		    fecha = LocalDate.of(anio, mes, dia);
			System.out.println("La fecha es válida");
		} catch (DateTimeException e) {
			System.out.println("La fecha es incorrecta");
		}

		/* Version con Bisiextos en formato comparacion

		boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
		boolean fechaCorrecta = true;

		if (mes < 1 || mes > 12) {
			fechaCorrecta = false;
		} else if (dia < 1) {
			fechaCorrecta = false;
		} else {
			switch (mes) {
			case 2:
				if (esBisiesto && dia > 29) {
					fechaCorrecta = false;
				} else if (!esBisiesto && dia > 28) {
					fechaCorrecta = false;
				}
				break;
			case 4: case 6: case 9: case 11:
				if (dia > 30) fechaCorrecta = false;
				break;
			default:
				if (dia > 31) fechaCorrecta = false;
			} 
		}

		if (anio > LocalDate.now().getYear()) {
			fechaCorrecta = false;
		}

		if (fechaCorrecta) {
			System.out.println("La fecha es válida");
		} else {
			System.out.println("La fecha es incorrecta");
		}

*/

	}
}
