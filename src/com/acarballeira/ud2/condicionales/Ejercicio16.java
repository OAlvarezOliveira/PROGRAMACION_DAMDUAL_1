/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio16.java
 */

package com.acarballeira.ud2.condicionales;
import java.util.Scanner;

/**
El promedio de prácticas de un curso se calcula en base a cuatro notas 
de las cuales se elimina la nota menor y se promedian las tres notas más altas.
Diseñe un algoritmo que determine la nota eliminada y el promedio de un estudiante.
 */
public class Ejercicio16 {

    public static void main(String[] args) {

        // Declaración de variables
        double n1, n2, n3, n4;
        double menor, promedio;

        // Inicialización
        n1 = n2 = n3 = n4 = 0;
        menor = promedio = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera nota: ");
        n1 = scanner.nextDouble();

        System.out.print("Introduce la segunda nota: ");
        n2 = scanner.nextDouble();

        System.out.print("Introduce la tercera nota: ");
        n3 = scanner.nextDouble();

        System.out.print("Introduce la cuarta nota: ");
        n4 = scanner.nextDouble();

        // Operativa para encontrar la menor
        menor = n1;
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }
        if (n4 < menor) {
            menor = n4;
        }

        // Calcular promedio eliminando la menor
        promedio = (n1 + n2 + n3 + n4 - menor) / 3;

        // Salida de información
        System.out.println("Nota eliminada: " + menor);
        System.out.printf("Promedio de las tres notas más altas: %.2f\n", promedio);

        scanner.close();
    }
}
