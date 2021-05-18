package acrescimos;

import pizzas.Pizza;

public class Parma extends AcrescimoDecorator {

	public Parma(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + ", Parma (4,99)";
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 4.99;
	}

}