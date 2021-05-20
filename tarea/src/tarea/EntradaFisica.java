package tarea;

public class EntradaFisica {
	private String tamano;
	private String cpu;
	private String memory;
	private String sim;
	private String versionAndroid;
	private String camara;
	private String bluetooth;
	private String cantidadDeMemoriasExternas;
	private String tipoBateria;
	
	
	public EntradaFisica() {}
	
	public String getTamano() {
		return tamano;
	}
	
	public void setTamano(String tamano) {
		this.tamano=tamano;
	}

	public String getCpu() {
		return cpu;
	}
	
	public void setCpu(String cpu) {
		this.cpu=cpu;
	}

	public String getMemory() {
		return memory;
	}
	
	public void setMemory(String memory) {
		this.memory=memory;
	}

	public String getSim() {
		return sim;
	}
	public void setSim(String sim) {
		this.sim=sim;
	}

	public String getVersionAndroid() {
		return versionAndroid;
	}
	
	public void setVersionAndroid(String versionAndroid) {
		this.versionAndroid=versionAndroid;
	}

	public String Camara() {
		return camara;
	}
	
	public void setCamara(String camara) {
		this.camara=camara;
	}

	public String getBluetooth() {
		return bluetooth;
	}
	public void setBluetooth(String bluetooth) {
		this.bluetooth=bluetooth;
	}

	public String getCantidadDeMemoria() {
		return cantidadDeMemoriasExternas;
	}
	
	public void setCantidadDeMemoria(String cantidadDeMemoriasExternas) {
		this.cantidadDeMemoriasExternas=cantidadDeMemoriasExternas;
	}

	public String getTipoBateria() {
		return tipoBateria;
	}
	public void setTipoBateria(String tipoBateria) {
		this.tipoBateria=tipoBateria;
	}

	@Override
	public Object clone() {
		 EntradaFisica objClone= new EntradaFisica();
	        objClone.setTamano(this.tamano);
	        objClone.setCpu(this.cpu);
	        objClone.setMemory(this.memory);
	        objClone.setSim(this.sim);
	        objClone.setVersionAndroid(this.versionAndroid);
	        objClone.setCamara(this.camara);
	        objClone.setBluetooth(this.bluetooth);
	        objClone.setCantidadDeMemoria(this.cantidadDeMemoriasExternas);
	        objClone.setTipoBateria(this.tipoBateria);
	        return objClone;
	}
	
	public void showInformation() {
		System.out.println("tamano" + tamano);
		System.out.println("cpu" + cpu);
		System.out.println("memory" + memory);
		System.out.println("sim" + sim);
		System.out.println("versionAndroid" + versionAndroid);
		System.out.println("camara" + camara);
		System.out.println("bluetooth" + bluetooth);
		System.out.println("cantidadDeMemoriasExternas" + cantidadDeMemoriasExternas);
		System.out.println("tipoBateria" + tipoBateria);

	}

	

}
