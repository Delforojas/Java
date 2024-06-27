package ValidarNumero;

import java.util.Scanner;

public class Validar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero ;
		do {
			
		System.out.println("Escribe un numero");
		numero = sc.nextInt();
		
		if(!(numero>=0 && numero<=10)) {
			System.out.println("Error , debes elegir un numero entre 0 y 10");
		}
		
		}while(!( numero>=0 && numero<=10)   );
		
		System.out.println("el numero "+numero+" esta entre 0 y 10");


	}

}
