package com.acarballeira.ud2.stringsBoletin2;

import java.util.Scanner;

/**
 * 6. Contar el número de consonantes distintas que se encuentran en una cadena
 * (incluida la Ñ)
 */
public class Ejercicio06 {

    public static void main(String[] args) {

        // VARIABLES
        String frase;
        int contador;
        String consonantes;
        String consonantesEncontradas;  
        char buscaConsonante;

        // INICIALIZACION
        Scanner entrada;
        contador = 0;
        entrada = new Scanner(System.in);
        consonantes = "BCDFGHJKLMNÑPQRSTVWXYZbcdfghjklmnñpqrstvwxyz";
        consonantesEncontradas = "";  

        // Entrada de datos
        frase = "Hola España";

        for (int i = 0; i < frase.length(); i++) {
        	
            buscaConsonante = frase.charAt(i);

            // 1. ¿Es consonante?
            if (consonantes.indexOf(buscaConsonante) != -1) {

                // 2. ¿Ya la tengo guardada?
                if (consonantesEncontradas.indexOf(buscaConsonante) == -1) {
                	
                    // NO la tengo → la añado y cuento
                    consonantesEncontradas += buscaConsonante;
                    contador++;
                }
            }
        }

        // Mostrar resultado
        System.out.printf("Consonantes distintas encontradas: %d%n", contador);
        System.out.printf("Son: %s%n", consonantesEncontradas);

        entrada.close();
    }
}
