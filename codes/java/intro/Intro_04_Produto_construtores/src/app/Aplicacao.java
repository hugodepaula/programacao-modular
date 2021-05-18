package app;

class Aplicacao {
	public static void main(String args[]) {
		Produto p1 = new Produto();

		Produto p2 = new Produto("Shulambs", 1.99F, 200);

		System.out.println("Produto: " + p1.descricao);
		System.out.println("Preço: " + p1.preco);
		System.out.println("Estoque: " + p1.quant);

		System.out.println("Produto: " + p2.descricao);
		System.out.println("Preço: " + p2.preco);
		System.out.println("Estoque: " + p2.quant);

		if (p1.emEstoque())
			System.out.println("Produto em estoque.");
	}
}
