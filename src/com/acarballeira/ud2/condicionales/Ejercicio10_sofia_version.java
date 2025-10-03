/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio10.java
 */

package com.acarballeira.ud2.condicionales;
import java.util.Scanner;

/**
 * Resolucion de la tarea XX
 * 
 * Curso 2025-26
 * 
 * @author Sofia Estevez
 * @version 1.0
 */




public class Ejercicio10_sofia_version {



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);



		int seg;



		System.out.print("a�ade valor para hora1: ");

		seg = (scanner.nextInt() * 60 * 60);

		System.out.print("a�ade valor para minutos1: ");

		seg += (scanner.nextInt() * 60);

		System.out.print("a�ade valor para segundos1: ");

		seg += scanner.nextInt();

		System.out.print("a�ade valor para hora2: ");

		seg += (scanner.nextInt() * 60 * 60);

		System.out.print("a�ade valor para minutos2: ");

		seg += (scanner.nextInt() * 60);

		System.out.print("a�ade valor para segundos2: ");

		seg += scanner.nextInt();



		scanner.close();

		

		



		if (seg / (24 * 60 * 60) > 0) {

			if (seg / (24 * 60 * 60) == 1) {

				System.out.println((seg / (24 * 60 * 60)) + " dia, " + ((seg % (24 * 60 * 60)) / 3600) + " horas, "

						+ (((seg % (24 * 60 * 60)) % 3600) / 60) + " minutos, " + (((seg % (24 * 60 * 60)) % 3600) % 60)

						+ " segundos.");



			} else {

				System.out.println((seg / (24 * 60 * 60)) + " dias, " + ((seg % (24 * 60 * 60)) / 3600) + " horas, "

						+ (((seg % (24 * 60 * 60)) % 3600) / 60) + " minutos, " + (((seg % (24 * 60 * 60)) % 3600) % 60)

						+ " segundos.");

			}

		} else if ((seg % (24 * 60 * 60)) / 3600 > 0) {

			System.out.println(((seg % (24 * 60 * 60)) / 3600) + " horas, " + (((seg % (24 * 60 * 60)) % 3600) / 60)

					+ " minutos, " + (((seg % (24 * 60 * 60)) % 3600) % 60) + " segundos.");

		} else if (((seg % (24 * 60 * 60)) % 3600) / 60 > 0) {

			System.out.println((((seg % (24 * 60 * 60)) % 3600) / 60) + " minutos, "

					+ (((seg % (24 * 60 * 60)) % 3600) % 60) + " segundos.");

		} else {

			System.out.println((((seg % (24 * 60 * 60)) % 3600) % 60) + " segundos.");

		}



	}



}


