package builder;

public class PizzaHawaina extends BuilderPizza{

	@Override
	public void buildIngredientes() {
		pizza.setIngredientes("piña");
		
	}

	@Override
	public void buildTipoMasa() {
		pizza.setTipoMasa("delgada");
		
	}

	@Override
	public void buildTipoQueso() {
		pizza.setTipoQueso("mozarrella");
		
	}

}
