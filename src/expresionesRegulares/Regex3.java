package expresionesRegulares;

import java.util.Scanner;

/**
 * Resolución de la tarea XX
 * 
 * Curso 2025-26
 * 
 * @author Julio Mosquera
 * @version 1.0
 */

public class Regex3 {

	public static void main(String[] args) {
		
		String texto, textoLimpio;
		
		//texto = leerTexto();
		texto = "Lorem ipsum dolor sit amet,consectetur adipiscing elit.Pellentesque mattis tristique accumsan.Cras volutpat porta ex vel\r\n"
				+ "hendrerit.Suspendisse non elementum eros.Proin mattis hendrerit blandit.Fusce mattis dui in tempor condimentum.In lectus\r\n"
				+ "justo,venenatis eget lacus in,scelerisque posuere ante.Aenean commodo leo eget ornare condimentum.Ut tempor ligula\r\n"
				+ "diam,finibus consectetur lectus blandit faucibus.Sed at enim id lectus vehicula pulvinar sit amet eu ipsum.In hac habitasse\r\n"
				+ "platea dictumst.Pellentesque ex erat,rutrum elementum nisl eleifend,feugiat aliquam odio.Proin nibh sem,malesuada a porta\r\n"
				+ "at,posuere sit amet felis.";		
		textoLimpio = arreglarTexto(texto);
		
		System.out.printf("Texto limpito: %s", textoLimpio);
	}
	
	private static String arreglarTexto(String t) {
				
		//t = t.replaceAll("\\.", ". ");
		//t = t.replaceAll(",", ", ");
		t = t.replaceAll("([.,])", "$1 ");
		
		return t;
	}

	private static String leerTexto() {
		String texto;
		Scanner leer;
		
		leer = new Scanner(System.in);
		System.out.printf("Dame un texto: ");
		texto = leer.nextLine();
		
		return texto;
	}
	
}
