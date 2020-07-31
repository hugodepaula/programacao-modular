package app;

import business.Produto;

class Aplicacao {
	public static void main(String args[]) {
		Produto p1 = new Produto();

		Produto p2 = new Produto("Shulambs", 1.99F, 200);

        p1.setDescricao("Cool Shulambs");
        p1.setPreco(2.49F);
        p1.setQuant(10);
        
        System.out.println("Produto: " + p1.getDescricao());
        System.out.println("Preço: " + p1.getPreco());
        System.out.println("Estoque: " + p1.getQuant());
        
        System.out.println("Produto: " + p2.getDescricao());
        System.out.println("Preço: " + p2.getPreco());
        System.out.println("Estoque: " + p2.getQuant());

		if (p1.emEstoque())
			System.out.println("Produto em estoque.");
	}
}
