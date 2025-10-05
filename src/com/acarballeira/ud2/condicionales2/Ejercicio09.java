/**
 * Resolución de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio06.java
 */

package com.acarballeira.ud2.condicionales2;
import java.util.Scanner;

/**
Programa que indique 
cuantas cifras tiene un número entero
introducido por teclado. Número en el rango [0-99999]. 
 */
public class Ejercicio09 {

    public static void main(String[] args) {

        // Declaración de variables
        int  a;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero rango [0-99999]: ");
        a = scanner.nextInt();
        scanner.close();
        
        //Operativa y Salida	
        if (a < 10) {
            System.out.println("Tiene 1 cifra");
        } else if (a < 100) {
            System.out.println("Tiene 2 cifras");
        } else if (a < 1000) {
            System.out.println("Tiene 3 cifras");
        } else if (a < 10000) {
            System.out.println("Tiene 4 cifras");
        } else {
            System.out.println("Tiene 5 cifras");
        }

    }
}
