/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01While.java
 */

package com.acarballeira.ud1.bucles;

import java.util.Scanner;

/**
 * Crea un programa que pida al usuario una contraseña, 
 * de forma repetitiva mientras que no introduzca "1234". 
 * Cuando finalmente escriba la contraseña correcta, 
 * se le dirá "Bienvenido" y terminará el programa.

 */

public class Ejercicio02DoWhile {

	public static void main(String[] args) {

    int pwd = 0;
    Scanner entrada; 
	
    entrada = new Scanner(System.in);
    
    do {
    	System.out.println("Introduce contraseña");
    	pwd = entrada.nextInt();

		if(pwd != 1234) {System.out.println("Incorrecto");}
	} while (pwd != 1234);
		
	    System.out.println("Bienvenido");
	    entrada.close();

	}

}
