package empresaSoftware;

import java.util.Stack;

public class IteratorConcreteEmpresa4 implements Iterator{
	private String [] nombres;
	private int position;
	
	public IteratorConcreteEmpresa4(Stack<String> empleados) {
		
	}
	
	@Override
	public Object next() {
		return nombres[position++];
	}

	@Override
	public boolean hasNext() {
		return nombres.length != 0 && position < nombres.length;
	}

}
