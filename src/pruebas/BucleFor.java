package pruebas;

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
// saca por pantalla todos los numeros del 1-100 divisibles entre 3

public class BucleFor {
	
	public static void main(String[] args) {
		
/*		for (int i = 0 ; i<=100 ; i++) {
		
				System.out.println(i);
				
		}
*/
/*		int contador =0;
		while(contador<=100 );
		System.out.println(contador);
		contador +=3;
*/
//		int contador = 0;
//		while(contador++ <=5) {
//			System.out.println(contador);
			
//		int contador = 0;
//		while(contador++ <=5) {
//			System.out.println(contador);
//		}
		
//		String texto ;
//		Scanner entrada = new Scanner(System.in);
//		boolean introdujoFin = false;
//		texto = entrada.next();

	
		
//		if (texto.equalsIgnoreCase("fin")) {
//			introdujoFin = true;
//			}
		
//		while(!introdujoFin) {
			
//		System.out.println("texto en mayusculas: " + texto.toUpperCase());	
//		System.out.println("Introduce una palabra " );	
//		texto = entrada.next();

//		if (texto.equalsIgnoreCase("fin")) {
//			introdujoFin = true;
//			}
			
//		}
//		entrada.close();		
//	}
	

//		String texto = null;
//		Scanner entrada = new Scanner(System.in);
//	  do {
//
//			System.out.println("Introduce una palabra " );	
//			texto = entrada.next();
//			if (!texto.equalsIgnoreCase("fin")) {
//				System.out.println("texto en mayusculas: " + texto.toUpperCase());	
//				}		  
//		  
//	  }while(!texto.equalsIgnoreCase("fin"));
//	  entrada.close();
//	  
	  

		String texto = "";
		Scanner entrada = new Scanner(System.in);
		texto = entrada.next();	

	 while (!texto.equalsIgnoreCase("fin")) {
			System.out.println("Introduce una palabra ");
			if (!texto.equalsIgnoreCase("fin"))
			System.out.println("texto en mayusculas: " + texto.toUpperCase());			
		}
		
		
		
		entrada.close();
	  
	  
	}  
	  

}
