package InvertirCadena;

import java.util.Scanner;

public class invertir {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\n");
		
		System.out.println("escribe una frase");
		String frase =sc.next();
		
		String invertida="";
		
		char caracter;
		
		for ( int i =frase.length()-1 ;i>=0; i--) {
			
			caracter=frase.charAt(i);
			invertida+=caracter;
		}
		
		System.out.println("invertida:"+invertida);

	}

}
