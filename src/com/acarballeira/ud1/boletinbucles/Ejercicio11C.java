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
Un número OMIRP es un número primo que tiene una particularidad
que lo hace diferente. Si se invierten los dígitos del número, 
se forma otro número. Este otro número también es un número primo,
por ello se los llama números OMIRP. 
(PRIMO al revés) Ejemplo Se desea escribir un algoritmo que 
permita determinar si un número n , tiene la característica de 
ser un número OMIRP. 
Utilizando como ejemplo el número 1597:  • 1597 es número primo, 
Se invierten sus dígitos: 7951  
Se comprueba que 7951 es primo,  •
Entonces el número 1597 es un número omirp.   
 */
public class Ejercicio11C{

    public static void main(String[] args) {
        //ZONA DE DECLARACIÓN
        int U, D, C, M;
        int digito;
        int i;
        char unidade;
        int numero, numeroReves;
        Scanner teclado;
        boolean esPrimo, esOmirp;

        //Inicialización
        teclado = new Scanner(System.in);
        U = 0;
        D = 0;
        C = 0;
        M = 0;
        esPrimo = false;
        esOmirp = false;
        
        //ZONA DE CÁLCULO
        //Pido datos
        for(i = 0; i < 4; i++){
            do{
                System.out.println("Introduza a unidade");
                unidade = teclado.nextLine().charAt(0);
            }while (unidade != 'U' && unidade != 'D' && unidade != 'C' && unidade != 'M');
            do{
                System.out.println("Introduza o díxito");
                digito = teclado.nextInt(); teclado.nextLine();
            } while (digito < 0 || digito > 9);
            
            switch (unidade){
                case 'U':   U  = digito;
                            break;
                case 'D':   D  = digito;
                            break;
                case 'C':   C  = digito;
                            break;
                case 'M':   M  = digito;
                            break;
            }
        }
        //Construímos número
        numero = U + D * 10 + C * 100 + M *1000;
        numeroReves = U *1000 + D * 100 + C * 10 + M;
                
        for (i = 2; i < numero/2 && esPrimo; i++){
            if (numero % i == 0){
                esPrimo = false;
            }
        }
        
        
        if (esPrimo){
            for (i = 2; i < numeroReves/2 && esOmirp; i++){
                if (numeroReves % i == 0){
                    esOmirp = false;                    
                }
            }
        }
        System.out.println("Número: " + numero);
        System.out.println("Número al revés: " + numeroReves);
        if (esPrimo && esOmirp) {
            System.out.println("Son primos y Omirp");
        } else if (esPrimo) {
            System.out.println("Es primo pero no Omirp");
        } else {
            System.out.println("Ni es primo ni omirp");
        }
    }

}
