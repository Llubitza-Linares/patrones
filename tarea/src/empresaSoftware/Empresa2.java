package empresaSoftware;

public class Empresa2 implements IEmpresa{

	private String [] nombres;
	private int position;
	
	public Empresa2() {
		position=0;
		nombres=new String[5];
	}
	
	public void add(String value) {
		nombres[position]=value;
		position++;
	}

	@Override
	public IteratorConcreteEmpresa2 iterator() {
		return new IteratorConcreteEmpresa2(this.nombres);
	}



}
