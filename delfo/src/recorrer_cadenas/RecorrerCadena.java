package recorrer_cadenas;
import java.util.Scanner;
public class RecorrerCadena {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		sc.useDelimiter("\n");
		System.out.println ("introduce una cadena");
		String frase = sc.next();
		
		char caracter;
		
		for (int i = 0;i<frase.length();i++){
			caracter=frase.charAt(i);
			System.out.println(caracter);
		}

	}

}
