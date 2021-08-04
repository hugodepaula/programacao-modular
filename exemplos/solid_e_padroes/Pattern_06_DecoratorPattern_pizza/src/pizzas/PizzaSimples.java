package pizzas;

public class PizzaSimples implements Pizza {

	@Override
	public String getDescricao() {
		return "Pizza simples (11.90)";
	}

	@Override
	public double getPreco() {
		return 11.90;
	}

}
