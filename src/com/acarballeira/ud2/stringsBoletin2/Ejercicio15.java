/**
 * 
 */
package com.acarballeira.ud2.stringsBoletin2;

import javax.swing.JOptionPane;

/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

/**
Emprega JOptionPane para ler o nome, apelidos e idade dunha persoa. A idade debe
almacenarse nun int. Amosa os anteriores valores mediante un JOptionPane igualmente.
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		
		String nome, apelidos;
		int edad;
		
		nome =leer("Introduzca su nombre ");
		apelidos =leer("Introduzca su apelidos ");
		edad = Integer.parseInt(leer("Introduzca su edad "));
		
		 muestraValores(nome,apelidos,edad);
		
	}

	private static void muestraValores(String nome ,String apelidos ,int edad) {
		
		String mensaje = "Nombre y Apellidos: " + nome + " " + apelidos;
		mensaje += "\nEdad: " +edad;
		
		 JOptionPane.showMessageDialog(null,
				mensaje,"Informacion:",JOptionPane.INFORMATION_MESSAGE);
		
	}

	private static String leer(String mensaje) {

	return JOptionPane.showInputDialog(null,
				mensaje,"Peticion de datos",JOptionPane.INFORMATION_MESSAGE);

	}

}
