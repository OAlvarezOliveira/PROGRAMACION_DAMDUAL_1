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
		Random aleatorio;
		int  numeroCompruebo;
		int  num1;
		int  num2;
		int  suma;
		int vidas;
		Scanner entrada; 

		
		vidas = 5;
		aleatorio = new Random();
    	entrada= new Scanner(System.in);      
		num1 = aleatorio.nextInt(101);
		num2 = aleatorio.nextInt(101);
		
		do {
			System.out.println("Introduce un numero");
			numeroCompruebo = entrada.nextInt();
			suma = num1 + num2;
//			System.out.println("suma vale" + suma );
			vidas--;
			if (vidas > 0 && ( numeroCompruebo == suma) ) {
				System.out.println("Acertaste");
			} else {				
				System.out.println("Bobo te quedan : "+ (vidas) + " para acertar." );
				System.out.println("El número a acertar es el anterior a: "+ (suma+1) );
			}				
		}
		while(vidas > 0 );	
		entrada.close();
	}

}
