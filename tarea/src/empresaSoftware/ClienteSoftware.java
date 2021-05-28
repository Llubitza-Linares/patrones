package empresaSoftware;

public class ClienteSoftware {

	public static void main(String[] args) {
		Empresa1 empresa1 = new Empresa1();
		empresa1.add("Jose");
		empresa1.add("Juan");
		empresa1.add("Alfonso");
		empresa1.add("Ignacio");
		empresa1.add("Ricardo");
		
		Empresa2 empresa2 = new Empresa2();
		empresa2.add("Andres");
		empresa2.add("Daniel");
		empresa2.add("Rodrigo");
		empresa2.add("Kevin");
		empresa2.add("Luciano");
		
		Empresa3 empresa3 = new Empresa3();
		empresa3.add("Santiago");
		empresa3.add("Alejandro");
		empresa3.add("Fabian");
		empresa3.add("Andre");
		empresa3.add("Manuel");
		
		Empresa4 empresa4 = new Empresa4();
		empresa4.add("Ian");
		empresa4.add("Gabriel");
		empresa4.add("Ariel");
		empresa4.add("Mateo");
		empresa4.add("Yessid");
		
		Iterator iterator = empresa1.iterator();
		while(iterator.hasNext()) {
			System.out.println("Nombre: "+iterator.next());
		}
		iterator = empresa2.iterator();
		while(iterator.hasNext()) {
			System.out.println("Nombre: "+iterator.next());
		}
		iterator = empresa3.iterator();
		while(iterator.hasNext()) {
			System.out.println("Nombre: "+iterator.next());
		}
		iterator = empresa4.iterator();
		while(iterator.hasNext()) {
			System.out.println("Nombre: "+iterator.next());
		}
	}
}
