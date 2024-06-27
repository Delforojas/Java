package CadenaPal;

import java.util.Scanner;

public class palindromo {

	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
		  String palabra;
		
		System.out.println("Introduce una palabra");
		palabra = sc.nextLine();
		
		for ( int i = 0,j =palabra.length()-1; i < j; i++,j--) {
			if (palabra.charAt(i)!= palabra.charAt(j)){
				System.out.println("La palabra no es palindromo");
			}else {
				System.out.println("Es un palindromo");
			}
		}
        

	}
}
