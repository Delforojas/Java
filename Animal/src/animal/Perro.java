package animal;

public class Perro extends Mamifero{
	private String cola;
	private int codigoChip;
	private String nombre;
	
	public String getCola() {
		return cola;
	}
	public void setCola(String cola) {
		this.cola=cola;
	}
    
	
	public int getCodigoChip() {
		return codigoChip;
	}
	public void setCodigoChip(int codigoChip) {
		this.codigoChip=codigoChip;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	@Override
	public void comunicarse() {
		//TODO Auto-generated method stub
		System.out.println("guauguau");
	}
	public void correr() {
		System.out.println("estoy corriendo");
	}
}
