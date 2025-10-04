/**
 * Resolución de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio04.java
 */

package com.acarballeira.ud2.condicionales2;
import java.util.Scanner;

/**
 * Aplicación que calcule el importe a cobrar en taquilla
 * por una serie de entradas infantiles (15.50 €) y adultos (20 €).
 * Si el total es igual o superior a 100 €, se aplica un bono del 5%.
 */
public class Ejercicio04 {

    public static void main(String[] args) {

        // Declaración de variables
        int entradasInfantiles;
        int entradasAdultos;
        double precioInfantil = 15.50;
        double precioAdulto = 20.00;
        double precioTotal;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("🔹 Introduce el número de entradas infantiles: ");
        entradasInfantiles = scanner.nextInt();
        System.out.print("🔹 Introduce el número de entradas de adulto: ");
        entradasAdultos = scanner.nextInt();
        scanner.close();

        // Cálculo del precio total
        precioTotal = (entradasInfantiles * precioInfantil) + (entradasAdultos * precioAdulto);

        // Aplicación de descuento si corresponde
        if (precioTotal >= 100) {
            precioTotal = precioTotal * 0.95;
            System.out.printf("✅ Se ha aplicado un descuento del 5%%. Total a pagar: %.2f €\n", precioTotal);
        } else {
            System.out.printf("ℹ️ Total a pagar (sin descuento): %.2f €\n", precioTotal);
        }
    }
}

