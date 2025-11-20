package aceptaelreto;

import java.util.Scanner;

/**
 * Artrópodos Tiempo máximo: 1,000-2,000 s Memoria máxima: 4096 KiB Los grupos
 * de artrópodos En la clase de naturales de Alberto están estudiando los
 * artrópodos. Son animales invertebrados dotados de un esqueleto externo y
 * apéndices articulados. Ha aprendido que se dividen en insectos, arácnidos,
 * crustáceos y miriápodos. Le llama mucho la atención que en esta clase de
 * animales el número de patas sea tan variable: 6 en el caso de los insectos, 8
 * en el de los arácnidos y 10 en el de los crustáceos. Los miriápodos son aun
 * más fascinantes: su cuerpo se divide en segmentos, una cantidad distinta para
 * cada especie; y pueden tener 2 patas por cada segmento
 * (ciempiés/escolopendras) o 4 patas por cada segmento (milpiés).
 * 
 * El fin de semana tenía como tarea reunir la mayor cantidad de artrópodos
 * posible para llevarlos el lunes a clase y enseñarlos a sus compañeros. Así
 * que exploró en el jardín de su urbanización y cazó unos cuantos insectos y
 * arácnidos; fue a la marisquería del mercado y guardó algunos crustáceos en la
 * nevera; y finalmente entró en la tienda de animales de su barrio donde le
 * prometieron que el lunes le llevarían al colegio animales algo peligrosos
 * como escorpiones y escolopendras. Después de tanto buscar, de los miriápodos
 * solo ha conseguido las escolopendras de la tienda, y como no los ha visto
 * aún, no sabe cuántos anillos tienen. El lunes se habían juntado con una buena
 * colección de animales y la profesora, aprovechando las circunstancias les
 * puso un problema de matemáticas: calcular el número de patas de todos los
 * animales que allí había.
 * 
 * Entrada La entrada comienza con un número indicando la cantidad de casos de
 * prueba que deberán procesarse. Cada caso de prueba está compuesto por cinco
 * números. El primero indica el número de insectos (6 patas), el segundo el
 * número de arácnidos (8), el tercero el número de crustáceos (10). El cuarto y
 * el quinto representan, respectivamente, el número de escolopendras y el
 * número de anillos de las mismas (todas tienen el mismo). Recuerda que las
 * escolopendras tienen 2 patas por anillo.
 * 
 * Salida Para cada caso de prueba, el programa escribirá el número de patas. Se
 * garantiza que en ningún caso este número será mayor que 1.000.000.000.
 * 
 * Entrada de ejemplo 2 1 1 1 1 15 2 3 1 4 52 Salida de ejemplo 54 462
 */

public class  Problema293 {

	public static void main(String[] args) {

		// Declarar variables
		int num_casos;
		int resultado;
		int insectos6;
		int aracnidos8;
		int crustaceos10;
		int escolopendras;
		int anillos;
		Scanner teclado;

		// Inicializacion
		teclado = new Scanner(System.in);

		num_casos = teclado.nextInt();

		for (int i = 0; i < num_casos; i++) {

			insectos6 = teclado.nextInt();
			aracnidos8 = teclado.nextInt();
			crustaceos10 = teclado.nextInt();
			escolopendras = teclado.nextInt();
			anillos = teclado.nextInt();
			resultado = insectos6 * 6 + aracnidos8 * 8 + crustaceos10 * 10 + (escolopendras * anillos * 2);
			System.out.println(resultado);
		}
		teclado.close();
	}
}
