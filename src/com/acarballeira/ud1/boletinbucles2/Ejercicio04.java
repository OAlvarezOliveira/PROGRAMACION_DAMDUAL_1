/**
 * Resolucion de la tarea
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio03.java
 */

package com.acarballeira.ud1.boletinbucles2;

import java.util.Random;
import java.util.Scanner;

/**
4. Juego de la suma. El programa mostrará 2 
números aleatorios en el rango [1-100], y
el jugador deberá introducir el resultado de 
su suma. Mientras la solución sea
correcta, el programa continuará. 
Al finalizar debe indicarse el número de
operaciones realizadas correctamente  
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        int suma;
        Random aleatorio;
        int adivinaResultado;

        do {
        	aleatorio = new Random();
    		
        	num1 = aleatorio.nextInt(100);
        	num2 = aleatorio.nextInt(100);
        	
        	suma = num1 + num2;
        	
            System.out.println("El primer numero es "+ num1);
            System.out.println("El segundo numero es "+ num2);
            System.out.println("Introduce la suma de los numeros que te he mostrado (Si fallas se acaba el juego): ");
            adivinaResultado = entrada.nextInt();

          

        } while (adivinaResultado == suma);

        System.out.println("Programa finalizado.Te has equivocado en la suma.");
        entrada.close();
    }
}

