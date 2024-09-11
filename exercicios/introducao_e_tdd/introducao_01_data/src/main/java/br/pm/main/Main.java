package br.pm.main;

import br.pm.business.Data;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Data nova = null;

		String saida = JOptionPane.showInputDialog("Digite uma data (dd/mm/aaaa)");
		if (saida != null) {
			String[] dataString = saida.split("/");
			nova = new Data(Integer.parseInt(dataString[0]), Integer.parseInt(dataString[1]),
					Integer.parseInt(dataString[2]));
			JOptionPane.showMessageDialog(null,
					"Data: " + nova.getDia() + "/" + nova.getMes() + "/" + nova.getAno() + " - " + nova.diaDaSemana());
		} else {
			nova = new Data();
			JOptionPane.showMessageDialog(null, "Data default: " + nova.getDia() + "/" + nova.getMes() + "/"
					+ nova.getAno() + " - " + nova.diaDaSemana());
		}

		nova.adicionaDias(10);
		JOptionPane.showMessageDialog(null,
				"Data + 10: " + nova.getDia() + "/" + nova.getMes() + "/" + nova.getAno() + " - " + nova.diaDaSemana());

		nova.adicionaDias(100);
		JOptionPane.showMessageDialog(null, "Data + 100: " + nova.getDia() + "/" + nova.getMes() + "/" + nova.getAno()
				+ " - " + nova.diaDaSemana());

		Data natal = new Data(25, 12, 2020);

		JOptionPane.showMessageDialog(null, "Natal:  " + natal.getDia() + "/" + natal.getMes() + "/" + natal.getAno()
				+ " - " + natal.diaDaSemana() + "\n" + natal.porExtenso());
		if (natal.anoBisexto())
			JOptionPane.showMessageDialog(null, "Ano e Bisexto");
		else
			JOptionPane.showMessageDialog(null, "Ano nao e Bisexto");

	}

}
