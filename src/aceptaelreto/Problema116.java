package aceptaelreto;

import java.util.Scanner;

public class Problema116 {

	public static void main(String[] args) {
		
		int base; 
		int altura;
		Scanner entrada = new Scanner(System.in);

		base = 5;
		altura = 5;

			while (base >= 0 || altura >=0 ) {
				base = entrada.nextInt();
				altura = entrada.nextInt();
				System.out.println((base*2)+(altura*2));
			}
			entrada.close();
	}

}
