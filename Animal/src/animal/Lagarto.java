package animal;

public class Lagarto extends Animal{
	private int patas;
	private boolean escamas;
	private String temperaturaSangre;
	
	@Override
	public void comunicarse() {
		//TODO Auto-generated method stub
	}
	
	public void hibernar() {
		
	}
    
	public int getPatas() {
		return patas ;
	}
	public void setPatas(int patas ) {
		this.patas=patas;
	}
	
	public boolean getEscamas() {
		return escamas ;
	}
	public void setEscamas(boolean escamas ) {
		this.escamas=escamas;	
	}
	
	
	public String getTemperaturaSangre() {
		return temperaturaSangre;
	}
	public void setTemperaturaSangre(String temperaturaSangre) {
		this.temperaturaSangre=temperaturaSangre;
	}
}
