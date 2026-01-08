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

public class Regex2 {

	public static void main(String[] args) {

		String texto,textoLimpio;

		//texto = leerTexto();
		texto = "     julito    pepe   ";
		textoLimpio = limpiarTexto(texto);

		System.out.printf(textoLimpio);
		
	}
	
	private static String arreglarTexto(String t) {
		
		//espacios al principio
		t = t.replaceAll("^\\s+","");
		
		//espacios al final
		t = t.replaceAll("^\\s+$","");
		
		//2 o mas espacios entre palabras
		t = t.replaceAll("\\s+"," ");
		return t ;
	}
	
	private static String limpiarTexto(String t) {
		
		//espacios al principio
		t = t.replaceAll("^\\s+","");
		
		//espacios al final
		t = t.replaceAll("^\\s+$","");
		
		//2 o mas espacios entre palabras
		t = t.replaceAll("\\s+"," ");
		return t ;
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
