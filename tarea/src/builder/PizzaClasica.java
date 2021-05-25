package builder;

public class PizzaClasica extends BuilderPizza {

	@Override
	public void buildIngredientes() {
		pizza.setIngredientes("Jamon");
		
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
