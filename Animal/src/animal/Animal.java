package animal;

public  abstract class Animal {
	private String nombre;
	private int edad;
    private String especie;
	private String raza;
	private int peso;
	
	public abstract void comunicarse();
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre){
	    this.nombre=nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie){
	    this.especie=especie;
	}
	
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza){
	    this.raza=raza;
	}
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso=peso;
	}
}
