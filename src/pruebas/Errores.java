package pruebas;

import java.util.Scanner;

public class Errores {

	public static void main(String[] args) {

		// Declarar variables
		int numero1;
		int numero2;
		double promedio;
		double techo;
		double suelo;
		int verifica1;
		int difAbsoluta;
		int diferencia;
		boolean procesa = true;// se intenta envitar el uso de break
		boolean usado;
		boolean usado2;
		Scanner entrada;

		// Inicializar Variables
		entrada = new Scanner(System.in);
		usado = false;
		usado2 = false;
		numero1 = -21;
		numero2 = 22;
		
        //Operativa
		while (procesa) {
			

			techo = 0;
			suelo = 0;
			diferencia = 0;
			difAbsoluta = 0;		 
			promedio = 0;
			
			//Valida numero1
			if (usado == false){
				while (numero1 <= -20 || numero1 >= 20  ) {
					System.out.printf("Introduce un numero entre -20 y 20: %n");
					numero1 = entrada.nextInt();
//					System.out.printf("numero1 %n"+numero1); 
					usado = true;
				    }			
			}
			
			
			//Valida numero2
			while (numero2 <= -20 || numero2 >= 20) {
				System.out.printf("Introduce un numero entre -20 y 20: %n");
				numero2 = entrada.nextInt();
//				System.out.printf("numero2 %n"+numero2);

			  }  

			// comprueba las condiciones de los numeros

			if (numero1 == 0 || numero2 == 0 ) {
				
				System.out.printf("Fin de programa : Se introdujo un  0");
				 procesa = false;;
				
			}
			
			if (numero1 == numero2) {
				System.out.printf("Fin de programa : Los numeros son iguales");
				 procesa = false;;
			}
			


			
			promedio = (double) (numero1 +numero2)/2 ;
//			System.out.printf("Promedio: %.2f %n",promedio); // DEBUGG

			
			// Calcula dif.Absoluta
			
			diferencia = (numero1)-(numero2);
//			System.out.printf("diferencia: %d %n",diferencia); // DEBUGG
			difAbsoluta = Math.abs(diferencia);
			System.out.printf("difAbsoluta: %d %n",difAbsoluta);

			
			// Calcula Techo
			
			techo = Math.ceil(promedio);
			System.out.printf("Techo: %.2f %n",techo);

			
			// Calcula Suelo
			
			suelo = Math.floor(promedio);
			System.out.printf("Suelo %.2f %n",suelo);

			//intercambia valores para nuevo calculo
			numero1 = numero2;
			numero2 = 23;

					 
			
		}// Fin procesa

	}

}
