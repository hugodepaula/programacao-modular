package app;
import javax.swing.JOptionPane;

import business.Produto;

class Aplicacao {
	public static void main(String args[]) {

		System.out.println("\nCont. prods: " + Produto.getCont());

		Produto p1 = new Produto();

		System.out.println("\nCont. prods: " + Produto.getCont());

		Produto p2 = new Produto("Shulambs", 1.99F, 600);

		System.out.println("\nCont. prods: " + Produto.getCont());

		p1.setDescricao("Cool Shulambs");
		p1.setPreco(2.49F);
		p1.setQuant(10);

		JOptionPane.showMessageDialog(null, "Produto id: " + p1.getId() 
		 + "\nDescrição:  " + p1.getDescricao()
		 + "\nPreço:      " + p1.getPreco()
		 + "\nEstoque:    " + p1.getQuant(), "Dados do produto", JOptionPane.INFORMATION_MESSAGE);

	
		if (p1.emEstoque())
			JOptionPane.showMessageDialog(null,"Produto em estoque.", "Dados do produto", JOptionPane.INFORMATION_MESSAGE);

		int novosProdutos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos produtos deseja adicionar ao estoque:", "Controle de estoque", JOptionPane.OK_CANCEL_OPTION));

		if ((p2.getQuant() + novosProdutos) > Produto.MAX_ESTOQUE) {
			JOptionPane.showMessageDialog(null, "Estourou o limite máximo do estoque.", "Erro alterando estoque", JOptionPane.ERROR_MESSAGE);
		} else {
			p2.setQuant(p2.getQuant() + novosProdutos);
		}

		JOptionPane.showMessageDialog(null, "Produto id: " + p2.getId() 
		 + "\nDescrição:  " + p2.getDescricao()
		 + "\nPreço:      " + p2.getPreco()
		 + "\nEstoque:    " + p2.getQuant(), "Dados do produto", JOptionPane.INFORMATION_MESSAGE);

	}
}
