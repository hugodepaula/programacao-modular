package app;
import javax.swing.JOptionPane;

import business.Estoque;
import business.Produto;

class Aplicacao {
	
	public static void adicionarProduto(Estoque lista)
	{
		String desc, valor;
		float preco;
		int quant;
		
		desc = JOptionPane.showInputDialog(null, "Digite descrição do produto:", "Cadastro de produto", JOptionPane.OK_CANCEL_OPTION);
		valor = JOptionPane.showInputDialog(null, "Digite preço do produto:", "Cadastro de produto", JOptionPane.OK_CANCEL_OPTION);
		if (valor != null)
			preco = Float.parseFloat(valor);
		else 
			preco = 0;
		valor = JOptionPane.showInputDialog(null, "Digite quantidade em estoque:", "Cadastro de produto", JOptionPane.OK_CANCEL_OPTION);
		if (valor != null)
			quant = Integer.parseInt(valor);
		else 
			quant = 0;
		
		lista.addProduto(new Produto(desc, preco, quant));
	}
	
	
	public static void main(String args[]) {

		Estoque estoque = new Estoque();
		
		adicionarProduto(estoque);
		adicionarProduto(estoque);

		estoque.addProduto(new Produto("Leite", 4.00F, 120));
				
		JOptionPane.showMessageDialog(null, estoque.toString(), "Estoque de produtos", JOptionPane.INFORMATION_MESSAGE);

		Produto p = estoque.getProdutoByName("lEItE");
		p.setQuant(p.getQuant() + 200);

		JOptionPane.showMessageDialog(null, estoque.toString(), "Estoque de produtos", JOptionPane.INFORMATION_MESSAGE);

		estoque.removeProduto("LeiTE");

		JOptionPane.showMessageDialog(null, estoque.toString(), "Estoque de produtos", JOptionPane.INFORMATION_MESSAGE);
	}
}
