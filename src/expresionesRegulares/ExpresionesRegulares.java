package expresionesRegulares;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class  ExpresionesRegulares {

	public static void main(String[] args) {

	
		String cp = "hola que";
		
		String palabra1 = ".*";
		String palabra2 = ".*";
		
//Pattern patron= Pattern.compile("\\d{5}");
//		Pattern patron = Pattern.compile("[0-9][0-9]:[0-9][0-9]:[0-9][0-9]");
//patron = Pattern.compile("[0-9]{5}");
		Pattern patron = Pattern.compile(palabra1+" "+palabra2);

		Matcher matcher = patron.matcher(cp);

		if (matcher.matches()) {
			System.out.println("Coincide");
		} else {
			System.out.println("No coincide");
		}
		
		//Sustituit en un texto dado dos espacion en blanco por uno solo
		String texto = "Hola  mundo  en  java";
		String textoR = texto.replace(" ", "_");
		System.out.printf(textoR);
		
		
		

	}
}