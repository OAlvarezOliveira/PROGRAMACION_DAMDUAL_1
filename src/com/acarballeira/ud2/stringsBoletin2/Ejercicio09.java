/**
 * 
 */
package com.acarballeira.ud2.stringsBoletin2;

import java.util.Scanner;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

/**
 * Función calcularIMC(): calculará si la persona está en su peso ideal. El IMC
 * se utiliza para clasificar el estado ponderal de la persona, y se calcula a
 * partir de la fórmula: peso(kg) /talla2 (metros)) La función devolverá según
 * la tabla que se presenta a continuación la categoría donde encaja su IMC:
 * ÍNDICE DE MASA CORPORAL CATEGORÍA Por debajo de 18.5 Por debajo del peso
 * Programación JMG Páxina 2 de 3 18.5 a 24.9 Saludable 25.0 a 29.9 Con
 * sobrepeso 30.0 a 39.9 Obeso Más de 40 Obesidad extrema o de alto riesgo
 * Prueba a ejecutar la función:
 */
public class Ejercicio09 {

	public static void main(String[] args) {

		double peso;
		double estatura;

		peso = leerDouble("Introduce el peso");
		estatura = leerDouble("Introduce la estatura");

		System.out.printf("IMC %s", calcularIMC(peso, estatura));

	}

	private static double leerDouble(String texto) {

		Scanner entrada = new Scanner(System.in);

		System.out.printf("%s", texto);
		return entrada.nextDouble();
	}

	private static String calcularIMC(double peso, double estatura) {
		double resultado;
		String estado = "";

		resultado = peso / (estatura * estatura);
//		System.out.printf("IMC %f", resultado);

		if (resultado < 18.5) {
			estado = "Peso bajo";
		} else if (resultado >= 18.5 && resultado < 24.9) {
			estado = "Saludable";
		} else if (resultado >= 25.0 && resultado < 29.9) {
			estado = "Con sobrepeso";
		} else if (resultado >= 30.0 && resultado < 39.9) {
			estado = "Obeso";
		} else if (resultado >= 40) {
			estado = "Obesidad extrema o de alto riesgo";
		}

		return estado;
	}

}
