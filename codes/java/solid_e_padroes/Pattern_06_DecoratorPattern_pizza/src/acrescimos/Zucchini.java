package acrescimos;

import pizzas.Pizza;

public class Zucchini extends AcrescimoDecorator {

	public Zucchini(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + ", Zucchini (0,99)";
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 0.99;
	}

}
