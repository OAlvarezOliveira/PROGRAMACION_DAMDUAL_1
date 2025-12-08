/**
 * Resolucion de la tarea 
 *
 * Curso 2025-26
 *
 * @author oalva
 * @version 1.0
 * File: Problema121.java
 */

package aceptaelreto;

import java.util.Scanner;

/**
 * Chicles de regalo Tiempo máximo: 1,000 s Memoria máxima: 4096 KiB Para tener
 * contentos a los niños y de paso intentar que no tiren al suelo los
 * envoltorios de los chicles, la empresa BubbaGum ha decidido dar chicles
 * gratis a aquellos que lleven los envoltorios de otros chicles ya consumidos.
 * 
 * Ha empezado regalando un chicle por cada cinco envoltorios. Eso significa que
 * si compramos 25 chicles podremos en realidad disfrutar de 31: al comernos los
 * 25 comprados tendremos 5 chicles más gratis con los que conseguimos otros 5
 * envoltorios adicionales con los que podemos ir a la tienda a por otro más. Si
 * la estrategia funciona, la empresa probará a realizar otras ofertas.
 * 
 * La pregunta que nos hacemos es ¿cuántos chicles nos podremos comer según la
 * oferta que haya en ese momento?
 * 
 * Entrada La entrada estará compuesta de una serie de casos de prueba. Cada
 * caso de prueba está compuesto de una única línea que tiene tres números
 * enteros (no mayores de 109) separados por espacios. Los dos primeros números
 * indican cuántos envoltorios se necesitan para que nos den qué cantidad de
 * chicles. El tercer número indica el número de chicles que compramos
 * inicialmente. Ninguno de esos números será negativo; el primero, además, será
 * siempre mayor que cero. Los casos de prueba terminan cuando los tres son
 * cero.
 * 
 * Salida Para cada caso de prueba se escribirá una línea que tendrá, a su vez,
 * dos números. El primero indicará el número total de chicles que nos comemos,
 * y el segundo con cuántos envoltorios nos quedamos al final.
 * 
 * Si la oferta hace que la empresa se arruine con nosotros se escribirá RUINA.
 * Se considerará que la empresa va a la ruina cuando tenga que regalarnos
 * chicles de forma indefinida.
 * 
 * Entrada de ejemplo 5 1 25 5 1 5 10 1 100 2 5 20 0 0 0 Salida de ejemplo 31 1
 * 6 1 111 1 RUINA
 */
public class Problema121 {

    public static void main(String[] args) {

        // Declaracion variables
        int envoltoriosNecesarios;
        int chiclesRegalo;
        int chiclesComprados;
        int chiclesComidos;
        int restoEnvoltorios;
        int nuevosChicles;
        boolean calcula;
        Scanner entrada;

        // Inicializar Variables
        entrada = new Scanner(System.in);
        calcula = true;

        // Operativa
        while (calcula) {

            // reset variables por caso
            envoltoriosNecesarios = 0;
            chiclesRegalo = 0;
            chiclesComprados = 0;
            chiclesComidos = 0;
            restoEnvoltorios = 0;
            nuevosChicles = 0;

            // toma de datos y validacion salida
            envoltoriosNecesarios = entrada.nextInt();
            chiclesRegalo = entrada.nextInt();
            chiclesComprados = entrada.nextInt();

            if (envoltoriosNecesarios == 0 && chiclesRegalo == 0 && chiclesComprados == 0) {
                calcula = false;
            } else {

                // Condición RUINA
            	if (chiclesRegalo >= envoltoriosNecesarios && chiclesComprados >= envoltoriosNecesarios) {
                    System.out.println("RUINA");
                } else {

                    // Inicializamos con los chicles comprados
                    chiclesComidos = chiclesComprados;
                    restoEnvoltorios = chiclesComprados;

                    // Bucle para canjear chicles hasta que no haya suficientes envoltorios
                    while (restoEnvoltorios >= envoltoriosNecesarios) {

                        // calcular cuantos chicles nos dan en esta iteración
                        int canjeables = restoEnvoltorios / envoltoriosNecesarios;
                        nuevosChicles = canjeables * chiclesRegalo;

                        // sumar los nuevos chicles a los comidos
                        chiclesComidos += nuevosChicles;

                        // actualizar los envoltorios: sobrantes + nuevos chicles
                        restoEnvoltorios = (restoEnvoltorios % envoltoriosNecesarios) + nuevosChicles;
                    }

                    // Salida con formato exacto
                    System.out.printf("%d %d%n", chiclesComidos, restoEnvoltorios);
                }

            }

        } // Fin calcula

        entrada.close();
    }

}