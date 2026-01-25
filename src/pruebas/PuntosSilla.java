/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: PuntosSilla.java
 */

package pruebas;
import java.util.Scanner;

/**
 * 
 */
public class PuntosSilla {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    // PRUEBA SIN SCANNER
	    int[][] matriz = {{4, 1, 7}, {3, 2, 5}};
	    
	    imprimeMatriz(matriz);
	    int[] mins = buscaMinimosFilas(matriz, 2, 3);
	    int[] maxs = buscaMaximosColumnas(matriz, 2, 3);
	    buscaPuntosDeSilla(matriz, mins, maxs);

	    
	    //DEBUG
	    
//	    System.out.println("\nMínimos: ");
//	    for (int m : mins) {System.out.print(m + " ");}
//	    
//	    System.out.println("\nMáximos: ");
//	    for (int m : maxs) {System.out.print(m + " ");}
	    
	    
	    
	    
	    
	}

	private static void buscaPuntosDeSilla(int[][] matriz, int[] minimosFilas, int[] maximosColumnas) {
	    boolean encontrado = false;
	    
	    for (int i = 0; i < matriz.length; i++) {
	    	
	        for (int j = 0; j < matriz[0].length; j++) {
	        	
	            if (matriz[i][j] == minimosFilas[i] && matriz[i][j] == maximosColumnas[j]) {
	            	
	            	
	                System.out.printf("un punto de silla de valor %d en las coordenadas %d,%d\n", 
	                    matriz[i][j], i+1, j+1); // salida predeterminada por ejercicio
	                encontrado = true;
	            }
	            
	        }
	        
	    }
	    
	    if (!encontrado) {
	        System.out.println("NO TIENE PUNTO DE SILLA");
	    }
	    
	}
	    
	    


	private static int[] buscaMaximosColumnas(int[][] matriz, int filas, int columnas) {
		int[] vMaximosColumnas = new int[columnas];

		for (int col = 0; col < matriz[0].length; col++) {

			int maximo = Integer.MIN_VALUE;

			for (int fila = 0; fila < matriz.length; fila++) {
				if (matriz[fila][col] > maximo) {

					maximo = matriz[fila][col];

				}
			}
			vMaximosColumnas[col] = maximo;
		}

		return vMaximosColumnas;
	}

	private static int[] buscaMinimosFilas(int[][] matriz, int filas, int columnas) {

		int[] vMinimosFilas = new int[filas];

		for (int fila = 0; fila < matriz.length; fila++) {
			int minimo = Integer.MAX_VALUE;
			for (int col = 0; col < matriz[0].length; col++) {
				if (matriz[fila][col] < minimo) {
					minimo = matriz[fila][col];
				}
			}
			vMinimosFilas[fila] = minimo;
		}

		return vMinimosFilas;
	}

	private static void imprimeMatriz(int[][] matriz) {
		for (int[] fila : matriz) {
			for (int numero : fila) {
				System.out.printf("\t%d", numero);
			}
			System.out.printf("\n");
		}
	}

}
