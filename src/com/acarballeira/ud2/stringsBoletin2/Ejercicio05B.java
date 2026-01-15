package com.acarballeira.ud2.stringsBoletin2;

import java.util.Iterator;

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

public class Ejercicio05B {
	
	public static void main(String[] args) {
		
		int cont = 0;
		
//		String texto = "Este es un texto de prueba para verificar "
//				+ "una contabilidad";		
//		
//		char letra = 'e';
//		
//		for (int i = 0; i < texto.length(); i++) {
//			if(texto.toUpperCase().charAt(i) == letra 
//					|| texto.toLowerCase().charAt(i) == letra) {				
//				cont++;
//			}
//		}
		
		
		String texto = "Este es un texto de prueba para verificar "
				+ "una contabilidad";		
		
		//char letra = 'e';
		//String l = "" + letra;
//		String letra = "e";
//		texto = texto.toUpperCase();
//		letra = letra.toUpperCase();
//		
//		for (int i = 0; i < texto.length(); i++) {
//			if(texto.substring(i,i + 1).equals(letra)) {
//				cont++;
//			}
//		}
		
		String texto1 = "Este es un texto de prueba para verificar "
				+ "una contabilidad";		
		
		char letra = 'E';
		String l = "" + letra;
		l = l.toLowerCase();
		letra = l.charAt(0);
		
		letra = ("" + letra).toLowerCase().charAt(0);
		
		
		char[] textoLetras = texto1.toLowerCase().toCharArray();
		for (int i = 0; i < textoLetras.length; i++) {
			if(textoLetras[i] == letra) {
				cont++;
			}
		}

		System.out.printf("La letra \"%s\" aparece %d veces.", letra, cont);		
	}
	
}






