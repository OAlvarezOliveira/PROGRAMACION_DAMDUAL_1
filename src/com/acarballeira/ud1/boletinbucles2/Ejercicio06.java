/**
 * Resolucion de la tarea
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio03.java
 */

package com.acarballeira.ud1.boletinbucles2;

import java.util.Scanner;

/**
6. Pedir diez números por teclado y mostrar la media de aquellos que sean mayores
que 50.   
 */
public class Ejercicio06 {

    public static void main(String[] args) {
       
    	int x;
    	int contador;
    	int suma;
    	
    	suma=0;
    	contador = 0;
    	Scanner entrada= new Scanner(System.in);    	

		 for (int i = 0 ; i <= 10 ; i++){
			 
		        System.out.print("Introduce el numero a sumar ");
		        x = entrada.nextInt();
                       if(x > 10) { 
                    	x = suma + x; contador++;                        
                       }
		 }
		 entrada.close();   
     	System.out.print("la media de los numero mayores que 10 introducidos es " +(suma/contador));

    }
}

