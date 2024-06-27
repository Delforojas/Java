package AJEDREZ;

public class AJEDREZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(" A B C D E F G H");
	for (int fila = 0; fila<8; fila++) {
    	System.out.print((8-fila) +" ");
    	for (int columna = 0; columna<8; columna++){
    		if ((fila +columna)%2 ==0) {
    			System.out.print(" ");
    		}else {
    			System.out.print("\u2588\u2588");
    		}
    		
    	}
    	System.out.print(" " +(8-fila));
    	System.out.println();
    }
    System.out.println(" A B C D E F G H");
	} 

}
