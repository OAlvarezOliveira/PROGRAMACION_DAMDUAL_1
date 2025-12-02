/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema108.java
 */

package aceptaelreto;

import java.util.Scanner;

/**
 * De nuevo en el bar de Javier Tiempo máximo: 2,000 s Memoria máxima: 4096 KiB
 * Tras las medidas tomadas, Javier ha visto que las ventas de su bar han
 * mejorado bastante, así que ha decidido seguir adelante con su estudio. Ahora
 * le gustaría investigar con qué productos gana más dinero y con cuáles gana
 * menos. Además, también le gustaría saber si las ventas en comidas superan la
 * media. Para ello ha establecido varias categorías:
 * 
 * Código Categoría D Desayunos A Comidas M Meriendas I Cenas C Copas Javier
 * encuadra cada venta que realiza dentro de una de esas categorías. Cuando
 * tiene un momento, pasa los datos de todas las ventas al ordenador, y le
 * gustaría que le devolviese los siguientes valores: la categoría que más
 * dinero ha recaudado, la que menos, y si el dinero conseguido con las comidas
 * supera la media. No es demasiado constante registrando datos, pero nunca deja
 * un día a medias de introducir.
 * 
 * Realiza un programa que ayude a Javier en su cometido.
 * 
 * Entrada El programa recibirá una lista de ventas realizadas. Cada una
 * constará de una categoría (D, A, M, I o C) y un valor (real). Cuando el día
 * termina, Javier introduce una categoría inexistente (N) con valor cero (es
 * decir, N 0).
 * 
 * Salida Para cada día, el programa generará una línea que contendrá tres
 * valores separados por la almohadilla ("#"). Los dos primeros indicarán el
 * nombre de las categorías que han supuesto más y menos beneficios
 * respectivamente (ten en cuenta que si de una categoría no se ha vendido nada,
 * su beneficio es cero); las categorías se indicarán con sus nombres,
 * DESAYUNOS, COMIDAS, MERIENDAS, CENAS o COPAS. El tercer valor de la línea
 * indicará "SI" si la media gastada por los clientes en las comidas superó a la
 * media de ventas del día, y "NO" en caso contrario.
 * 
 * En caso de que existan varias categorías que hayan conseguido el máximo o
 * mínimo de ventas, se especificará "EMPATE".
 * 
 * Entrada de ejemplo D 2.80 C 48.00 A 8.00 N 0 D 15.33 A 60.00 M 12.00 I 25.00
 * N 0 Salida de ejemplo COPAS#EMPATE#NO COMIDAS#COPAS#SI
 */
public class Problema108 {

	 public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	        while (true) {

	            // Inicializar acumuladores por día
	            double importeD = 0, importeA = 0, importeM = 0, importeI = 0, importeC = 0;
	            int acumD = 0, acumA = 0, acumM = 0, acumI = 0, acumC = 0;

	            // Leer primera venta del día
	            char categoria = entrada.next().charAt(0);
	            double importe = entrada.nextDouble();

	            // Si empieza el día con N 0 -> fin del todo
	            if (categoria == 'N' && importe == 0) {
	                break;
	            }

	            // Leer todas las ventas del día
	            while (!(categoria == 'N' && importe == 0)) {

	                switch (categoria) {
	                    case 'D': importeD += importe; acumD++; break;
	                    case 'A': importeA += importe; acumA++; break;
	                    case 'M': importeM += importe; acumM++; break;
	                    case 'I': importeI += importe; acumI++; break;
	                    case 'C': importeC += importe; acumC++; break;
	                }

	                categoria = entrada.next().charAt(0);
	                importe = entrada.nextDouble();
	            }

	            // ----------------------
	            //  MAYOR / MENOR categoría
	            // ----------------------

	            double max = importeD;
	            String nombreMax = "DESAYUNOS";
	            int empateMax = 1;

	            // Comparar A
	            if (importeA > max) { max = importeA; nombreMax = "COMIDAS"; empateMax = 1; }
	            else if (importeA == max) empateMax++;

	            // Comparar M
	            if (importeM > max) { max = importeM; nombreMax = "MERIENDAS"; empateMax = 1; }
	            else if (importeM == max) empateMax++;

	            // Comparar I
	            if (importeI > max) { max = importeI; nombreMax = "CENAS"; empateMax = 1; }
	            else if (importeI == max) empateMax++;

	            // Comparar C
	            if (importeC > max) { max = importeC; nombreMax = "COPAS"; empateMax = 1; }
	            else if (importeC == max) empateMax++;

	            if (empateMax > 1) nombreMax = "EMPATE";

	            // ---- MENOR ----

	            double min = importeD;
	            String nombreMin = "DESAYUNOS";
	            int empateMin = 1;

	            // A
	            if (importeA < min) { min = importeA; nombreMin = "COMIDAS"; empateMin = 1; }
	            else if (importeA == min) empateMin++;

	            // M
	            if (importeM < min) { min = importeM; nombreMin = "MERIENDAS"; empateMin = 1; }
	            else if (importeM == min) empateMin++;

	            // I
	            if (importeI < min) { min = importeI; nombreMin = "CENAS"; empateMin = 1; }
	            else if (importeI == min) empateMin++;

	            // C
	            if (importeC < min) { min = importeC; nombreMin = "COPAS"; empateMin = 1; }
	            else if (importeC == min) empateMin++;

	            if (empateMin > 1) nombreMin = "EMPATE";

	            // ----------------------
	            //        MEDIAS
	            // ----------------------

	            double sumaTotal = importeD + importeA + importeM + importeI + importeC;
	            int ventasTotales = acumD + acumA + acumM + acumI + acumC;

	            double mediaDia = sumaTotal / ventasTotales;
	            double mediaComidas = (acumA == 0 ? 0 : importeA / acumA);

	            String supera = (mediaComidas > mediaDia ? "SI" : "NO");

	            // ----------------------
	            //        SALIDA
	            // ----------------------

	            System.out.println(nombreMax + "#" + nombreMin + "#" + supera);
	        }

	        entrada.close();
	    }
	}
