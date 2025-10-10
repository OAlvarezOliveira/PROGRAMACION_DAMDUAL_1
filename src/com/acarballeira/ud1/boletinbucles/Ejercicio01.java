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
 Realizar un algoritmo que permita calcular la suma de los 
 números ingresados mientras que el valor 
 acumulado no supere el valor 100. 
 Mostrar el valor acumulado antes de superar 100 
 */
public class Ejercicio01 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num, suma = 0;

	        do {
	            System.out.print("Ingrese un número: ");
	            num = sc.nextInt();

	            if (suma + num <= 100) {
	                suma += num;
	                System.out.println("Acumulado: " + suma);
	            } else {
	                System.out.println("Se alcanzó o superó el límite. Acumulado final: " + suma);
	            }

	        } while (suma + num <= 100);
	          sc.close();
	    }
	

}
