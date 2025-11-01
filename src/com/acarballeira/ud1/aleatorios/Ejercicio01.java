/**
 * 
 */
package com.acarballeira.ud1.aleatorios;

import java.util.Random;
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
 * Adivina el número. El usuario debe adivinar el número aleatorio calculado por la
computadora atendiendo a las siguientes condiciones:
a. La computadora generará dos números aleatorios entre [0-100] que serán
sumados.
b. La computadora dará una pista “El número a acertar es el anterior a: ”
(mostrando el número anterior al calculado)
c. El usuario tendrá 5 tentativas para adivinar el número. Pasadas las 5
tentativas finalizará el programa.
d. Si acierta se le notificará mediante un mensaje alusivo y finalizará el
programa.
e. Si falla se le notificará mediante un mensaje alusivo, se mostrará de nuevo
la pista y permitirá que el usuario pruebe con otro número.
 *
 */
public class Ejercicio01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declarar Variables
		int num;
		int numSecret;
		int vidas;
		boolean acertado;
		Random aleatorio;
		aleatorio = new Random();
		Scanner entrada = new Scanner(System.in);

		// Inicio Variables
		vidas = 5;
		acertado = false;
		numSecret = aleatorio.nextInt(0, 101); // genero el numero del 0-100 para adivinar

		while (vidas > 0 && !acertado) {
		    System.out.println("Introduce el número (0-100). Te quedan " + vidas + " vidas:");
		    num = entrada.nextInt();

		    if (num == numSecret) {
		        acertado = true;
		        System.out.println("¡Has acertado!");
		    } else if (num > numSecret) {
		        System.out.println("¡Demasiado alto!");
		        vidas--;
		    } else {
		        System.out.println("¡Demasiado bajo!");
		        vidas--;
		    }
		}

		if (!acertado) {
		    System.out.println("Has agotado tus intentos. El número era: " + numSecret);
		}// Fin While
		entrada.close();
	}

}
