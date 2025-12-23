package com.acarballeira.ud2.cadena;


/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */


/*
 Invertir cadena. Crea un programa en Java que 
 solicite al usuario la introducción de una 
 cadena de caracteres y devuelva esta cadena 
 invertida.
 * */


public class Ejercicio00 {

	public static void main(String[] args) {

        //Declarar variables
        String cadenaOriginal;
        String cadenaInvertida = "";
        
        
        //Inicializar variables
        cadenaOriginal = "Hola";
        
        System.out.println("Cadena original length: " + cadenaOriginal.length());

            
        for (int i = cadenaOriginal.length()-1; i >= 0; i--) {
        	
        	cadenaInvertida += cadenaOriginal.charAt(i);
        	
		}
        char [] cS = cadenaOriginal.toCharArray();
        
        for (int i = cadenaOriginal.length()-1; i >= 0; i--) {
        	
        	cadenaInvertida += cadenaOriginal.charAt(i);
        	
		}

        
        
        System.out.println("Cadena original: " + cadenaOriginal);
        System.out.println("Cadena invertida: " + cadenaInvertida);
		
	}

}
