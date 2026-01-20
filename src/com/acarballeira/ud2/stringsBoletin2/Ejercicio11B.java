/**
 * 
 */
package com.acarballeira.ud2.stringsBoletin2;


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
 * @author  O.Alvarez
 *
 */

import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Ejercicio11B {
	
	public static void main(String[] args) {	
		
		String cadena, cadenaCifrada;
		
		cadena = "Julio";
		
		cadenaCifrada = cifrar(cadena);
		System.out.printf("La cadena %n\t\"%s\"%nse cifra como %n\t\"%s\"", cadena, cadenaCifrada);
		
	}

	private static String cifrar(String cadena) {
		
		String alfabetoMay= "BCDFGHJKLMNPQRSTVWXYZ";
        String alfabetoMin= "bcdfghjklmnpqrstvwxyz";
        String vogaisO = "AEIOUaeiou";
        String vogaisD = "3210432104";
        String numO = "0123456789";
        String numD = "=i-¨$%&/()";
        int pos;
        String cifrado;
        
        cifrado = "";
        for (int i = 0; i < cadena.length(); i++) {
            if ((pos = alfabetoMay.indexOf(cadena.charAt(i))) != -1) {
                cifrado += alfabetoMay.charAt((pos + 1)%alfabetoMay.length());
            } else if ((pos = alfabetoMin.indexOf(cadena.charAt(i))) != -1) {
                cifrado += alfabetoMin.charAt((pos + 1)%alfabetoMin.length());
            } else if ((pos = vogaisO.indexOf(cadena.charAt(i))) != -1) {
                cifrado += vogaisD.charAt(pos );
            } else if ((pos = numO.indexOf(cadena.charAt(i))) != -1) {
                cifrado += numD.charAt(pos );
            } else {
                cifrado += cadena.charAt(i); //Non atopa coincidencia
            }      
        } // fin for
        
        return cifrado;
	}

	
	
	
}





