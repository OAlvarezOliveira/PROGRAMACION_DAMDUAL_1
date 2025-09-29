/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Ejercicio10.java
 */

package com.acarballeira.ud2.condicionales;
import java.util.Scanner;

/**
Desarrollar un algoritmo que permita realizar la suma de dos horas distintas 
(HH, MM, SS). Tener en cuenta que si la hora supera 24 se debe contar un día.
*/
public class Ejercicio10_segundos {

    public static void main(String[] args) {

        // Declaración de variables
        int h1, m1, s1;
        int h2, m2, s2;
        int hs, ms, ss;
        int segTotales;

        // Inicialización
        h1 = 12;
        h2 = 13;
        
        m1 = 0;
        m2 = 0;
        		
        s1 = 55;
        s2 = 10;
        
        segTotales = 0;
  

  /*      // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la primera hora:");
        System.out.print("Horas: ");
        h1 = scanner.nextInt();
        System.out.print("Minutos: ");
        m1 = scanner.nextInt();
        System.out.print("Segundos: ");
        s1 = scanner.nextInt();

        System.out.println("Introduce la segunda hora:");
        System.out.print("Horas: ");
        h2 = scanner.nextInt();
        System.out.print("Minutos: ");
        m2 = scanner.nextInt();
        System.out.print("Segundos: ");
        s2 = scanner.nextInt(); */

        // Operativa: suma de segundos
       
        segTotales += s1;
        segTotales += s2;
        segTotales += m1 * 60;
        segTotales += m2 * 60;
        segTotales += h1 * 60 * 60 ;
        segTotales += h2 * 60 * 60 ;

        

        // Salida de información
        System.out.println("Resultado de la suma:" + segTotales);
        System.out.println(segTotales/(24*60*60));



//        scanner.close();
    }
}

