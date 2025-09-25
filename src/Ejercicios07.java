/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */
/*

Suma y resta usando métodos de la clase Math.
Multiplica y divide usando bitshifts (<< y >>).
Comprueba si es par usando operaciones bit a bit.

*/

import java.util.Scanner;
public class Ejercicios07 {
	
	public static void main(String[] args) {

        // ----------------------------
        // 1. Declarar variables
        // ----------------------------
        int n;             // número introducido
        int mas20;         // n + 20
        int menos54;       // n - 54
        boolean esPar;     // comprobación de paridad
        int por8;          // n * 8
        int entre4;        // n / 4

        Scanner teclado = new Scanner(System.in);

        // ----------------------------
        // 2. Toma de datos / iniciar variables
        // ----------------------------
        System.out.print("Introduce un número entero: ");
        n = teclado.nextInt();
    	teclado.close();

        // ----------------------------
        // 3. Operativa
        // ----------------------------
        mas20   = Math.addExact(n, 20);       // n + 20
        menos54 = Math.subtractExact(n, 54);  // n - 54
        esPar   = (n & 1) == 0;               // paridad
        por8    = n << 3;                     // multiplicar por 8 (desplazamiento 3 bits a la izquierda)
        entre4  = n >> 2;                     // dividir entre 4 (desplazamiento 2 bits a la derecha)

        // ----------------------------
        // 4. Salida
        // ----------------------------
        System.out.println("n + 20 = " + mas20);
        System.out.println("n - 54 = " + menos54);
        System.out.println("¿n es par? " + esPar);
        System.out.println("n * 8 = " + por8);
        System.out.println("n / 4 = " + entre4);

    }
        

}