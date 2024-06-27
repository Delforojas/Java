package Chess;

public class Tablero {
	private Casilla[][] casillas;
	
	public Tablero() {
		casillas=new Casilla [8][8];
		for (int fila = 0 ;fila<casillas.length;fila++) {
			for (int columna= 0;columna<casillas[0].length;columna++) {
				casillas [fila][columna] = new Casilla ( fila ,  columna, null);
			}
		}
		
	}
    public void setCasilla (int fila , int columna , String color){
    
		this.casillas[fila][columna].setColor(color);
    }
    public void anadirColorCasillas() {
    	for (int fila = 0 ;fila<casillas.length;fila++) {
			for (int columna= 0;columna<casillas[0].length;columna++) {
				this.setCasilla(fila, columna, (fila +columna)%2==0?"  ":"\u2588\u2588");
						}
    	}
    	System.out.println();
    }
  
public  void mostrarTablero() {
	System.out.println(" A B C D E F G H ");
	for (int fila =0;fila<casillas.length; fila++) {
		System.out.print((8-fila) +" ");
		for( int columna = 0;columna<casillas[0].length; columna++) {
			System.out.print(casillas [fila][columna].toString());
		}
		System.out.print(" "+(8-fila));
		System.out.println();
	}
	System.out.println("  A B C D E F G H");
}
}

