package tarea;

public class accesorios {
	private String audifono;
	private String cargador;
	private String estuche;
	
	public accesorios() {}
	
	public accesorios(String audifono, String cargador, String estuche) {
		this.audifono=audifono;
		this.cargador=cargador;
		this.estuche=estuche;
	}
	
	public String getAudifono() {
		return audifono;
		
	}
	
	public void getAudifono(String audifono) {
		this.audifono=audifono;
	}
	
	public String getCargador() {
		return cargador;
	}
	
	public void getCargador(String cargador) {
		this.cargador=cargador;
	}
	
	public String getEstuche() {
		return estuche;
	}
	
	public void getEstuche(String estuche) {
		this.estuche=estuche;
	}
}
