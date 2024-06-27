package Chess;

public class Casilla {
	private int fila;
	private int columna;
	private String color;
	
	public Casilla ( int fila , int columna,String color) {
		this.fila =fila;
		this.columna= columna;
		this.color = " ";
	}
	
	public void setColor (String color ) {
		this.color=color;
	}
	
	@Override
	public String toString() {
		return color;
	}
	

	
}
