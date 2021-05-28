package empresaSoftware;

import java.util.Vector;

public class IteratorConcreteEmpresa3 implements Iterator{
	private Vector<String> nombres;
	private int position;
	
	public IteratorConcreteEmpresa3(Vector<String> nombres) {
		this.nombres=nombres;
		this.position=0;
		
	}
	
	@Override
	public Object next() {
		return this.nombres.get(position++);
	}

	@Override
	public boolean hasNext() {
		return this.nombres.size() != 0 && this.nombres.size() > position;
	}
}
