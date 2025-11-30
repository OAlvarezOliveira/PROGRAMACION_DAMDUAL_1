/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema313.java
 */

package aceptaelreto;

import java.util.Scanner;

/**
Fin de mes
Tiempo máximo: 1,000-2,000 s  Memoria máxima: 4096 KiB
Pila de monedas
A mí no me asusta el fin del mundo; me asusta el fin de mes, porque no siempre consigo que mis ingresos lleguen conmigo. Los gastos se acumulan, y no sé qué más hacer para estirar mi triste sueldo.

Creo que el primer paso para mejorar mi situación es hacer una estimación de lo bien o lo mal que me va a ir un mes, en función de los ingresos y los gastos previstos. Sé cuánto dinero tengo en el banco al principio, y sé cuánto va a variar. ¿Me ayudas a saber si llegaré a fin de mes con dinero en el banco?

Entrada
La entrada comienza con un número que indica cuántos casos de prueba vendrán a continuación. Cada caso contiene dos números, −10.000 ≤ s,c ≤ 10.000 indicando, respectivamente, el saldo en mi cuenta bancaria el primer día del mes, y el cambio estimado (ingresos menos gastos) durante el mes.

Salida
Para cada caso de prueba, se escribirá "SI" si llego a fin de mes con saldo mayor o igual que cero, y "NO" en otro caso.

Entrada de ejemplo
4
100 -10
-10 -100
-10 100
100 -1000
Salida de ejemplo
SI
NO
SI
NO
 */
public class Problema313 {


	public static void main(String[] args) {
		
		//Declaro Variables
		int casos;
		int saldoCuenta;
		int balanceMes;
		int resultadoMes;
		Scanner entrada;
		
		
		//Inicializar Variables
		entrada = new Scanner(System.in);

		
		
		//Operativa
		
		//Tarea1 : Adquisicion casos
		casos = entrada.nextInt();
		
		
		//Tarea2 : Adquisicion saldoCuenta y balanceMes por cada caso
		for (int i = 0; i < casos; i++) {
			
			saldoCuenta = entrada.nextInt();
			balanceMes = entrada.nextInt();
		
			//Tarea3 : Calculo Mes
			resultadoMes = saldoCuenta + balanceMes;
		//DEBUG	System.out.println("resultadoMes"+resultadoMes);

			//Salida de datos por caso 
			if(resultadoMes >= 0 ) { System.out.println("SI");}else {System.out.println("NO");}
			
		} //Fin de casos
		
		entrada.close();	

	}

}
