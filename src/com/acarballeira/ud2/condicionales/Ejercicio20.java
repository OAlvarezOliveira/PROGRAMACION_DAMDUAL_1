/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio20.java
 */

package com.acarballeira.ud2.condicionales;
import java.util.Scanner;

/**
El cuadrante en el cual se ubica una línea desde el origen está
determinado por el ángulo que forma con el eje positivo de x:

- Entre 0 y 90 grados: cuadrante I
- Entre 90 y 180 grados: cuadrante II
- Entre 180 y 270 grados: cuadrante III
- Entre 270 y 360 grados: cuadrante IV
 */
public class Ejercicio20 {

    public static void main(String[] args) {

        // Declaración de variables
        double angulo;

        // Inicialización
        angulo = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un ángulo en grados (entre 0 y 360): ");
        angulo = scanner.nextDouble();

        // Operativa y salida de información
        if (angulo > 0 && angulo < 90) {
            System.out.println("El ángulo está en el cuadrante I.");
        } else if (angulo > 90 && angulo < 180) {
            System.out.println("El ángulo está en el cuadrante II.");
        } else if (angulo > 180 && angulo < 270) {
            System.out.println("El ángulo está en el cuadrante III.");
        } else if (angulo > 270 && angulo < 360) {
            System.out.println("El ángulo está en el cuadrante IV.");
        } else {
            System.out.println("Ángulo fuera de rango válido para un cuadrante.");
        }

        scanner.close();
    }
}
