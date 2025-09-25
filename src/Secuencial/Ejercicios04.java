package Secuencial;

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

public class Ejercicios04 {

	public static void main(String[] args) {

		// Declaracion de variables
		double a;
		double b;
		Scanner teclado = new Scanner(System.in);

		// Inicializacion

		// Entrada de datos
		System.out.println("introduce el valor de a:");
		a = teclado.nextDouble();
		System.out.println("introduce el valor de b:");
		b = teclado.nextDouble();

		// Operativa
		a = a + b; // Total
		b = a - b;
		a = a - b;

		// Salida de informacion
		System.out.println("El valor de a es:" + a);
		System.out.println("El valor de b es:" + b);

	}

}