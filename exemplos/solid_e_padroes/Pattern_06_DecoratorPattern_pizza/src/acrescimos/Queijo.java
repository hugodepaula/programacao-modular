package acrescimos;

import pizzas.Pizza;

public class Queijo extends AcrescimoDecorator {

	public Queijo(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + ", Queijo (1,79)";
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 1.79;
	}

}