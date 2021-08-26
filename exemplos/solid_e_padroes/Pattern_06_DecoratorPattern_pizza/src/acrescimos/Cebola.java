package acrescimos;

import pizzas.Pizza;

public class Cebola extends AcrescimoDecorator {

	public Cebola(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + ", Cebola (0,35)";
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 0.35;
	}

}
