/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio19.java
 */

package com.acarballeira.ud2.condicionales;
import java.util.Scanner;

/**
Una compañía alquila vehículos con precios según la distancia recorrida:
- Hasta 300 km: $30
- De 301 a 1000 km: $30 + $0.15 por km extra
- Más de 1000 km: $30 + $0.15 (por km de 301 a 1000) + $0.10 (por km sobre 1000)
Todos los precios ya incluyen IGV (18%).

Además, según el año y peso del vehículo, se determina la tarifa de registro.
 */
public class Ejercicio19 {

    public static void main(String[] args) {

        // Declaración de variables
        int distancia, año, categoria = 0;
        double peso, tarifa_registro = 0;
        double monto_total = 0, igv = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Alquiler
        System.out.print("Introduce la distancia recorrida en km: ");
        distancia = scanner.nextInt();

        // Cálculo del monto total por alquiler
        if (distancia <= 300) {
            monto_total = 30;
        } else if (distancia <= 1000) {
            monto_total = 30 + (distancia - 300) * 0.15;
        } else {
            monto_total = 30 + (700 * 0.15) + (distancia - 1000) * 0.10;
        }

        // Cálculo del IGV (ya incluido en el precio)
        igv = monto_total * 18 / 118;

        // Registro del vehículo
        System.out.print("Introduce el año del vehículo: ");
        año = scanner.nextInt();

        System.out.print("Introduce el peso del vehículo (en libras): ");
        peso = scanner.nextDouble();

        // Determinar categoría y tarifa según tabla
        if (año <= 1970) {
            if (peso < 2700) {
                categoria = 1;
                tarifa_registro = 11600;
            } else if (peso <= 3800) {
                categoria = 2;
                tarifa_registro = 23200;
            } else {
                categoria = 3;
                tarifa_registro = 34800;
            }
        } else if (año >= 1971 && año <= 1979) {
            if (peso < 2700) {
                categoria = 4;
                tarifa_registro = 16600;
            } else if (peso <= 3800) {
                categoria = 5;
                tarifa_registro = 26000;
            } else {
                categoria = 6;
                tarifa_registro = 39000;
            }
        } else { // 1980 o posterior
            if (peso < 3500) {
                categoria = 7;
                tarifa_registro = 12000;
            } else {
                categoria = 8;
                tarifa_registro = 46000;
            }
        }

        // Salida de información
        System.out.printf("Monto total por alquiler (con IGV): $%.2f\n", monto_total);
        System.out.printf("Monto del IGV incluido (18%%): $%.2f\n", igv);
        System.out.println("Categoría de peso del vehículo: " + categoria);
        System.out.printf("Tarifa de registro: $%.2f\n", tarifa_registro);

        scanner.close();
    }
}

