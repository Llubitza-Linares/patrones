package abstractFactory;

public class Fruta {
	private String tipoFruta;
	private String nombre;
	private String costo;
	private String tamano;

	public Fruta() {}
	
	public Fruta(String tipoFruta, String nombre, String costo, String tamano) {
		this.tipoFruta=tipoFruta;
		this.nombre=nombre;
		this.costo=costo;
		this.tamano=tamano;
	}
	
	public String getTipoFruta() {
		return tipoFruta;
	}
	
	public void setTipoFruta(String tipoFruta) {
		this.tipoFruta=tipoFruta;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getCosto() {
		return costo;
	}
	
	public void setCosto(String costo) {
		this.costo=costo;
	}
	
	public String getTamano() {
		return tamano;
	}
	
	public void setTamano(String tamano) {
		this.tamano=tamano;
	}

	public void show() {
		System.out.println("FRUTA> tipoFruta" + tipoFruta);
		System.out.println("FRUTA> nombre" + nombre);
		System.out.println("FRUTA> costo" + costo);
		System.out.println("FRUTA> tamano" + tamano);
	}

}
