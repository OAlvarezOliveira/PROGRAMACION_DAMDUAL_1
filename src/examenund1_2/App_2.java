/**
 * 
 */
package examenund1_2;

import java.util.Random;

/**
 * Resolucion de la tarea examenund1_2
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class App_2 {

	public static void main(String[] args) {

		// declaracion de variable
		Random aleatorio;
		int num;
		int mayor ;
		int menor ;
		int acumulaNum;
		int suma;
		aleatorio = new Random();


		// inicializacion de variable
		suma = 0;
		acumulaNum = 0;
		mayor = 0;
		menor = 100;


		// operativa

		while (suma < 5555) {
			num = aleatorio.nextInt(10, 91);

			if(num > mayor) {mayor = num; }  
			if(num < menor) {menor = num; }	
			
//			System.out.printf("num %d %n",num);    // debug
//			System.out.printf("Mayor %d %n",mayor);// debug
//			System.out.printf("Menor %d %n",menor);// debug
			suma += num;

			if (suma < 5555) {
				acumulaNum++;
//				System.out.printf("acumulaNum %d %n",acumulaNum); // debug
//				System.out.printf("suma %d %n",suma); // debug
			}

		} // fin While

		// salida de datos
		
		System.out.printf("Conta de numeros xerados:      %04d %n",acumulaNum);
		System.out.printf("Numero mais baixo xerado:      %04d %n",mayor);
		System.out.printf("Numero mais alto xerado:       %04d %n",menor);


	}

}
