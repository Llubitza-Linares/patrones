package tarea;

public class Celular {
	public static void main (String[] args) {
	EntradaFisica entrada=new EntradaFisica();
	entrada.setTamano("Grande");
	entrada.setCpu("Bueno");
	entrada.setMemory("64 ");
	entrada.setSim("Si");
	entrada.setVersionAndroid("Android 10");
	entrada.setCamara("8 px");
	entrada.setBluetooth("Si");
	entrada.setCantidadDeMemoria("64");
	entrada.setTipoBateria("Rapido");

	
	 EntradaFisica entradaOficial1= (EntradaFisica) entrada.clone();
     entradaOficial1.setVersionAndroid("Android 10");
     entradaOficial1.setTamano("Grande");
     entradaOficial1.setCpu("Regular");
     entradaOficial1.setMemory("64");
     entradaOficial1.setSim("Si");
	
	
	EntradaFisica entradaOficial2= (EntradaFisica) entrada.clone();
    entradaOficial2.setVersionAndroid("Android 8");
    entradaOficial2.setTamano("Grande");
    entradaOficial2.setCpu("Bueno");
    entradaOficial2.setMemory("64");
    entradaOficial2.setSim("No");
	
	
    EntradaFisica entradaOficial3= (EntradaFisica) entrada.clone();
    entradaOficial3.setVersionAndroid("Android 10");
    entradaOficial3.setTamano("Mediano");
    entradaOficial3.setCpu("Muy bueno");
    entradaOficial3.setMemory("64");
    entradaOficial3.setSim("Sim");
}


}
