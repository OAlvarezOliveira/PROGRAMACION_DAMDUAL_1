/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: ValidaEmailsArch.java
 */

package pruebas;

import java.io.InputStream;
import java.util.Scanner;

/**
 * 
 */
public class ValidaEmailsArch {


	public static void main(String[] args) {
		String[] vectorEmail;
		
		
		vectorEmail  = leerEmails();
		
		
		validarEmails(vectorEmail);
	}

	private static void validarEmails(String[] vectorEmail) {
		String patron ="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"; 
		String esCorrecto;
		int contValido= 0;
		
		System.out.printf("=== VALIDACIÓN EMAILS === \n");
		for (int i = 0; i < vectorEmail.length; i++) {
			
			
			if(vectorEmail[i].matches(patron)) {
				 contValido++;
				 esCorrecto = "VÁLIDO";
				 System.out.printf("%s - %s \n",vectorEmail[i],esCorrecto);
			}else {
				esCorrecto = "INVÁLIDO";
				 System.out.printf("%s - %s \n",vectorEmail[i],esCorrecto);	
				
			}
			
			
		}
		
		System.out.printf("Total válidos: %d / %d", contValido, vectorEmail.length);

		
	}

	private static String[] leerEmails() {
	    InputStream ip = ValidaEmailsArch.class.getResourceAsStream("emails.txt");
	    Scanner entrada = new Scanner(ip);
	    String[] emails = new String[100];
	    int i = 0;
	    
	    while(entrada.hasNext()) {
	        emails[i] = entrada.nextLine();
	        i++;
	    }
	    

	    String[] emailsFinal = new String[i];
	    for (int j = 0; j < i; j++) {
	        emailsFinal[j] = emails[j];
	    }
	    entrada.close();
	    return emailsFinal;
	}
	
	
	
	

}
