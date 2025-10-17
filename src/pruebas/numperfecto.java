
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

public class numperfecto {


	public static void main(String[] args) {
		
		//declaracion
		int x;
		int num;
		int suma = 0;
		boolean esPerfecto = true;
		
		//inicializacion
		num = 0;
    	Scanner entrada= new Scanner(System.in); 
    	
    	
		//Operativa
        System.out.print("Introduce el numero para ver si es perfecto ");
        x= entrada.nextInt();
    	
		 for (int i = 1 ; i < x ; i++){
			 
			 if(x%i == 0 ){
				 suma = (i)+ suma; 
			 } 
			 if (suma == x ) { esPerfecto = true;}
			 else {
		     esPerfecto = false;
			 }
    	}
		 if(esPerfecto = true ){
			 System.out.println("Es perfecto");
			 } else {
		     System.out.println("Es imperfecto");}
	
		 entrada.close();
  }
	
}