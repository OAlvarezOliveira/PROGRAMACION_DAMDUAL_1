package expresionesRegulares;

import java.util.Scanner;

/**
 * Resolución de la tarea XX
 * 
 * Curso 2025-26
 * 
 * @author Julio Mosquera
 * @version 1.0
 */

public class Regex1 {

	public static void main(String[] args) {

		String texto;

		texto = leerTexto();

		if (validarVacia(texto)) {
			System.out.printf("Es cadena vacía\n");
		} else {
			System.out.printf("NO es cadena vacía\n");
		}

		if (oitoDoceLetras(texto)) {
			System.out.printf("Tiene de 8 a 12 letras\n");
		} else {
			System.out.printf("NO tiene de 8 a 12 letras\n");
		}
		if (unaPalabra(texto)) {
			System.out.printf("Es una unica palabra\n");
		} else {
			System.out.printf("No es una UNICA palabra\n");
		}
		if (dosPalabras(texto)) {
			System.out.printf("Son dos palabras\n");
		} else {
			System.out.printf("No son dos palabras\n");
		}
		if (cincoPalabras(texto)) {
			System.out.printf("Son cinco palabras\n");
		} else {
			System.out.printf("No son cinco palabras\n");
		}
		
		if (numPos2Dec(texto)) {
			System.out.printf("Es positivo con 2 decimales\n");
		} else {
			System.out.printf("No es positivo con 2 decimales\n");
		}
		
		if (numPos2DecOpc(texto)) {
			System.out.printf("Es positivo con 2 decimales opcionales\n");
		} else {
			System.out.printf("No es positivo con 2 decimales opcionales\n");
		}
		
		if (numPos2DecOpcSignoOpc(texto)) {
			System.out.printf("Es un numero  con signo y  2 decimales opcionales\n");
		} else {
			System.out.printf("No es un numero  con signo y  2 decimales opcionales\n");
		}
		
		if (esTlfo(texto)) {
			System.out.printf("Es un Tlfo español o portugues \n");
		} else {
			System.out.printf("No es un Tlfo español o portugues\n");
		}
		
		if (esFecha(texto)) {
			System.out.printf("Es una fecha tipo dd-mm-aaaa \n");
		} else {
			System.out.printf("No es una fecha tipo dd-mm-aaaa\n");
		}
		
		if (esVocal(texto)) {
			System.out.printf("Es una cadena de vocales sin acentos \n");
		} else {
			System.out.printf("No es una cadena de vocales sin acentos \n");
		}
		if (esIBAN(texto)) {
			System.out.printf("Es un IBAN \n");
		} else {
			System.out.printf("No es un IBAN \n");
		}
		if (esCpGallego(texto)) {
			System.out.printf("Es un CP GALLEGO \n");
		} else {
			System.out.printf("No es un CP GALLEGO \n");
		}
	}
	
	
	
	private static boolean esCpGallego(String texto) {

		return texto.matches("^(32|36|27|15)d{3}$");
		
	}
	
	
	private static boolean esIBAN(String texto) {

		return texto.matches("^ES\\d{2}(\\-\\d{4}){5}$");
		
	}
	
	private static boolean esVocal(String texto) {

		return texto.matches("^[aeiouAEIOU]{2,}+$");
		
	}
	
	private static boolean esFecha(String texto) {

		return texto.matches("^\\d{2}-\\d{2}-\\d{4}$");
		
	}
	
	private static boolean  esTlfo(String texto) {

		return texto.matches("^(\\+(34|351))?[0-9]{1,10}$");
	}
	
	private static boolean numPos2DecOpcSignoOpc(String texto) {

		return texto.matches("^[\\+|\\-]\\d+(\\,\\d{2})?$");

	}
	
	private static boolean numPos2DecOpc(String texto) {

		return texto.matches("^\\d+(\\,\\d{2})?$");

	}
	
	private static boolean numPos2Dec(String texto) {

		return texto.matches("^\\d+\\,\\d{2}$");

	}
	
	private static boolean cincoPalabras(String texto) {

		return texto.matches("^([0-9a-zA-Z]+\\s){4}[0-9a-zA-Z]+$");

	}

	private static boolean dosPalabras(String texto) {

		return texto.matches("^[0-9a-zA-Z]+\\s[0-9a-zA-Z]+$");

	}
	private static boolean unaPalabra(String texto) {

		return texto.matches("^[0-9a-zA-Z]+$");

	}

	private static boolean oitoDoceLetras(String texto) {

		return texto.matches("\\w{8,12}");

	}

	private static boolean validarVacia(String texto) {

		return texto.matches("^$");
	}

	private static String leerTexto() {
		String texto;
		Scanner leer;

		leer = new Scanner(System.in);
		System.out.printf("Dame un texto: ");
		texto = leer.nextLine();
		leer.close();
		return texto;

	}

}
