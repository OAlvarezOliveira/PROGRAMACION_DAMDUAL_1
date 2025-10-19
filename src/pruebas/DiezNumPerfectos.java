package pruebas;

/**
 * Calcula los primeros 10 números perfectos.
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 */
public class DiezNumPerfectos {

    public static void main(String[] args) {

        int contador = 0;
        int num = 2; // Empezamos desde 2 (1 nunca es perfecto)

        System.out.println("Los primeros 10 números perfectos son:");

        while (contador < 10) {
            int suma = 0; // Reiniciamos la suma en cada iteración

            // Calculamos la suma de los divisores propios
            for (int i = 1; i <= num/2 ; i++) {
                if (num % i == 0) {
                    suma += i;
                }
            }

            // Comprobamos si es perfecto
            if (suma == num) {
                System.out.println(num + " es un número perfecto.");
                contador++;
            }

            num++; // Pasamos al siguiente número
        }

        System.out.println("FIN");
    }
}

