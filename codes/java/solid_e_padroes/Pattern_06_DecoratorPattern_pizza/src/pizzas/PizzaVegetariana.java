package pizzas;

public class PizzaVegetariana implements Pizza{

	@Override
	public String getDescricao() {
		return "Pizza Vegetariana (15.90)";
	}
	
	@Override
	public double getPreco() {
		return 15.90;
	}


}
