package tabla_multiplicar;

import java.util.Scanner;

public class tabla {

	public static void main(String[] args) {
		
          Scanner sc = new Scanner(System.in);
          System.out.println("Escribe un numero");
          int num = sc.nextInt();
          
          int res=0;
          
          for( int i =1 ;i<=10;i++ ) {
        	  res=i*num;  
        	  System.out.println(num+"*"+i+"="+res);
          }
        	  
        	  
          
	}

}
