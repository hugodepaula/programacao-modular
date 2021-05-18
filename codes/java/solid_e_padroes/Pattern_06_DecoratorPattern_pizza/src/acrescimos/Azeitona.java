package acrescimos;

import pizzas.Pizza;

public class Azeitona extends AcrescimoDecorator {


	public Azeitona(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + ", Azeitona (1,09)";
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 1.09;
	}

}