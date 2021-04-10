package app;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import business.Estoque;
import business.Produto;

class Aplicacao {
	
	public static void adicionarProduto(Estoque lista)
	{
		String descricao, valor;
		float preco;
		int quantidade;
		
		descricao = JOptionPane.showInputDialog(null, "Digite descrição do produto:", "Cadastro de produto", JOptionPane.OK_CANCEL_OPTION);
		valor = JOptionPane.showInputDialog(null, "Digite preço do produto:", "Cadastro de produto", JOptionPane.OK_CANCEL_OPTION);
		if (valor != null)
			preco = Float.parseFloat(valor);
		else 
			preco = 0;
		valor = JOptionPane.showInputDialog(null, "Digite quantidade em estoque:", "Cadastro de produto", JOptionPane.OK_CANCEL_OPTION);
		if (valor != null)
			quantidade = Integer.parseInt(valor);
		else 
			quantidade = 0;
		
		lista.add(new Produto(descricao, preco, quantidade, LocalDateTime.now()));
	}
	
	
	public static void main(String args[]) {

		Estoque estoque = new Estoque();
		
		adicionarProduto(estoque);
		adicionarProduto(estoque);

		estoque.add(new Produto("Leite", 4.00F, 120, LocalDateTime.now()));
				
		JOptionPane.showMessageDialog(null, estoque.toString(), "Estoque de produtos", JOptionPane.INFORMATION_MESSAGE);

		Produto p = estoque.getProdutoByName("lEItE");
		p.setQuantidade(p.getQuantidade() + 200);

		JOptionPane.showMessageDialog(null, estoque.toString(), "Estoque de produtos", JOptionPane.INFORMATION_MESSAGE);

		estoque.remove("LeiTE");

		JOptionPane.showMessageDialog(null, estoque.toString(), "Estoque de produtos", JOptionPane.INFORMATION_MESSAGE);
	}
}
