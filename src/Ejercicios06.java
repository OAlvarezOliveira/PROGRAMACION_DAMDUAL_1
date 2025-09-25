/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

import java.util.Scanner;

/*
 * 
numero & 1 comprueba el último bit:
Si da 0 → el número es par.
Si da 1 → el número es impar.

*/
public class Ejercicios06 {
        
    	public static void main(String[] args) {
            
            // ----------------------------
            // 1. Declarar variables
            // ----------------------------
            int numero;         // número introducido por el usuario
            boolean esPar;      // resultado de la comprobación
            
            Scanner teclado = new Scanner(System.in);

            // ----------------------------
            // 2. Toma de datos / iniciar variables
            // ----------------------------
            System.out.print("Introduce un número entero: ");
            numero = teclado.nextInt();
        	teclado.close();
            // ----------------------------
            // 3. Operativa
            // ----------------------------
            esPar = (numero & 1) == 0;  // comprobación usando AND bit a bit

            // ----------------------------
            // 4. Salida
            // ----------------------------
            System.out.println("¿Es par? " + esPar);
            System.out.print("Fin de Programa");



        }
  	
}