/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema347.java
 */

package aceptaelreto;

import java.util.Scanner;

/**
 * Haciendo pajaritas de papel Tiempo máximo: 2,000 s Memoria máxima: 4096 KiB
 * Pajaritas de papel de tamaños cada vez menores Las pajaritas de papel son una
 * de las piezas de papiroflexia más conocidas. Partiendo de una porción
 * cuadrada de papel (de igual ancho que alto), y realizando varios dobleces, es
 * posible formar una figura muy reconocible.
 * 
 * Cuando se parte de un trozo de papel que no es cuadrado, lo primero es
 * recortarlo para conseguirlo. Esto ¡alarga la diversión! Es posible seguir
 * troceando la porción sobrante para hacer pajaritas más pequeñas, hasta que la
 * habilidad para manipular trozos minúsculos de papel nos lo permita.
 * 
 * Por ejemplo, si partimos de un DIN-A4, de dimensiones 297×210 milímetros,
 * podremos hacer una pajarita con el cuadrado de 210×210 mm, y nos sobrará un
 * trozo de 87×210. Con él, podremos hacer dos pajaritas con dos cuadrados de
 * 87×87, y nos sobrará un pequeño trozo de 87×36, y así sucesivamente hasta no
 * poder más.
 * 
 * DIN A4 con las marcas para hacer 7 pajaritas Sabiendo que siempre se intentan
 * hacer las pajaritas lo más grandes posible, y que es imposible hacer
 * pajaritas con trozos menores a 10×10 milímetros, ¿cuántas se pueden hacer
 * para un tamaño inicial de papel?
 * 
 * Entrada El programa leerá, de la entrada estándar, múltiples tamaños de
 * papel, cada uno en una línea. El tamaño se especificará con dos números 0 <
 * ancho,alto ≤ 10.000.000. La entrada terminará con una línea con dos 0.
 * 
 * Salida Para cada caso de prueba, el programa escribirá el número de pajaritas
 * que se pueden realizar con el trozo de papel de partida, sabiendo que se
 * prefiere hacer menos pajaritas siempre que sean lo más grandes posible.
 * Además, se considera imposible hacer pajaritas con porciones de papel menores
 * a 10×10.
 * 
 * Entrada de ejemplo 297 210 10 10 9 100 0 0 Salida de ejemplo 7 1 0
 */
public class Problema347 {

	public static void main(String[] args) {

		//declaracion variables

		int ancho;
		int alto;
		int mayor ; 
		int menor; 
		int papelRestante;
		int pajaritas;
		int pajaritas_creadas;
		final int  TAMAÑO_MINIMO =10; 
		Scanner entrada;
		boolean continua  = true; 
		
		//declaracion variables
		entrada = new Scanner(System.in);

		while (continua ) {
			ancho = entrada.nextInt();
			alto = entrada.nextInt();

			if (ancho == 0 && alto == 0) {
				continua  = false; 
			}else {

			// TAREA 2: Asignar mayor y menor
			if(ancho>alto){mayor = ancho ;menor = alto;}else {mayor = alto; menor = ancho;}

			//Reset para siguiente caso
			pajaritas = 0;
			pajaritas_creadas = 0;
			papelRestante = 0;

			while (menor >= TAMAÑO_MINIMO) {
				
				// TAREA 2: Calcular cuántos cuadrados caben
				pajaritas_creadas = mayor / menor;

				// TAREA 3: Sumar a pajaritas
				pajaritas += pajaritas_creadas;

				// TAREA 4: Calcular resto
				papelRestante = mayor % menor;

				// TAREA 5: Actualizar mayor y menor para siguiente iteración
				mayor = menor;
				menor = papelRestante;
						
			} //FIN menor

			System.out.printf("%d%n", pajaritas);
		} 
			
		}	//FIN continua
		entrada.close();

	}
}	