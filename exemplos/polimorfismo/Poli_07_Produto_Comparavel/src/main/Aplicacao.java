package main;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import app.BemDeConsumo;
import app.BemDuravel;
import app.Estoque;

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
				lista.adicionar(
						new BemDeConsumo(desc, preco, quant, LocalDateTime.now(), LocalDate.now().plusMonths(12)));
			}
		}

	}

	public static void main(String args[]) {

		Estoque estoque = new Estoque();

		estoque.adicionar(new BemDeConsumo("Leite", 2.86F, 150, LocalDateTime.now(), LocalDate.now().plusMonths(12)));
		estoque.adicionar(new BemDuravel("Televisao", 2490.00F, 20, LocalDateTime.now(), 36));
		estoque.adicionar(new BemDuravel("Notebook", 1200.00F, 10, LocalDateTime.now(), 12));
		estoque.adicionar(new BemDeConsumo("Pao", 12.990F, 320, LocalDateTime.now(), LocalDate.now().plusMonths(1)));
		estoque.adicionar(new BemDeConsumo("Manteiga", 13.00F, 200, LocalDateTime.now(), LocalDate.now().plusMonths(4)));
		estoque.adicionar(new BemDuravel("Geladeira", 3000.00F, 80, LocalDateTime.now(), 24));
		estoque.adicionar(new BemDeConsumo("Queijo", 30.00F, 220, LocalDateTime.now(), LocalDate.now().plusMonths(2)));
		estoque.adicionar(new BemDeConsumo("Arroz", 15.00F, 90, LocalDateTime.now(), LocalDate.now().plusMonths(12)));

		JOptionPane.showMessageDialog(null, estoque, "Estoque de produtos", JOptionPane.INFORMATION_MESSAGE);

		estoque.ordenar();

		JOptionPane.showMessageDialog(null, estoque, "Estoque de produtos", JOptionPane.INFORMATION_MESSAGE);
	}
}
