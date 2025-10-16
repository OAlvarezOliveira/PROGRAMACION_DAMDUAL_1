/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio01.java
 */

package com.acarballeira.ud1.boletinbucles;

import java.util.Scanner;

/*
Números triangulares. Un faraón le pide a su ingeniero Real 
que calcule los materiales necesarios para construir su pirámide.
El ingeniero real propone escribir un algoritmo que le permita 
encontrar el término n-ésimo de la secuencia de números
triangulares. Un número triangular puede entenderse como el
número de elementos usados para formar una pirámide plana, como 
se muestra en la figura: Usando la analogía de la construcción de
una pirámide, se observa que para construir un piso se usa un
bloque, para añadir el piso 2 se usan 2 bloques, para añadir
el piso 3 se usan 3 bloques,etc. Al principio se le pregunta
al Faraón cuantos pisos desea construir. El el ingeniero real
ingresa esa información en el programa, que se almacena en la 
variable llamada CUÁNTOS. Para iniciar los trabajos, se
anuncia la construcción del primer piso y que se han usado 0
bloques. En el procedimiento de construcción de la pirámide,
PISO es una variable tipo contador; USADOS es una variable
tipo acumulador que registra los bloques usados en la construcción
de cada piso. Se construye un nuevo piso, acumulando los bloques
usados hasta que se hayan construido los pisos de la variable 
cuántos. La variable de salida que muestra el valor
resultante es: USADOS  
 */
public class Ejercicio15 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de pisos de la pirámide: ");
        int CUANTOS = sc.nextInt();

        int PISO = 1;
        int USADOS = 0;

        while (PISO <= CUANTOS) {
            USADOS += PISO;  // Se usan tantos bloques como el número del piso
            PISO++;          // Avanza al siguiente piso
        }

        // Salida
        System.out.println("Bloques usados en total: " + USADOS);

        sc.close();
    }

}
