package animal;

public class Mamifero extends Animal {
	private int mesesGestacion;
	private int patas;
    
	@Override
	public void comunicarse() {
		//TODO Auto-generated method stub
	}
	
	public void parirCria() {
		
	}
	public int getMesesGestacion() {
		return mesesGestacion;
	}
	public void setMesesGestacion(int mesesGestacion) {
		this.mesesGestacion=mesesGestacion;
	}
	
	public int getPatas(){
		return patas;
	}
	public void setPatas(int patas) {
		this.patas=patas;
	}
}
