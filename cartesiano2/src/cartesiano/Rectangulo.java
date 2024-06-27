package cartesiano;

public class Rectangulo {
private int posicionX;
private int posicionY;


public Rectangulo() {
	
}

public Rectangulo(int posicionX , int posicionY) {
	if (posicionX !=0 && posicionY !=0) {
		this.posicionX=posicionX;
		this.posicionY=posicionY;}
	else
		System.out.println("No es un rectangulo");
}

public void setposicionY(int posicionY) {
	if(posicionY==0)
		System.out.println("No es un rectangulo válido");
	else
        this.posicionY = posicionY;}

public int getposicionY() {
	return  posicionY;
}
	
public void setposicionX(int posicionX) {
	if(posicionX==0)
		System.out.println("No es un rectangulo válido");
	else
		this.posicionX = posicionX;}

public int getposicionX() {
		return  posicionX;

}

public int areaRectangulo() {
	int area=posicionX*posicionY;
	return area;
}
public int perimetroRectangulo() {
	int perimetro =2*posicionX+2*posicionY;
	return perimetro;
}

@Override
public String toString() {
	return"La posicion x del rectangulo seria" +posicionX+ ",la posicion y "+posicionY+" ,el area"+areaRectangulo()+" y el perimetro"+perimetroRectangulo();
}
}
