package acrescimos;

import pizzas.Pizza;

public class Frango extends AcrescimoDecorator {


	public Frango(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + ", Frango (2,75)";
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 2.75;
	}

}