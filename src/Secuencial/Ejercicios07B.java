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
/*

Suma y resta usando métodos de la clase Math.
Multiplica y divide usando bitshifts (<< y >>).
Comprueba si es par usando operaciones bit a bit.

*/

import java.util.Scanner;

public class Ejercicios07B {

	public static void main(String[] args) {

		// ----------------------------
		// 1. Declarar variables
		// ----------------------------
		int n; // número introducido
		Scanner teclado = new Scanner(System.in);

		// ----------------------------
		// 2. Toma de datos / iniciar variables
		// ----------------------------
		System.out.print("Introduce un número entero: ");
		n = teclado.nextInt();
		teclado.close();

		// ----------------------------
		// 3. Operativa & 4. Salida
		// ----------------------------
		System.out.println("n + 20 = " + (Math.addExact(n, 20)));
		System.out.println("n - 54 = " + (Math.subtractExact(n, 54)));
		System.out.println("¿n es par? " + ((n & 1) == 0));
		System.out.println("n * 8 = " + (n << 3));
		System.out.println("n / 4 = " + (n >> 2));

	}

}