package Bisiesto;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.println("Escribe un año");
       int anio = sc.nextInt();
       
       
       
 if( anio % 4 ==0 && anio%100 != 0 || anio%400 ==0 ) {
	 System.out.println("Es bisiesto");
 }else {
	 System.out.println("No es bisiesto");
	 
	 
 }
	 }

}
