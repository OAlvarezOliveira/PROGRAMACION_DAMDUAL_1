/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema191.java
 */

package aceptaelreto;

import java.util.Scanner;

/**
 * Los problemas de ser rico Tiempo máximo: 8,000 s Memoria máxima: 2048 KiB
 * Aunque no acostumbra a pasearse por las cocinas, tiene sirvientes para eso,
 * una noche de insomnio el magnate Rick Achón sintió algo de hambre y decidió
 * darse una vuelta y buscar algo de comer, con la esperanza de que el paseo le
 * sirviera además para que por fin Morfeo acudiera a su encuentro.
 * 
 * Cuando entró en la despensa le entró cierto desasosiego; había viandas por
 * todos sitios, jamones, chorizos, marisco, legumbres, … pero no había nada que
 * se pudiera considerar vivo.
 * 
 * Por si sufría más noches de insomnio, al día siguiente se propuso poner
 * solución a este problema y no reparó en gastos al comprarse un gigantesco
 * acuario.
 * 
 * Acuario de varios niveles en cascada El acuario tenía varios compartimentos
 * escalonados, cada uno menor que el anterior. Tras su instalación, los
 * sirvientes tuvieron que encargarse de su llenado. Y esto no resultó ser una
 * tarea sencilla porque el magnate quería que sus nuevos peces vivieran en agua
 * mineral, por lo que tuvieron que averiguar la capacidad del acuario para
 * saber cuántos litros de agua comprar.
 * 
 * Entrada La entrada comienza con un número no negativo indicando el número de
 * casos de prueba que vendrán a continuación. Por cada caso de prueba se
 * proporcionará, en una única línea, la descripción del acuario con tres
 * números: el número de compartimentos del acuario (>0), la capacidad en litros
 * del más grande (>0), y la diferencia de litros entre dos compartimentos
 * adyacentes (≥0). Ninguno de los tres números será mayor de 10.000.
 * 
 * Salida Para cada caso de prueba de la entrada, el programa escribirá el
 * número de litros de agua mineral que debieron comprarse para llenar el
 * acuario.
 * 
 * Entrada de ejemplo 3 5 300 10 4 400 20 3 500 30 Salida de ejemplo 1400 1480
 * 1410
 */
public class Problema191 {

	public static void main(String[] args) {

		int casos;
		int compartimentosAcuario;
		int capacidadMax;
		int diferenciaAdyacentes;
		int litrosNecesarios;
		Scanner entrada;

		// Incializar Variables

		litrosNecesarios = 0;
		entrada = new Scanner(System.in);

		// Entrada casos
		casos = entrada.nextInt();

		// Operativa
		for (int i = 0; i < casos; i++) {
			compartimentosAcuario = entrada.nextInt();
			capacidadMax = entrada.nextInt();
			diferenciaAdyacentes = entrada.nextInt();
			// El primer compartimento es el mayor: capacidadMax.
			// Los restantes se calculan restando diferenciaAdyacentes sucesivamente.
			litrosNecesarios = capacidadMax;

			for (int l = compartimentosAcuario - 1; l > 0; l--) {

				litrosNecesarios += capacidadMax - (l * diferenciaAdyacentes);

			}// FIN FOR litrosNecesarios
			
			//Salida de datos 1 X CASO
			System.out.println(litrosNecesarios);

		} // FIN FOR Casos
		entrada.close();

	}

}
