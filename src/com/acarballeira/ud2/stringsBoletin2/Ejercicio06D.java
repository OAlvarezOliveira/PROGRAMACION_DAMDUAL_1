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

public class Ejercicio06D {
	
	public static void main(String[] args) {
				
		int num;
		
		num = numeroConsonantes2("Julio L");
		System.out.printf("Número de consonantes distintas: %d", num);
						
	}

	private static int numeroConsonantes(String cadena) {
		
		char[] consonantes = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q',
                'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z', 'Ñ'
               };
		int cont;
		
		cont = 0;
		cadena = cadena.toUpperCase();
		
		for (int i = 0; i < consonantes.length; i++) {
            if (cadena.indexOf(consonantes[i]) != -1) {
                cont++;
            }
        }
		
		return cont;
	}
	
	private static int numeroConsonantes2(String cadena) {
		
		boolean[] consonantes = new boolean[27]; // 26 letras + Ñ
		int cont;
		
		cont = 0;
		cadena = cadena.toUpperCase();
		
		for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            int ascii = (int) c;

            //Ñ
            if (ascii == 209) {
                if (!consonantes[26]) {
                    consonantes[26] = true;
                    cont++;
                }
            }
            //Letras A-Z
            else if (ascii >= 65 && ascii <= 90) {
                // Excluir vogais
                if (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                    int indice = c - 'A';
                    if (!consonantes[indice]) {
                        consonantes[indice] = true;
                        cont++;
                    }
                }
            }
        }
		
		return cont;
	}
	
	private static int numeroConsonantes3(String cadena) {
		
		char[] consonantes = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q',
                'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z', 'Ñ'
               };
		int cont;
		boolean encontrado;
		
		cont = 0;
		cadena = cadena.toUpperCase();
		
		for (int i = 0; i < consonantes.length; i++) {
			encontrado = false;
            for (int j = 0; j < cadena.length() & !encontrado; j++) {
                if (consonantes[i] == cadena.charAt(j)) {
                    cont++;
                    encontrado = true;
                }
            }
        }
		
		return cont;
	}
	
	
}






