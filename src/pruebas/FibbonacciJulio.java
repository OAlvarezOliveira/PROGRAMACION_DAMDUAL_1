package pruebas;


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

public class FibbonacciJulio {

	public static void main(String[] args) {
		//ZONA DE DECLARACIÓN
		int n;
		int i;
		int ultimo, penultimo, aux;
		Scanner teclado;
		
		//Inicialización
		teclado = new Scanner(System.in);
		//Defino os dous primeiros números da serie
		ultimo = 1;
		penultimo = 0;
		
		//ZONA DE PROCESO
		//Petición de datos
		do {
			System.out.print("Introduzca un número: ");
			n = teclado.nextInt();
			if (n < 6 || n%2 != 0) {
				System.out.println("Lembre que debe ser un número par maior que 6");
			}
		}while(n < 6 || n%2 != 0);

		//Algoritmo Fibonnacci
		for(i = 1; i <= n; i++) {			
			if (i != n) {
				System.out.print(penultimo + ",");
			}
			else { 
				System.out.print(penultimo);
			}
			aux = ultimo;
			ultimo = ultimo + penultimo;
			penultimo = aux;
		}//for
		teclado.close();
	}
}

//System.out.print(penultimo + (i != n ? ", ":""));


