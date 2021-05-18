package acrescimos;

import pizzas.Pizza;

public class Bolognesa extends AcrescimoDecorator {


	public Bolognesa(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + ", Bolognesa (3,25)";
	}

	@Override
	public double getPreco() {
		return super.getPreco() + 3.25;
	}

}