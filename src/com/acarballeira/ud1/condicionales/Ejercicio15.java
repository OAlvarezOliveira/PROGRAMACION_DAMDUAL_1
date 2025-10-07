/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio15.java
 */

package com.acarballeira.ud1.condicionales;
import java.util.Scanner;

/**
Leer la nota de un alumno (numérica) y mostrar un mensaje indicando si la calificación es:
- suspenso (<5)
- aprobado (>=5 y <7)
- bien (>=7 y <9)
- notable (>=9 y <10)
- sobresaliente (=10)
Mostrar un mensaje si la nota es incorrecta.
 */
public class Ejercicio15 {

    public static void main(String[] args) {

        // Declaración de variables
        double nota;

        // Inicialización
        nota = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la nota del alumno (0 a 10): ");
        nota = scanner.nextDouble();

        // Operativa y salida de información
        if (nota >= 0 && nota <= 10) {
            if (nota < 5) {
                System.out.println("Calificación: suspenso");
            } else {
                if (nota < 7) {
                    System.out.println("Calificación: aprobado");
                } else {
                    if (nota < 9) {
                        System.out.println("Calificación: bien");
                    } else {
                        if (nota < 10) {
                            System.out.println("Calificación: notable");
                        } else {
                            System.out.println("Calificación: sobresaliente");
                        }
                    }
                }
            }
        } else {
            System.out.println("Nota incorrecta. Debe estar entre 0 y 10.");
        }

        scanner.close();
    }
}

