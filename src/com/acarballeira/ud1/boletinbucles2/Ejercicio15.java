/**
 * Resolucion de la tarea 14 boletin bucles 2
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio12.java
 */

package com.acarballeira.ud1.boletinbucles2;

import java.util.Scanner;

/**
 * Calcula en mínimo común múltiplo de dos números introducidos por teclado..
 */

public class Ejercicio15 {

	public static void main(String[] args) {

		// Declaracion
		int n1;
		int n2;
		int res1;
		int res2;
		boolean encontrado;
		int mcm;
		Scanner entrada;

		// Inicializacion
        encontrado = false;
        mcm = 0;
		entrada = new Scanner(System.in);

		// Entrada de datos
		System.out.print("Introduce el primer numero para calcular el mcm: ");
		n1 = entrada.nextInt();
		System.out.print("Introduce el segundo numero para calcular el mcm: ");
		n2 = entrada.nextInt();

		// Operativa
		for (int i = 1; !encontrado; i++) {
			res1 = n1 * i;
            for (int j = 1; j <= i; j++) {    
                res2 = n2 * j;
                if (res1 == res2) {
                    mcm = res1;
                    encontrado = true;
                    break;
                }
            }
        }

		// Salida de datos
		System.out.println("El mcm de (" + n1 + ", " + n2 + ") es: " + mcm);
		entrada.close();
	}
}
