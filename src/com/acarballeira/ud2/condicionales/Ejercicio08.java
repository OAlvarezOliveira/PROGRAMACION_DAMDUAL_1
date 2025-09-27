/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01.java
 */

package com.acarballeira.ud2.condicionales;
import java.util.Scanner;


/**
Se ingresa por teclado un número positivo de uno o dos dígitos (1..99). 
Mostrar un mensaje indicando cuantos dígitos tiene el número ingresado.

 */
public class Ejercicio08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        // Declaración de variables
        int numero;

        // Inicialización
        numero = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entre 1 y 99: ");
        numero = scanner.nextInt();

        // Operativa y salida de información
        if (numero >= 1) {
            if (numero <= 9) {
                System.out.println("El número tiene 1 dígito.");
            } else {
                if (numero <= 99) {
                    System.out.println("El número tiene 2 dígitos.");
                } else {
                    System.out.println("Número fuera del rango permitido.");
                }
            }
        } else {
            System.out.println("Número fuera del rango permitido.");
        }

        scanner.close();
    }
}
