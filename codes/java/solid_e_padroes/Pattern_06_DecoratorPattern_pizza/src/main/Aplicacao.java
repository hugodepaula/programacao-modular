package main;

import java.text.DecimalFormat;

import acrescimos.Azeitona;
import acrescimos.Bolognesa;
import acrescimos.Cebola;
import acrescimos.Frango;
import acrescimos.Queijo;
import acrescimos.Tomate;
import acrescimos.Zucchini;
import pizzas.Pizza;
import pizzas.PizzaSimples;
import pizzas.PizzaVegetariana;

public class Aplicacao {

	public static void main(String[] args) {

		DecimalFormat dformat = new DecimalFormat("#.##");

		Pizza pizza = new PizzaVegetariana();

		pizza = new Tomate(pizza);
		pizza = new Azeitona(pizza);
		pizza = new Zucchini(pizza);

		System.out.println("Descricao: " + pizza.getDescricao());
		System.out.println("Preço: " + dformat.format(pizza.getPreco()));

		pizza = new PizzaSimples();

		pizza = new Queijo(pizza);
		pizza = new Frango(pizza);
		pizza = new Bolognesa(pizza);
		pizza = new Cebola(pizza);

		System.out.println("Descricao: " + pizza.getDescricao());
		System.out.println("Preço: " + dformat.format(pizza.getPreco()));
	}

}
