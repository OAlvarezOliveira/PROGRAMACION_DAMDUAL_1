package pruebas;

import java.util.Random;

/**
 * 2. Simulación dun xogador lanzando un dado ata cumprir unha condición.
 * 
 * Implementa un programa que:
 * 
 * Lance un dado virtual (número aleatorio entre 1 e 6). Repita o lanzamento ata
 * que se dea unha das seguintes condicións: Aparecen tres 6 seguidos Suma
 * acumulada dos lanzamentos > 100. O programa debe mostrar: Todos os
 * lanzamentos realizados. O número total de lanzamentos. Que condición se
 * cumpriu para parar.
 */
public class Dados {

	public static void main(String[] args) {

		// Declara Variables
		int n;
		int intento;
		int sumaDados;
		int acierto;
		final int TOPE;
		Random aleatorio = new Random();

		// Inicializar variables
		sumaDados = 0;
		acierto = 0;
		intento = 0;
		TOPE = 100;

		while (acierto < 3 && sumaDados < TOPE) {


			n = aleatorio.nextInt(1,7); // genero un random del 1-6
			intento++;
			sumaDados+=n; 

			if (n == 6) {
				System.out.print(n);
				System.out.println(" -- Numero de Intento:" + intento + " Acierto" + "suma acumulada es " +sumaDados ); // Depurar
				acierto++;
			} else {
				System.out.print(n);
				System.out.println(" -- Numero de Intento:" + intento + " Fallo" + "suma acumulada es " +sumaDados); // Depurar
				acierto = 0;
			}
		} // Fin While
		if (sumaDados < TOPE) {
			System.out.println("Fueron necesarios " + intento + " para sacar 3 numeros 6 seguidas");
		} else {
			System.out.println("Intentos Agotados");
			System.out.println("La suma acumulada es " +sumaDados);

		}

	}
}