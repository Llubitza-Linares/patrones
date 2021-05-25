package interpreter;

public class NumerosRomanos extends AbstractNumero {

	public NumerosRomanos(int numeroEntero) {
		this.numeroEntero=numeroEntero;
	}

	@Override
	public void interpreter(ContextNumeroEntero context) {
		
		if (context.input.startsWith("I")) {
			context.signo=-1;
	        context.input = context.input.substring(this.numeroEntero);
	    }

	}

}
