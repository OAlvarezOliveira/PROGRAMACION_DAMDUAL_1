/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01.java
 */

package com.acarballeira.ud1.boletinbucles;

import java.util.Scanner;

/*
Diseñar un algoritmo que permita mostrar en pantalla una rutina de selección del
siguiente menú:
1.- Suma
2.- Resta
3.- Producto
4.- División
S.- Salir.
El usuario podrá elegir cualquier alternativa, luego ingresar A y B y realizar la
operación seleccionada. Solamente con “S” podrá Salir. Tener en cuenta que si elige
4.- División deberá ingresar el denominador hasta que ingrese un valor diferente a
0 (cero). Si ingresa un número negativo o mayor que 4 deberá informar “Opción no
válida”.
 */
public class Ejercicio10 {

	public static void main(String[] args) {

		// declarar variables
		double op1;
		double op2 = 0;
		double res;
		Scanner sc;
		char opcion;
		int numAnterior;

		// iniciar varianbles
		sc = new Scanner(System.in);

			
			do {
				System.out.println("Introduce 1 para sumar ");
				System.out.println("Introduce 2 para restar  ");
				System.out.println("Introduce 3 para multiplicar ");
				System.out.println("Introduce 4 para dividir ");
				System.out.println("Introduce 's'par salir del programa ");
				System.out.println("Introduzca una opcion: ");
				opcion = sc.next().toLowerCase().charAt(0);
				
				switch (opcion) {
				case '1' ->	{
				System.out.println("Sumando ");
				System.out.println("Introduzca el operado1: ");
				op1 = sc.nextDouble();
				System.out.println("Introduzca el operado2: ");
				op2 = sc.nextDouble();	
				res  = op1+op2;
				System.out.println("El resultado es:  "+res);				
				}

				case '2' ->{
					System.out.println("Restando ");
					System.out.println("Introduzca el operado1: ");
					op1 = sc.nextDouble();
					System.out.println("Introduzca el operado2: ");
					op2 = sc.nextDouble();	
					res  = op1-op2;
					System.out.println("El resultado es:  "+res);				
					}

				case '3' ->{
					System.out.println("Multiplicando ");
					System.out.println("Introduzca el operado1: ");
					op1 = sc.nextDouble();
					System.out.println("Introduzca el operado2: ");
					op2 = sc.nextDouble();	
					res  = op1*op2;
					System.out.println("El resultado es:  "+res);				
					}

				case '4' ->{
					System.out.println("Dividiendo ");
					System.out.println("Introduzca el operado1: ");
					op1 = sc.nextDouble();
					while (op2==0) {System.out.println("Introduzca el operado2: ");
					op2 = sc.nextDouble();	}
					res  = op1/op2;
					System.out.println("El resultado es:  "+res);				
					}

				case 's' ->	System.out.println("Saliendo del programa ");
				
				
				default ->System.out.println("Opcion incorrecta ");
				
				}//fin Switch
				
			} while(opcion != 's');

		System.out.println("Salimos del programa ");
		sc.close();
	}

}
