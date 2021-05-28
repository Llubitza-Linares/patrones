package empresaSoftware;

public class Empresa1 implements IEmpresa {
	
	private String [] nombres;
	private int position;
	
	public Empresa1() {
		position=0;
		nombres=new String[5];
	}
	
	public void add(String value) {
		nombres[position]=value;
		position++;
	}

	@Override
	public IteratorConcreteEmpresa1 iterator() {
		return new IteratorConcreteEmpresa1(this.nombres);
	}


}
