package acrescimos;

import pizzas.Pizza;

public class Tomate extends AcrescimoDecorator {

	public Tomate(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + ", Tomate (0,79)";
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 0.79;
	}

}
