/**
 * 
 */
package examenund1_2;

import java.util.Scanner;

/**
 * Resolucion de la tarea
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class App_3 {

	public static void main(String[] args) {

		// Declaracion Variables
		final double IRPF19;
		final double IRPF24;
		final double IRPF30;
		final double IRPF37;
		final double IRPF45;
		final double IRPF47;
		
		final int  TRAMO1;
		final int  TRAMO2;
		final int  TRAMO3;
		final int  TRAMO4;
		final int  TRAMO5;


		
		double baseLiquidable;
		double impuestoResultante;
		Scanner entrada;

		// Inicializacion Variables

		IRPF19 = 0.19;
		IRPF24 = 0.24;
		IRPF30 = 0.30;
		IRPF37 = 0.37;
		IRPF45 = 0.45;
		IRPF47 = 0.47;
		
		TRAMO1 = 12450;
		TRAMO2 = 20199;
	    TRAMO3 = 35199;
		TRAMO4 = 59999;
		TRAMO5 = 299999;

		
		entrada = new Scanner(System.in);

		// Entrada de datos
		System.out.printf("Introduce un la base liquidable a calcular: %n");
		baseLiquidable = entrada.nextDouble();

		if (baseLiquidable <= TRAMO1) {
			impuestoResultante = baseLiquidable * IRPF19;
			
		} else if (baseLiquidable <= TRAMO2 ) {
			impuestoResultante = (baseLiquidable * IRPF19) + (baseLiquidable - TRAMO1) * IRPF24;

		} else if (baseLiquidable <= TRAMO3) {
			impuestoResultante = (baseLiquidable * IRPF19) + (baseLiquidable - TRAMO1) * IRPF24;
			
		} else if (baseLiquidable <= TRAMO4) {
			impuestoResultante = (baseLiquidable * IRPF19) + (baseLiquidable - TRAMO1) * IRPF24;

		} else if (baseLiquidable <= TRAMO5) {
			impuestoResultante = (baseLiquidable * IRPF19) + (baseLiquidable - TRAMO1) * IRPF24;

		} else {
			impuestoResultante = baseLiquidable * IRPF47;

		}
		
		System.out.printf("impuestoResultante: %.2f  %n",impuestoResultante);


		entrada.close();
	}

}
