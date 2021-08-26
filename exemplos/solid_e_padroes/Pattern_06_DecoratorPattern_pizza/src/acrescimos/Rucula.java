package acrescimos;

import pizzas.Pizza;

public class Rucula extends AcrescimoDecorator {

	public Rucula(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + ", Rucula (0,55)";
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 0.55;
	}

}