package com.acarballeira.ud1.breakcontinue;

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
 * 
 * Crea un programa en Java que escriba os números pares do 100 ao 130, ambos
 * incluidos, excepto o 116 de 3 formas distintas:
 * 
 * a. Incrementando 2 en cada iteración e empregando continue.
 * 
 * b. Incrementando 1 en cada iteración e empregando continue.
 * 
 * c. Mediante un bucle infinito empregando break e continue.
 * 
 * As tres solucións deben implementarse mediante un bucle for.
 * 
 */

public class Ejercicio05c {

	public static void main(String[] args) {

		// Declaracion de Variables
		int i;

		// Inicializacion de Variables
		i = 99;

		// Operativa

		for (;;) {
//			System.out.println("valor i inicial" + i);
			if (++i == 116 || i % 2 == 1) {

				continue;
			}
			System.out.println(i);
	
			if (i >= 130) {

				break;
			}
		}

	}

}
