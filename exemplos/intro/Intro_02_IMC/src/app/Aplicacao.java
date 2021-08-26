package app;

import javax.swing.JOptionPane;

public class Aplicacao {

	/**
	 * A Classe JOptionPane é capaz de exibir caixas de diálogo. 
	 * O método <code>JOptionPane.showInputDialog(mensagem)</code> cria uma
	 * caixa de entrada que é capaz de ler um texto do usuário.
	 * 
	 *  O método <code>Double.parseDouble</code> converte a String lida em 
	 *  um número no formato double. 
	 */
	public static void main(String[] args) {

		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: "));

		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
		
		CalculadoraIMC calcImc = new CalculadoraIMC(peso, altura);

		// calcImc.calcular();

		JOptionPane.showMessageDialog(null, "O IMC é: " + calcImc.getImc());

		if (calcImc.temSobrepeso()) {
			JOptionPane.showMessageDialog(null, "Tem sobrepeso.");
		}

	}

}
