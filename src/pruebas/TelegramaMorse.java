/**
 * Resolucion de la tarea 
 *
 * Curso 2026-26
 *
 * @author oalva
 * @version 1.0
 * File: TelegramaMorse.java
 */

package pruebas;

/**
EJERCICIO: El Telegrama Más Corto
Contexto:
En código Morse, cada letra se codifica como puntos (.) y rayas (-). Para calcular la duración de un telegrama en "puntos" de tiempo:

Punto (.): dura 1 unidad
Raya (-): dura 3 unidades
Separación entre símbolos (punto/raya) de una misma letra: 1 unidad
Separación entre letras: 3 unidades
Separación entre palabras: 5 unidades


Tabla Código Morse:
A: .-     N: -.     
B: -...   O: ---    
C: -.-.   P: .--.   
D: -..    Q: --.-   
E: .      R: .-.    
F: ..-.   S: ...    
G: --.    T: -      
H: ....   U: ..-    
I: ..     V: ...-   
J: .---   W: .--    
K: -.-    X: -..-   
L: .-..   Y: -.--   
M: --     Z: --..   
!: -.-.-- 
?: ..--..

Ejemplos:
Entrada: ?

Código: ..--..
Puntos: 1+1+1+3+3+1+1+3+3+1+1 = 15

Entrada: SI

S: ... → 1+1+1+1+1 = 5
Separación letras: 3
I: .. → 1+1+1 = 3
Total: 5+3+3 = 11

Entrada: YA NACIO

Y: -.-- → 3+1+1+1+3+1+3 = 13
A: .- → 1+1+3 = 5
Separación palabra: 5
N: -. → 3+1+1 = 5
A: .- → 5
C: -.-. → 3+1+1+1+3+1+1 = 11
I: .. → 3
O: --- → 3+1+3+1+3 = 11
Total: 73
 */
import java.util.HashMap;
import java.util.Scanner;

public class TelegramaMorse {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// 1. Crear HashMap con códigos Morse
		HashMap<Character, String> morse = crearCodigoMorse();

		// 2. Leer número de casos
		int casos = entrada.nextInt();
		entrada.nextLine(); // Consumir salto de línea

		// 3. Procesar cada caso
		for (int i = 0; i < casos; i++) {
			String frase = entrada.nextLine();
			int duracion = calcularDuracion(frase, morse);
			System.out.printf("%d \n", duracion);
		}
	}

	// TODO: Crear HashMap
	private static HashMap<Character, String> crearCodigoMorse() {
		HashMap<Character, String> morse = new HashMap<>();
		morse.put('A', ".-");
		morse.put('B', "-...");
		morse.put('C', "-.-.");
		morse.put('D', "-..");
		morse.put('E', ".");
		morse.put('F', "..-.");
		morse.put('G', "--.");
		morse.put('H', "....");
		morse.put('I', "..");
		morse.put('J', ".---");
		morse.put('K', "-.-");
		morse.put('L', ".-..");
		morse.put('M', "--");
		morse.put('N', "-.");
		morse.put('O', "---");
		morse.put('P', ".--.");
		morse.put('Q', "--.-");
		morse.put('R', ".-.");
		morse.put('S', "...");
		morse.put('T', "-");
		morse.put('U', "..-");
		morse.put('V', "...-");
		morse.put('W', ".--");
		morse.put('X', "-..-");
		morse.put('Y', "-.--");
		morse.put('Z', "--..");
		morse.put('!', "-.-.--");
		morse.put('?', "..--..");

		return morse;
	}

	// TODO: Calcular duración de una frase
	private static int calcularDuracion(String frase, HashMap<Character, String> morse) {
		int total = 0;

		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);

			if (letra == ' ') {
				total += 5; // Separación palabra
			} else {
				String codigo = morse.get(letra); // Obtener código Morse
				total += calcularDuracionLetra(codigo); // Calcular duración de esa letra

				// Si NO es la última letra Y la siguiente NO es espacio
				if (i < frase.length() - 1 && frase.charAt(i + 1) != ' ') {
					total += 3; // Separación entre letras
				}
			}
		}

		return total;
	}

	private static int calcularDuracionLetra(String codigo) {
		int duracion = 0;

		for (int i = 0; i < codigo.length(); i++) {
			char simbolo = codigo.charAt(i);

			if (simbolo == '.') {
				duracion += 1;
			} else if (simbolo == '-') {
				duracion += 3;
			}

			// Si NO es el último símbolo, añadir separación
			if (i < codigo.length() - 1) {
				duracion += 1;
			}
		}

		return duracion;

	}

}
