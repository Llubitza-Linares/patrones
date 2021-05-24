package abstractFactory;

public class HeladoCrema implements IHelado{
	private String tamano;
	private String forma;
	private Fruta fruta;
	private Base base;
	private Crema crema;
	
	public HeladoCrema() {}

	@Override
	public void crear() {
		System.out.println("HELADO CREMA");
		System.out.println("tamano"+ tamano);
		System.out.println("forma"+forma);
		fruta.show();
		base.show();
		crema.show();
	}
	
	  public String getTamano() {
	        return tamano;
	    }
	  
	public void setTamano(String tamano) {
		this.tamano=tamano;
		
	}

	  public String getForma() {
	        return forma;
	    }
	public void setForma(String forma) {
		this.forma=forma;
		
	}
	  public Fruta getFruta() {
	        return fruta;
	    }

	public void setFruta(Fruta fruta) {
		this.fruta=fruta;
		
	}

	  public Base getBase() {
	        return base;
	    }
	public void setBase(Base base) {
		this.base=base;
		
	}

	  public Crema getCrema() {
	        return crema;
	    }
	public void setCrema(Crema crema) {
		this.crema=crema;
		
	}

}
