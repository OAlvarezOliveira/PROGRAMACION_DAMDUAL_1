/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema130.java
 */

package aceptaelreto;

import java.util.Scanner;

/*
 Mejor... imposible
Tiempo máximo: 1,000 s  Memoria máxima: 4096 KiB
En la película Mejor... imposible, Jack Nicholson encarna a Melvin Udall un "simpático" personaje que padece un desorden obsesivo que, entre otras cosas, le hace andar por las aceras sin pisar las líneas de unión entre las baldosas.

Perico Almodabar se está planteando hacer una película con un personaje parecido al de Nicholson pero cuyo desorden le hace andar por las aceras siempre en diagonal. Es decir, cuando está situado en una baldosa sólo puede ir a una de las cuatro baldosas de sus diagonales. Como ejemplo, en el siguiente diagrama se ve que para ir del punto A al punto B necesita dos movimientos, mientras que para ir de A a C necesita sólo uno. Se considera un movimiento al desplazamiento completo en linea recta, no al cambio de una baldosa a otra.

Ejemplo de movimiento
La pregunta que nos hacemos es, dadas dos posiciones de la acera (que supondremos cuadrada), ¿cuál es el mínimo número de movimientos que necesita nuestro personaje para llegar de una a la otra?

Entrada
La entrada estará compuesta por distintos casos de prueba, cada uno ocupando dos líneas. La primera contendrá un número (1 ≤ N ≤ 109) que indica el tamaño (en número de baldosas) de cada lado de la acera. La segunda línea contendrá cuatro números, x1, y1, x2, y2, que indican la posición inicial (x1, y1) y la final (x2, y2). Todos esos números estarán en el rango comprendido entre 0 y N-1.

La entrada terminará cuando el tamaño de la acera sea 0, que no provocará salida.

Salida
Para cada caso de prueba se indicará en una línea el número mínimo de movimientos que tiene que hacer el personaje para alcanzar su objetivo. Si es imposible llegar andando en diagonal, se escribirá IMPOSIBLE.

Entrada de ejemplo
5
1 2 4 3
5
1 2 3 0
10
0 0 0 1
0
Salida de ejemplo
2
1
IMPOSIBLE 
 */
public class Problema130 {


	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            long N = sc.nextLong();
            if (N == 0) break;

            long x1 = sc.nextLong();
            long y1 = sc.nextLong();
            long x2 = sc.nextLong();
            long y2 = sc.nextLong();

            // Mismo color? si no, imposible
            if ( ((x1 + y1) & 1) != ((x2 + y2) & 1) ) {
                System.out.println("IMPOSIBLE");
                continue;
            }

            // Mismo punto -> 0 movimientos
            if (x1 == x2 && y1 == y2) {
                System.out.println(0);
                continue;
            }

            // Si están en la misma diagonal -> 1 movimiento
            if ( (x1 + y1) == (x2 + y2) || (x1 - y1) == (x2 - y2) ) {
                System.out.println(1);
            } else {
                // Mismo color pero diferente diagonal -> 2 movimientos
                System.out.println(2);
            }
        }

        sc.close();
    }
}