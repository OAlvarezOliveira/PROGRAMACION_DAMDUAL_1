/**
 * Resolución de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio11.java
 */

package com.acarballeira.ud1.condicionales2;
import java.util.Scanner;

/*
 * Calcula el valor absoluto de un número utilizando el operador ternario.  
 */

public class Ejercicio14 {

	public static void main(String[] args) {

        // Declaración de variables
        double valorAbsoluto;
        double numero;
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Introduce un número (puede tener decimales, usa coma): ");
        numero = scanner.nextDouble(); 
        scanner.close();

        // Operativa
        valorAbsoluto = (numero < 0) ? -numero : numero;

        // Salida
        System.out.println("El valor absoluto es: " + valorAbsoluto);
    }
}