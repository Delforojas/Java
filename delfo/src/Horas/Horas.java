package Horas;

import java.util.Scanner;

public class Horas {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		final int SEG_HOR =3600;
		
		System.out.println("Escribe el numero de segundos");
		int  Segundos =sc.nextInt();
		
		int horas = Segundos/SEG_HOR;
		
		int segundos_restantes = Segundos% SEG_HOR;
		
		int minutos= segundos_restantes/60;
		
		Segundos=segundos_restantes%60;
		
		
		
		System.out.println("Son " +horas+"horas, " +minutos+" minuto/s y "+Segundos+"segundos");

	}

}
