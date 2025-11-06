package examenund1;

import java.util.Scanner;

/**
 * Resolucion de la tarea 1
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class App_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declarar variables
		int n;
		int suma;
		int anterior1;
		int anterior2;
		Scanner entrada = new Scanner (System.in); 
		
		
		//inicializar variables
		anterior1 = 0;
		anterior2 = 1;
		suma = 0; 
		n = 5; // forzamos el primer ciclo del while
		
		//Entrada de datos , operativa y salida de datos 
		while(n < 6 && !(n%2 == 0) ) {
		System.out.println("Introduce la cantidad de numeros de la tabla de fibbonacci a representar");
		n = entrada.nextInt();
		}
		System.out.print(anterior1+",");
		anterior1 = 0;
		anterior2 = 1;
		for (int i = 0 ; i < n-1 ; i ++) {
				suma = suma+anterior1+anterior2;
			System.out.print(","+suma);
			}
		entrada.close();
			}

		}


	
