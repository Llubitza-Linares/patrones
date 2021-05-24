package abstractFactory;

public class Base {

	private String tipo;
	private String nombre;
	private String costo;
	private String tamano;

	public Base() {}
	
	public Base(String tipo, String nombre, String costo, String tamano) {
		this.tipo=tipo;
		this.nombre=nombre;
		this.costo=costo;
		this.tamano=tamano;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo=tipo;
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
		System.out.println("BASE> tipo" + tipo);
		System.out.println("BASE> nombre" + nombre);
		System.out.println("BASE> costo" + costo);
		System.out.println("BASE> tamano" + tamano);
	}

}
