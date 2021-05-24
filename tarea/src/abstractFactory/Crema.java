package abstractFactory;

public class Crema {

	private String sabor;
	private String costo;
	private String marca;

	public Crema() {}
	
	public Crema(String sabor, String costo, String marca) {
		this.sabor=sabor;
		this.costo=costo;
		this.marca=marca;
	}
	

	public String getCosto() {
		return costo;
	}
	
	public void setCosto(String costo) {
		this.costo=costo;
	}
	
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void show() {
		System.out.println("CREMA> sabor" + sabor);
		System.out.println("CREMA> costo" + costo);
		System.out.println("CREMA> marca" + marca);
	}



}
