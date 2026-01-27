/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: CalculadoraArgs.java
 */

package pruebas;

/**
 * 
 */
public class CalculadoraArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Validar argumentos
		if (args.length != 3) {
			System.out.println("Uso: programa num1 num2 operacion");
			System.out.println("Operaciones: + - * /");
			return;
		}

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		String operacion = args[2];

		double resultado = 0;

		// Switch para cada operación

		switch (operacion) {
	    case "+":
	        resultado = num1 + num2;
	        break;  // ← CRÍTICO
	    case "-":
	        resultado = num1 - num2;
	        break;
	    case "*":
	        resultado = (double) (num1 * num2);
	        break;
	    case "/":
	        if (num2 != 0) {
	            resultado = (double) num1 / num2;
	        } else {
	            System.out.println("No es posible la división por cero");
	            return;  // Terminar programa
	        }
	        break;
	    default:
	        System.out.println("Operación no válida");
	        return;
	}

		System.out.println("Resultado: " + num1 + " " + operacion + " " + num2 + " = " + resultado);

	}

}
