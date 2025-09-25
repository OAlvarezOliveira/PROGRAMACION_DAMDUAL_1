
import java.util.Scanner;

/*
Si a == 0 → no es cuadratica.
Si el discriminante > 0 → La raíz cuadrada existe y es positiva
Si el discriminante == 0 → una sola solución real (raíz doble).
Si el discriminante < 0 → las soluciones son complejas.

*/
public class Ejercicios05 {
	
    public static void main(String[] args) {
        
        // ----------------------------
        // 1. Declarar variables
        // ----------------------------
        double a, b, c;        // coeficientes de la ecuación
        double discriminante;  // valor de b^2 - 4ac
        double x1, x2;         // soluciones (reales o complejas)
        
        Scanner teclado = new Scanner(System.in);

        // ----------------------------
        // 2. Toma de datos / iniciar variables
        // ----------------------------
        System.out.println("Resolver ecuación de segundo grado: ax^2 + bx + c = 0");

        System.out.print("Introduce a: ");
        a = teclado.nextDouble();

        System.out.print("Introduce b: ");
        b = teclado.nextDouble();

        System.out.print("Introduce c: ");
        c = teclado.nextDouble();

        // ----------------------------
        // 3. Operativa
        // ----------------------------
        if (a == 0) {
            System.out.println("No es una ecuación de segundo grado (a no puede ser 0).");
        } else {
            discriminante = b * b - 4 * a * c;

            if (discriminante > 0) {
                x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Dos soluciones reales diferentes.");
                System.out.println("x1 = " + x1 + " , x2 = " + x2);
            } else if (discriminante == 0) {
                x1 = -b / (2 * a);
                System.out.println("Una única solución real (raíz doble).");
                System.out.println("x = " + x1);
            } else {
                double parteReal = -b / (2 * a);
                double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
                System.out.println("Soluciones complejas:");
                System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
                System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
            }
        }
        
    }
}