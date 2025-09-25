/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;


/*
Usamos LocalDate.now() para obtener la fecha actual (con día, mes y año).

Construimos un objeto LocalDate con la fecha de nacimiento: LocalDate.of(anioNac, mesNac, diaNac).

Aplicamos Period.between(fechaNacimiento, fechaActual).getYears() para calcular la diferencia exacta en años.

De este modo, la edad siempre será correcta, aunque todavía no haya cumplido años en el año actual.
*/
public class Ejercicios08 {
	
	public static void main(String[] args) {

        // ----------------------------
        // 1. Declarar variables
        // ----------------------------
        String nombre;
        int anioNac, mesNac, diaNac;
        int edad;

        Scanner teclado = new Scanner(System.in);

        // ----------------------------
        // 2. Toma de datos / iniciar variables
        // ----------------------------
        System.out.print("Introduce tu nombre: ");
        nombre = teclado.nextLine();

        System.out.print("Introduce tu año de nacimiento: ");
        anioNac = teclado.nextInt();

        System.out.print("Introduce tu mes de nacimiento (1-12): ");
        mesNac = teclado.nextInt();

        System.out.print("Introduce tu día de nacimiento: ");
        diaNac = teclado.nextInt();
    	teclado.close();


        // ----------------------------
        // 3. Operativa
        // ----------------------------
        LocalDate hoy = LocalDate.now();
        LocalDate cumple = LocalDate.of(anioNac, mesNac, diaNac);

        edad = Period.between(cumple, hoy).getYears();

        // ----------------------------
        // 4. Salida
        // ----------------------------
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

    }        

}