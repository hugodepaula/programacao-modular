import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrimeiroFrame {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Meu primeiro frame");

		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = janela.getContentPane();

		JLabel label = new JLabel("Eu sou um rótulo (componente \"JLabel\") e exibo um texto.");
		label.setForeground(Color.WHITE);
		label.setBackground(Color.BLACK);
		label.setOpaque(true);
		contentPane.add(label);

		janela.pack();
		janela.setVisible(true);

	}

}
