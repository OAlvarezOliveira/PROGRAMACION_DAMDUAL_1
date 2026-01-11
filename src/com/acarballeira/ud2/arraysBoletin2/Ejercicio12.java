/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio12.java
 */

package com.acarballeira.ud2.arraysBoletin2;

/**
 * Crear de forma estática un array que almacene 2 artigos deportivos dunha
 * tenda virtual: (sneakers, sudaderas, …). Debemos almacenar o nome do produto,
 * categoría e prezo, e tamén un número indeterminado de colores e tallas. Todos
 * os valores a almacenar serán Strings.
 */
public class Ejercicio12 {

	public static void main(String[] args) {

		// Datos básicos (nombre, categoría, precio)
		String[][] datosBasicos = { { "Nike Air Max", "Sneakers", "129.99" },
				{ "Adidas Hoodie", "Sudadera", "59.99" } };

		// Colores por producto
		String[][] colores = { { "Blanco", "Negro", "Rojo" }, // Colores del producto 0
				{ "Gris", "Azul Marino", "Negro", "Rojo" } // Colores del producto 1
		};

		// Tallas por producto
		String[][] tallas = { { "39", "40", "41", "42", "43", "44" }, // Tallas del producto 0
				{ "S", "M", "L", "XL" } // Tallas del producto 1
		};

		mostrarArticulos(datosBasicos, colores, tallas);

	}

	private static void mostrarArticulos(String[][] datosBasicos, String[][] colores, String[][] tallas) {

		for (int i = 0; i < datosBasicos.length; i++) {
			System.out.printf("=== Artículo %d === \n", i + 1);
			System.out.printf("Producto: %s \n", datosBasicos[i][0]);
			System.out.printf("Categoría: %s \n", datosBasicos[i][1]);
			System.out.printf("Precio: %s € \n", datosBasicos[i][2]);

// Mostrar colores
			System.out.printf("Colores disponibles: ");
			for (int j = 0; j < colores[i].length; j++) {
				System.out.printf("%s", colores[i][j]);
				if (j < colores[i].length - 1) {
					System.out.printf("/");
				}
			}
			System.out.printf("\n");

// Mostrar tallas
			System.out.printf("Tallas disponibles: ");
			for (int j = 0; j < tallas[i].length; j++) {
				System.out.printf("%s", tallas[i][j]);
				if (j < tallas[i].length - 1) {
					System.out.printf("/");
				}
			}
			System.out.printf("\n\n");
		}
	}

}
