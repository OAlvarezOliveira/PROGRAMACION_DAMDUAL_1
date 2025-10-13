/**
 * Resolución de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio02While.java
 */

package com.acarballeira.ud1.bucles;

import java.util.Scanner;

/**
 * Crea un programa que pida al usuario una contraseña 
 * de forma repetitiva mientras que no introduzca "1234". 
 * Cuando finalmente escriba la contraseña correcta, 
 * se le dirá "Bienvenido" y terminará el programa.
 */

public class Ejercicio02While {

    public static void main(String[] args) {

        int pwd = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce contraseña");
        pwd = entrada.nextInt();

        while (pwd != 1234) {
            System.out.println("Incorrecto");
            System.out.println("Introduce contraseña");
            pwd = entrada.nextInt();
        }

        System.out.println("Bienvenido");
        entrada.close();
    }
}

