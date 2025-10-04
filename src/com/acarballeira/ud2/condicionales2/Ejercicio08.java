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
 * Pedir los coeficientes de una ecuación de segundo grado
 * y mostrar sus soluciones reales. Si no existen, indicarlo.
 */
public class Ejercicio08 {

    public static void main(String[] args) {

        // Declaración de variables
        double a, b, c;
        double discriminante, x1, x2;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("🔹 Introduce el coeficiente a: ");
        a = scanner.nextDouble();
        System.out.print("🔹 Introduce el coeficiente b: ");
        b = scanner.nextDouble();
        System.out.print("🔹 Introduce el coeficiente c: ");
        c = scanner.nextDouble();
        scanner.close();

        // Comprobación de ecuación válida (a ≠ 0)
        if (a == 0) {
            System.out.println("⚠️ No es una ecuación de segundo grado (a no puede ser 0).");
            return;
        }

        // Cálculo del discriminante
        discriminante = b * b - 4 * a * c;

        // Evaluación de soluciones reales
        if (discriminante > 0) {
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.printf("✅ Soluciones reales: x₁ = %.2f, x₂ = %.2f\n", x1, x2);
        } else if (discriminante == 0) {
            x1 = -b / (2 * a);
            System.out.printf("✅ Solución única real: x = %.2f\n", x1);
        } else {
            System.out.println("❌ No existen soluciones reales (raíces complejas).");
        }
    }
}

