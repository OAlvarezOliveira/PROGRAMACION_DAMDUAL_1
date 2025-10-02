/**
 * 
 */
package pruebas;

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

/**
 * @author O.Alvarez
 *
 */
public class menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declarar Variables
		int opcion;
		Scanner teclado;
		double n1;
		double n2;
		double res;

		// Inicializar variables

		teclado = new Scanner(System.in);
		opcion = 0;
		n1 = 0;
		n2 = 0;
		res = 0;

		while (opcion != 5) {
			System.out.println("Calculadora");
			System.out.println("-------------------------");
			System.out.println("1.- SUMAR");
			System.out.println("2.- RESTAR");
			System.out.println("3.- MULTIPLICAR");
			System.out.println("4.- DIVIDIR");
			System.out.println("5.- SALIR");
			System.out.println("Introduzca una opcion");
			try {
			opcion = teclado.nextInt();
			}catch (Exception e) {
				System.out.println("Mete solo numeros");
				teclado.next();
			}
			
			switch (opcion) {
			case 1: // Sumar
				System.out.println("SUMAR");
				System.out.println("Introduzca numero");
				n1 = teclado.nextInt();
				System.out.println("Introduzca numero");
				n2 = teclado.nextInt();
				res = n1 + n2;
				System.out.println("El resultado de la sumar es :" + res);
				break;

			case 2: // Restar
				System.out.println("RESTAR");
				System.out.println("Introduzca numero");
				n1 = teclado.nextInt();
				System.out.println("Introduzca numero");
				n2 = teclado.nextInt();
				res = n1 - n2;
				System.out.println("El resultado de la resta es :" + res);
				break;
			case 3: // Multiplicar
				System.out.println("MULTIPLICAR");
				System.out.println("Introduzca numero");
				n1 = teclado.nextInt();
				System.out.println("Introduzca numero");
				n2 = teclado.nextInt();
				res = n1 * n2;
				System.out.println("El resultado de la multiplicacion es :" + res);
				break;
			case 4: // Dividir
				System.out.println("DIVIDIR");
				System.out.println("Introduzca numero");
				n1 = teclado.nextInt();
				System.out.println("Introduzca numero");
				n2 = teclado.nextInt();
				if (n2 == 0) {
					System.out.println("No es posible dividir por cero");
				} else {
					res = n1 / n2;
					System.out.println("El resultado de la division es :" + res);
				}
				break;
			case 5: // Salir
				System.out.println("....Saliendo....");
				break;
			default:
				System.out.println("Opcion no valida");

			}// fin Switch
		}
		teclado.close();

	}

}
