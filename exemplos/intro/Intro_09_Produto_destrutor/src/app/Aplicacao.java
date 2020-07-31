package app;
import java.io.IOException;

import business.Produto;

class Aplicacao {
	public static void main(String args[]) throws IOException, InterruptedException {

		System.out.println("\nInstancias prods: " + Produto.getInstancias());

		Produto p1 = new Produto();

		System.out.println("\nInstancias prods: " + Produto.getInstancias());

		Produto p2 = new Produto("Shulambs", 1.99F, 600);

		System.out.println("\nInstancias prods: " + Produto.getInstancias());

		System.out.println("Produto: " + p1.getDescricao());
		System.out.println("Produto: " + p2.getDescricao());

		// Referência p1 aponta para produto da referência p2.
		// produto anteriormente apontado por p1 se torna inacessível.
		p1 = p2;

		System.out.println("Produto: " + p1.getDescricao());
		System.out.println("Produto: " + p2.getDescricao());
		
		// Coletor de lixo ainda não foi executado.
		System.out.println("\nInstancias prods: " + Produto.getInstancias());

		System.gc();

		Thread.sleep(1000);
		

		// Coletor de lixo já foi executado.
		System.out.println("\nInstancias prods: " + Produto.getInstancias());

	}
}
