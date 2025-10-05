/**
 * Resolución de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio06.java
 */

package com.acarballeira.ud2.condicionales2;
import java.util.Scanner;

/**
Programa que indique 
cuantas cifras tiene un número entero
introducido por teclado. Número en el rango [0-99999]. 
 */
public class Ejercicio12 {

	public static void main(String[] args) {

		// Declaración de variables
		int  horas;
		int  minutos;
		int  segundos;
		int segundostotales;

		// Entrada de datos
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdece las horas: ");
		horas = scanner.nextInt();
		segundostotales = horas *360;
		
		System.out.println("Introdece los minutos: ");
		minutos = scanner.nextInt();
		segundostotales = segundostotales + (minutos *60);

		System.out.println("Introdece los segundos: ");
		segundos = scanner.nextInt();
		segundostotales = segundostotales + segundos;
		scanner.close();
		
        //Operativa
        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }

        if (minutos == 60) {
            minutos = 0;
            horas++;
        }

        if (horas == 24) {
            horas = 0;
        }

        // Salida
        System.out.printf("La hora +1 seg es → %02d:%02d:%02d\n", horas, minutos, segundos);
    }

}
