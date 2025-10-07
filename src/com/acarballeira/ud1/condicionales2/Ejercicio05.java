/**
 * Resolución de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio04.java
 */

package com.acarballeira.ud1.condicionales2;
import java.util.Scanner;

/**
Pedir dos números distintos y mostrar cual es mayor. 
 */
public class Ejercicio05 {

    public static void main(String[] args) {

        // Declaración de variables
        double num1 = 0;
        double num2 = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("🔹 Introduce el primer numero a comparar: ");
        num1 = scanner.nextDouble();
        System.out.print("🔹 Introduce el segundo numero (distinto al primero) a comparar: ");
        num2 = scanner.nextDouble();
        scanner.close();

       if (num1 > num2) {
    	
           System.out.print(num1 + " es mayor que " + num2);

		
	} else {
		
        System.out.print(num2 + " es mayor que " + num1);

	} 
        
    }
}

