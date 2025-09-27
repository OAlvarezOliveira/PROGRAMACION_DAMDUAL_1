/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio11.java
 */

package com.acarballeira.ud2.condicionales;
import java.util.Scanner;

/**
Leer los lados de un rectángulo y el radio de un círculo. 
Determinar si las áreas de ambas figuras son o no iguales.
*/
public class Ejercicio11 {

    public static void main(String[] args) {

        // Declaración de variables
        double lado1, lado2, radio;
        double area_rectangulo, area_circulo;

        // Inicialización
        lado1 = 0;
        lado2 = 0;
        radio = 0;
        area_rectangulo = 0;
        area_circulo = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer lado del rectángulo: ");
        lado1 = scanner.nextDouble();

        System.out.print("Introduce el segundo lado del rectángulo: ");
        lado2 = scanner.nextDouble();

        System.out.print("Introduce el radio del círculo: ");
        radio = scanner.nextDouble();

        // Operativa
        area_rectangulo = lado1 * lado2;
        area_circulo = 3.1416 * radio * radio;

        // Comparación y salida de información
        if (area_rectangulo == area_circulo) {
            System.out.println("Las áreas son iguales.");
        } else {
            System.out.println("Las áreas son diferentes.");
        }

        scanner.close();
    }
}

