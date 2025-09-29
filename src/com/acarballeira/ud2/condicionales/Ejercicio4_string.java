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
Hacer un programa que permita ingresa dos números y el 
símbolo de la operación (+,-,*,/). obteniéndose el correspondiente 
resultado. Si el símbolo no es correcto deberá imprimir un mensaje 
que indique “Error en símbolo”.

 */
public class Ejercicio4_string {

	/**
	 * @param args
	 */
	  public static void main(String[] args) {

	        // Declaración de variables
	        double num1, num2, resultado;
	        String simbolo;
	        

	        // Inicialización
	        num1 = 0;
	        num2 = 0;
	        resultado = 0;
	        simbolo = " ";
	        

	        // Entrada de datos
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce el primer número: ");
	        num1 = scanner.nextDouble();

	        System.out.print("Introduce el segundo número: ");
	        num2 = scanner.nextDouble();

	        System.out.print("Introduce el símbolo de la operación (+, -, *, /): ");
	        simbolo = scanner.nextLine();

	        // Operativa y Salida de información
	        if (simbolo.equalsIgnoreCase("+")) {
	            resultado = num1 + num2;
	            System.out.println("Resultado: " + resultado);
	        } else {
	            if (simbolo.equalsIgnoreCase("-")) {
	                resultado = num1 - num2;
	                System.out.println("Resultado: " + resultado);
	            } else {
	                if (simbolo.equalsIgnoreCase("*")) {
	                    resultado = num1 * num2;
	                    System.out.println("Resultado: " + resultado);
	                } else {
	                    if (simbolo.equalsIgnoreCase("/")) {
	                        if (num2 != 0) {
	                            resultado = num1 / num2;
	                            System.out.println("Resultado: " + resultado);
	                        } else {
	                            System.out.println("Error: división por cero.");
	                        }
	                    } else {
	                        System.out.println("Error en símbolo.");
	                    }
	                }
	            }
	        }

	        scanner.close();
	    }
}
