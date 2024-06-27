package TablaMultiplicar;

import java.util.Scanner;

public class tabla_multiplicar_While {

	public static void main(String[] args) {
		int Multiplicando ;
	     
        System.out.println("¿Que tabla desea Realizar?");
        Scanner valor1 = new Scanner(System.in);
        Multiplicando = valor1.nextInt();

        int multiplicador = 1;
        while(multiplicador >=10){
        System.out.println(Multiplicando + " X " + multiplicador + " = " + Multiplicando * multiplicador );
        multiplicador++;
    
        }
    } 
}


