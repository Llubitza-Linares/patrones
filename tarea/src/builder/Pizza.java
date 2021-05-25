package builder;

public class Pizza {

	private String ingredientes;
	private String tipoMasa;
	private String tipoQueso;
	
	public Pizza() {}
	
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public String getTipoMasa() {
		return tipoMasa;
	}
	public void setTipoMasa(String tipoMasa) {
		this.tipoMasa = tipoMasa;
	}
	public String getTipoQueso() {
		return tipoQueso;
	}
	public void setTipoQueso(String tipoQueso) {
		this.tipoQueso = tipoQueso;
	}
	
	public void showData() {
		System.out.println("ingredientes:" +ingredientes);
		System.out.println("tipo de masa:" +tipoMasa);
		System.out.println("tipo de queso:" + tipoQueso);
	}
}
