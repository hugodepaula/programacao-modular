import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;

class Aplicacao {

	public static void adicionarProduto(Estoque lista) {
		String desc, valor;
		float preco;
		int quant;
		int op;

		desc = JOptionPane.showInputDialog(null, "Digite descrição do produto:", "Cadastro de produto",
				JOptionPane.OK_CANCEL_OPTION);
		valor = JOptionPane.showInputDialog(null, "Digite preço do produto:", "Cadastro de produto",
				JOptionPane.OK_CANCEL_OPTION);
		if (valor != null)
			preco = Float.parseFloat(valor);
		else
			preco = 0;

		valor = JOptionPane.showInputDialog(null, "Digite quantidade em estoque:", "Cadastro de produto",
				JOptionPane.OK_CANCEL_OPTION);
		if (valor != null)
			quant = Integer.parseInt(valor);
		else
			quant = 0;

		valor = JOptionPane.showInputDialog(null, "Qual produto deseja adicionar: 1 - Bem durável, 2 - Bem de consumo.",
				"Cadastro de produto", JOptionPane.OK_CANCEL_OPTION);
		if (valor != null) {
			op = Integer.parseInt(valor);

			if (op == 1) {
				lista.adicionar(new BemDuravel(desc, preco, quant, LocalDateTime.now(), 12));
			} else if (op == 2) {
				lista.adicionar(new BemDeConsumo(desc, preco, quant, LocalDateTime.now(), LocalDate.now().plusMonths(12)));
			}
		}

	}

	public static void main(String args[]) {

		Estoque estoque = new Estoque();

		adicionarProduto(estoque);
		adicionarProduto(estoque);

		estoque.adicionar(new BemDeConsumo("Leite", 4.00F, 120, LocalDateTime.now(), LocalDate.now().plusMonths(6)));
		
		JOptionPane.showMessageDialog(null, estoque, "Estoque de produtos",
				JOptionPane.INFORMATION_MESSAGE);

		Produto p = estoque.consultar("lEItE");
		p.setQuant(p.getQuant() + 200);

		if (p.emValidade())
			JOptionPane.showMessageDialog(null, "Leite dentro da validade.", "Estoque de produtos", JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "Leite esta vencido.", "Estoque de produtos", JOptionPane.INFORMATION_MESSAGE);
			
		estoque.remover("LeiTE");

		JOptionPane.showMessageDialog(null, estoque, "Estoque de produtos", JOptionPane.INFORMATION_MESSAGE);
	}
}
