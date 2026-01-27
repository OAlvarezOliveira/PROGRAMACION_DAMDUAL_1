/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: SumarArgs.java
 */

package pruebas;

/**
 * 
 */
public class SumaArgs {
    public static void main(String[] args) {
        // Validar que haya al menos un argumento
        if (args.length == 0) {
            System.out.println("Uso: programa num1 num2 ...");
            return;
        }
        
        int suma = 0;
        
        for (int i = 0; i < args.length; i++) {
        	
            int num = Integer.parseInt(args[i].trim());
        	suma += num; 
			
		}
        
        
        System.out.println("Suma: " + suma);
    }
}
