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

public class Prueba {

	public static void main(String[] args) {
		
		// Break
		
//		for(int i = 0 ; i < 100; i++) {
//			
//			if(i>50) {break;}
//			System.out.println(i);
//		}
		
		// Continue
		
        for(int i = 0 ; i <= 10; i++) {
			
			if(i %2 ==1){continue; }
			System.out.println("numero par:"+i);
		}

	}

}
