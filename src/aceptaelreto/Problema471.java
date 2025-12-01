/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema471.java
 */

package aceptaelreto;

import java.util.Scanner;

/*
 Buscando el pinchazo
Tiempo máximo: 1,000 s  Memoria máxima: 4096 KiB
Quitando la cubierta de una rueda de bici para arreglar un pinchazo
Hacer rutas en bici está muy bien… hasta que pinchas. No es solo el engorro de tener que cambiar la cámara de la rueda en mitad de cualquier camino, es que luego al llegar a casa toca arreglar el pinchazo.

Eso supone llenar un barreño con agua, hinchar la cámara pinchada y sumergirla en agua, sección a sección, hasta ver aparecer las burbujillas delatoras que te dicen el punto que ha amargado tu paseo.

Y, por si pinchar no es suficiente mala suerte, la búsqueda del pinchazo en la cámara vuelve a poner a prueba tu relación con la diosa Fortuna. El primer punto de la cámara que sumerges en agua con la esperanza de encontrar el pinchazo y el sentido en el que vayas girando la cámara para sumergir los tramos siguientes afectan, y mucho, al tiempo que tardarás en ver las esperadas burbujas. Si todo va bien, encontrarás el pinchazo antes de recorrer la mitad de la cámara. Si la mala suerte te ha acompañado hasta casa, las burbujas aparecerán después de haber sumergido la cámara prácticamente entera.

Entrada
La entrada comienza con un número que indica cuántos casos de prueba habrá que procesar.

Cada caso de prueba son dos números 0 ≤ i, p < 360 indicando el punto inicial de la cámara donde empiezas a buscar el pinchazo (el primero que sumerges) y la posición del pinchazo, respectivamente. Ambos son números enteros indicando el grado en la circunferencia de la cámara.

Salida
Por cada caso de prueba se escribirá "ASCENDENTE" si es mejor realizar la búsqueda del pinchazo girando de manera ascendente en grados desde el punto de partida, y "DESCENDENTE" si es mejor ir en sentido opuesto. Si el pinchazo está en el punto de inicio o en el opuesto de la circunferencia se escribirá "DA IGUAL".

Ten en cuenta que, al ser grados de una circunferencia, la posición 0 es la misma que la 360.

Entrada de ejemplo
3
90 91
0 359
0 180

Salida de ejemplo
ASCENDENTE
DESCENDENTE
DA IGUAL 
 */
public class Problema471 {

	public static void main(String[] args) {

		// Declaracion
		int casos;
		int posInicio;
		int posPinchazo;
		int distAscendente;
		int distDescendente;
		Scanner entrada;

		// Inicializacion
		entrada = new Scanner(System.in);

		// toma de casos a procesar
		casos = entrada.nextInt();

		for (int i = 0; i < casos; i++) {

			posInicio = entrada.nextInt();
			posPinchazo = entrada.nextInt();

			distAscendente = (posPinchazo - posInicio + 360) % 360;
			distDescendente = (posInicio - posPinchazo + 360) % 360;

			if (distAscendente < distDescendente) {
				System.out.println("ASCENDENTE");

			} else if (distAscendente > distDescendente) {
				System.out.println("DESCENDENTE");

			} else {
				System.out.println("DA IGUAL");

			}

		}

		// Fin de programa
		entrada.close();
	}

}
