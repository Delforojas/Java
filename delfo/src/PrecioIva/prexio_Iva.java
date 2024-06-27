package PrecioIva;

import java.util.Locale;
import java.util.Scanner;

public class prexio_Iva {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	sc.useLocale(Locale.US);
		
	    final double IVA = 0.21;
		
			
		System.out.println("Escribe un numero real ");
		double precioSinIva  = sc.nextDouble();
		
		double precioConIva = precioSinIva * (1+ 0.21);
		
		System.out.println("El precio con iva es " + precioConIva);
	}

}
