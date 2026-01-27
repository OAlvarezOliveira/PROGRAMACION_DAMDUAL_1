/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: ValidarProcesarArgs.java
 */

package pruebas;

/**
 * 
 */
public class ValidarProcesarArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        // Validar cantidad de argumentos
        if (args.length != 2) {
            System.out.printf("Uso: programa nombre edad.\n");
            return;
        }
        
        String nombre = args[0];
        int edad = Integer.parseInt(args[1]);
        
        // Validar que edad sea positiva
        if (edad <= 0) {
            System.out.printf("La edad debe ser positiva.\n");
            return;
        }
        
        // Tu código aquí
        System.out.printf("Hola %s, tienes %d años.\n",nombre,edad);
        // Calcular edad en 10 años
        
        System.out.printf("En 10 años tendrás %d años.\n",(edad+10));
    }
}
