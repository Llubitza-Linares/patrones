package tarea;

public class singleton {
	private static singleton instance =null;
	
	private singleton () {
		System.out.println("INFO> Empresa de cambio");
		
	}
	
	public static singleton getInstance () {
		if (instance == null)
			instance = new singleton();
		return instance;
	}
	
	public void cambio(int monto, String tipoMonto, String tipoCambio) {
		if (tipoMonto == "bs" && tipoCambio == "$") {
			double total = monto / 7;
			System.out.println(monto + "bs --->" + total + "$");
			
		}else if (tipoMonto == "$" && tipoCambio == "bs") {
			double total =monto * 7;
			System.out.println(monto + "$ --->" + total + "bs");
			
		}else if (tipoMonto == "bs" && tipoCambio == "E") {
			double total =monto * 8;
			System.out.println(monto + " bs--->" + total + "E");
			
		}
	}
}
