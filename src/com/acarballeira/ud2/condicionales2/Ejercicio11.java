/**
 * Resolución de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio11.java
 */

package com.acarballeira.ud2.condicionales2;
import java.util.Scanner;

/**
 * Pedir un número en el rango [0-9999] e indicar si es o no capicúa.  
 */
public class Ejercicio11 {

    public static void main(String[] args) {

        // Declaración de variables
        String numero;
        boolean esCapicua;
        int longitud;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número a comprobar (0-9999): ");
        numero = scanner.nextLine();
        
        // Inicialización
        longitud = numero.length();
        esCapicua = true;
        
        
        // Comparación manual de los extremos
               
        for (int i = 0; i < longitud / 2; i++) {
            if (numero.charAt(i) != numero.charAt(longitud - 1 - i)) {
                esCapicua = false;
                break;
            }
        }

        // Resultado
        if (esCapicua) {
            System.out.println("El número " + numero + " es capicúa.");
        } else {
            System.out.println("El número " + numero + " no es capicúa.");
        }

        scanner.close();
    }
}
