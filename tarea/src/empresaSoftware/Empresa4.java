package empresaSoftware;

public class Empresa4 implements IEmpresa{

	private String [] nombres;
	private int position;
	
	public Empresa4() {
		position=0;
		nombres=new String[5];
	}
	
	public void add(String value) {
		nombres[position]=value;
		position++;
	}

	@Override
	public IteratorConcreteEmpresa4 iterator() {
		return new IteratorConcreteEmpresa4(this.nombres);
	}



}
