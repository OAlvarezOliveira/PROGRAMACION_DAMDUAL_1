/**
 * 
 */
package pruebas;

import java.util.Scanner;

/**
 * Resolucion de la tarea 99.1 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

/*
 * Elaborar un programa en Java que solicite un número por teclado y calcule su factorial. 
 * El factorial de un número entero positivo n (se escribe como n!) se calcula multiplicando 
 * todos los números enteros desde 1 hasta n. 
 * P.e: el factorial de 5 = 5 x 4 x 3 x 2 x 1. Tener en cuenta que el factorial de 0 es 1. 
 */

public class factorial {


	public static void main(String[] args) {
		
		//declaracion
		int x;
		int fact;
		
		//inicializacion
		fact= 1;
    	Scanner entrada= new Scanner(System.in); 
    	
    	
		//Operativa
        System.out.print("Introduce el numero a calcular su factorial ");
         x= entrada.nextInt();
    	
		 for (int i = 1 ; i <= x ; i++){
			 
			 System.out.println ("valor de i: "+ i);      
			 System.out.println ("operacion: " + (fact = (x *(x-i)*fact)));
			 System.out.println("valor de factorial: "+fact);
                    }
	
		 entrada.close();
	}

}
