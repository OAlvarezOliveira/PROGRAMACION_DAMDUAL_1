package com.acarballeira.ud1.printf_String_format;


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
 24. Formateo salida con printf o String.format
Implementa un programa en Java que pida por teclado datos de tres produtos dun supermercado e mostre unha táboa perfectamente aliñada, usando exclusivamente System.out.printf para imprimir.

O programa debe:

Para cada produto pedir:
Nome (String)
Cantidade vendida (int)
Prezo por unidade (double)
Ao final imprimir unha táboa coma esta (pensando en produtos distintos):
--------------------------------------------------------------
| Produto              | Cant. | Prezo/u (€) |   Total (€)   |
--------------------------------------------------------------
| Mazás Golden         |     5 |       1.25  |        6.25   |
| Pan Barra            |    12 |       0.75  |        9.00   |
| Leite Entera         |     3 |       0.95  |        2.85   |
--------------------------------------------------------------
TOTAL XERAL:                        18.10 €
Requisitos de formato (obrigatorios):
Columna Produto: aliñada á esquerda en 20 caracteres.

Columna Cant.: aliñada á dereita en 6 caracteres.

Columna Prezo/u: 2 decimais, aliñado á dereita en 12 caracteres.

Columna Total: 2 decimais, aliñado á dereita en 14 caracteres.

Todas as liñas deben imprimirse usando printf, non con concatenación.


 * */




public class Boletin24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String p1Nombre,p2Nombre,p3Nombre;
		int p1Cant, p2Cant ,p3Cant; 
		double prezo1 ,prezo2,prezo3;
		double total1 ,total2,total3;
		double total;
		
		p1Nombre = "Mazás Golden";
		p2Nombre = "Pan Barra"; 
		p3Nombre = "Leite Entera";
		
		p1Cant = 5;
		p2Cant = 12;
		p3Cant = 3;
		
		prezo1 = 1.25;
		prezo2 = 0.75;
		prezo3 = 0.95;
		
		total1 = prezo1 * p1Cant ;
		total2 = prezo2 * p2Cant ;
		total3 = prezo3 * p3Cant ; 
		
		total = total1 + total2 + total3 ;

        String linea = "-----------------------------------------------------------------";

        // Cabecera de la tabla
        System.out.println(linea);
        System.out.printf("| %-20s | %6s | %-12s | %-14s |\n", "Produto", "Cant.", "Prezo/u (€)", "Total (€)");
        System.out.println(linea);

        // Filas de datos
        System.out.printf("| %-20s | %6d | %12.2f | %14.2f |\n", p1Nombre, p1Cant, prezo1, total1);
        System.out.printf("| %-20s | %6d | %12.2f | %14.2f |\n", p2Nombre, p2Cant, prezo2, total2);
        System.out.printf("| %-20s | %6d | %12.2f | %14.2f |\n", p3Nombre, p3Cant, prezo3, total3);

        // Total
        System.out.println(linea);
        System.out.printf("TOTAL XERAL: %31.2f €\n", total);
       // System.out.printf("%s\n","10%");

	}

}
