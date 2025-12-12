package com.acarballeira.ud2.cadena;


/**
 * Resolucion de la tarea 
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.0
 *
 */

public class ProbarCadena {

	public static void main(String[] args) {

		String nombre = "Julio Mosquera Gonzalez\r\n";
		
//		System.out.println(nombre.concat(new String("Mosquera")));
//		
//		System.out.println(        "Julio".concat("Mosquera"));
//		System.out.println(        "Julio".format(nombre, args));
//
//		//UTF-16
//		System.out.println(nombre.length());
//		System.out.println(nombre.charAt(1));
//		System.out.println(nombre.substring(6));
//		System.out.println(nombre.substring(6,nombre.length()));

		System.out.println(nombre.charAt((nombre.length()-1)));
		
		String resultado = "Resultado " + 5 + 5;
		
		System.out.println(resultado);
		
		String hora = "05:19:57"; 
		
		//Extraemos en componenes la hora
		String h = hora.substring(0,2);
		String m = hora.substring(3,5);
		String s = hora.substring(6);
		
		System.out.println(h);
		System.out.println(m);
		System.out.println(s);

		int horaEnteira = Integer.parseInt(h);
		
		int horEnteira2 = Integer.valueOf(h).intValue();
		
		System.out.println(horaEnteira);
		horEnteira2++;
		System.out.println(horEnteira2);
		
		
		String correo = "juliO.mosquera@yahoo.es";
		correo +=""; 
		String correo2 = "julio.mosquera@yahoo.es";
		
		System.out.println(correo.equalsIgnoreCase(correo2));
		
		String cadena = "Julio Mosquera";
		
		String [] partes = cadena.split(" "); 
		
		System.out.println(partes[0]);
		
		
	}

}
