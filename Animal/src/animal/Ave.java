package animal;

public class Ave extends Animal {
	private int patas;
	private int alas;
	private String tipoPico;
	private String tipoCola;
	
	@Override
	public void comunicarse() {
		//TODO Auto-generated method stub
	}
	public void ponerHuevos() {
		
	}
	
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas=patas;
	}
	
	
	public int getAlas() {
		return alas;
	}
	public void setAlas(int alas) {
		this.alas=alas;
	}
	
	
   public String getTipopico() {
	   return tipoPico;
   }
   public void setTipoPico(String tipoPico) {
	   this.tipoPico=tipoPico;
   }
   
   
   public String getTipoCola() {
       return tipoCola;
   }
   public void setTipoCola(String tipoCola) {
	   this.tipoCola=tipoCola;
   }
}
