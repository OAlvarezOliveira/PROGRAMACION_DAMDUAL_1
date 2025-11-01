/**
 * 
 */
package com.acarballeira.ud1.aleatorios;

import java.util.Random;


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
 * Ejercicio 3 — Generala (Simulación 10000 partidas)
 * 
 * Enunciado:
 * 
 * Simula 10000 partidas del juego de la Generala (5 dados).
 * En cada partida se lanzan 5 dados y se detecta si el resultado es:
 * 
 * - RePoker (5 iguales)
 * - Póker (4 iguales)
 * - Full (3 + 2)
 * - Escalera (1–2–3–4–5 o 2–3–4–5–6)
 * - Nada (cualquier otro caso)
 * 
 * Al final, muestra cuántas veces salió cada resultado.
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        Random aleatorio = new Random();

        int totalRePoker = 0;
        int totalPoker = 0;
        int totalFull = 0;
        int totalEscalera = 0;
        int totalNada = 0;

        for (int partida = 1; partida <= 10000; partida++) {

            // Reiniciar contadores de cada dado en cada partida
            int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0;

            // Tirar 5 dados
            for (int i = 0; i < 5; i++) {
                int dado = aleatorio.nextInt(1, 7);
                switch (dado) {
                    case 1: c1++; break;
                    case 2: c2++; break;
                    case 3: c3++; break;
                    case 4: c4++; break;
                    case 5: c5++; break;
                    case 6: c6++; break;
                }
            }

            // Detección de Full 
            boolean hayTres = (c1 == 3 || c2 == 3 || c3 == 3 || c4 == 3 || c5 == 3 || c6 == 3);
            boolean hayDos = (c1 == 2 || c2 == 2 || c3 == 2 || c4 == 2 || c5 == 2 || c6 == 2);

            // Detectar combinaciones
            if (c1 == 5 || c2 == 5 || c3 == 5 || c4 == 5 || c5 == 5 || c6 == 5) {
                totalRePoker++;
            } else if (c1 == 4 || c2 == 4 || c3 == 4 || c4 == 4 || c5 == 4 || c6 == 4) {
                totalPoker++;
            } else if (hayTres && hayDos) {
                totalFull++;
            } else if ((c1 == 1 && c2 == 1 && c3 == 1 && c4 == 1 && c5 == 1)
                    || (c2 == 1 && c3 == 1 && c4 == 1 && c5 == 1 && c6 == 1)) {
                totalEscalera++;
            } else {
                totalNada++;
            }
        }

        // Mostrar resultados
        System.out.println("Tras 10000 partidas de 5 dados:");
        System.out.println("RePoker (5 iguales): " + totalRePoker);
        System.out.println("Póker (4 iguales): " + totalPoker);
        System.out.println("Full (3 + 2): " + totalFull);
        System.out.println("Escalera (1–5 o 2–6): " + totalEscalera);
        System.out.println("Nada: " + totalNada);
    }
}
