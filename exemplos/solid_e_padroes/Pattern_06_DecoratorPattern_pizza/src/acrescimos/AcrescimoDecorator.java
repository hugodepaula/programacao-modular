package acrescimos;

import pizzas.Pizza;

public abstract class AcrescimoDecorator implements Pizza {

	private final Pizza pizza;
	
	public AcrescimoDecorator(Pizza pizza) {
		if (pizza == null) 
			throw new RuntimeException("Acrescimo deve estar associado a uma pizza.");
		this.pizza = pizza;
	}


	@Override
	public double getPreco() {
		return pizza.getPreco();
	}


	@Override
	public String getDescricao() {
		return pizza.getDescricao();
		
	}

}
