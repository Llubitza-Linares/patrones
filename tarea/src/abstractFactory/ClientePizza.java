package abstractFactory;

import builder.Dueno;
import builder.Pizza;
import builder.PizzaCarnivora;
import builder.PizzaClasica;
import builder.PizzaHawaina;

public class ClientePizza {

	public static void main(String[] args) {
	
		Dueno jose=new Dueno();
		 PizzaCarnivora pizzaCarnivora = new PizzaCarnivora();
	        PizzaHawaina pizzaHawaiana = new PizzaHawaina();
	        PizzaClasica pizzaClasica = new PizzaClasica();

	        jose.setBuilderPizza(pizzaCarnivora);
	        jose.hornearPizza();
	        Pizza pizzaCarnivora1 = jose.getPizza();
	        pizzaCarnivora1.showData();

	        jose.setBuilderPizza(pizzaHawaiana);
	        jose.hornearPizza();
	        Pizza pizzaHawaiana1 = jose.getPizza();
	        pizzaHawaiana1.showData();

	        jose.setBuilderPizza(pizzaClasica);
	        jose.hornearPizza();
	        Pizza pizzaClasica1 = jose.getPizza();
	        pizzaClasica1.showData();
	
	}
}
