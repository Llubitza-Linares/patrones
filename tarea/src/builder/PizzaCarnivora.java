package builder;

public class PizzaCarnivora extends BuilderPizza {

	@Override
	public void buildIngredientes() {
		pizza.setIngredientes("chorizo");
		
	}

	@Override
	public void buildTipoMasa() {
		pizza.setTipoMasa("gruesa");
		
	}

	@Override
	public void buildTipoQueso() {
		pizza.setTipoQueso("criollo");
		
	}

}
