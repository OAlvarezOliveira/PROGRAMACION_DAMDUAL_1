package examenund1;

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

public class App_4 {

	public static void main(String[] args) {

		// Declaracion de variables
		int a;
		int b;
		int mayor;
		int menor;
		Random aleatorio;
		aleatorio = new Random();
		int resta;

		// Inicializar variables
		mayor = -2;
		menor = 200;
		resta = 0;

		// Toma de datos y Operativa
		a = aleatorio.nextInt(0, 101); // genero el numero a
		System.out.println("El valor de a es" + a);
		mayor = a;

		b = aleatorio.nextInt(0, 101); // genero el numero b
		if (b > a) {
			mayor = b;
			menor = a;
		} else {
			menor = b;
		}
		System.out.println("el valor de b es " + b);

		System.out.println("el valor de mayor es " + mayor);
		System.out.println("el valor de menor es " + menor);

		for (int i = mayor; i >= menor + 1; i--) {
			resta++;
		}

		// Salida de datos
		System.out.println("la diferencia entre " + mayor + " y " + menor + " es " + resta);

	}
}
