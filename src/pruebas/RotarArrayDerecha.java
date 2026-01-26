/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: RotarArrayDerecha.java
 */

package pruebas;

/**
 ** Enunciado:** Dado un array de enteros, rotarlo N posiciones a la derecha.
 */
public class RotarArrayDerecha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5 };
		int posiciones = 2;


		int[] arrayRotado = rotarDerecha(array, posiciones);

		System.err.printf("----ArrayOriginal---- \n");
		for (int i : array) {

			System.err.printf("\t%d", i);
		}

		System.err.printf("----ArrayRotado---- \n");
		for (int i : arrayRotado) {

			System.err.printf("\t%d", i);
		}

	}

	private static int[] rotarDerecha(int[] array, int posiciones) {
		int[] arrayRotado = new int[array.length];

		for (int i = 0; i < array.length; i++) {

			arrayRotado[i] = array[(i - posiciones + array.length) % array.length];
		}

		return arrayRotado;
	}

}
