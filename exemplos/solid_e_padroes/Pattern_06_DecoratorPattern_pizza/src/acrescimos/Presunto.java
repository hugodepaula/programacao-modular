package acrescimos;

import pizzas.Pizza;

public class Presunto extends AcrescimoDecorator {

	public Presunto(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + ", Presunto (2,99)";
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 2.99;
	}

}