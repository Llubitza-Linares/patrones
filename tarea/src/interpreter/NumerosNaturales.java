package interpreter;

public class NumerosNaturales extends AbstractNumero {

	public NumerosNaturales(int numeroEntero) {
		this.numeroEntero=numeroEntero;
	}

	@Override
	public void interpreter(ContextNumeroEntero context) {
		
		if (context.input.startsWith("1")) {
			context.signo=-1;
	        context.input = context.input.substring(this.numeroEntero);
	    }

	}

}
