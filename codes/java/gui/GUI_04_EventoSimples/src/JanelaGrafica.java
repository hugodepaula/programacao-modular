import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JanelaGrafica extends JFrame {
	private static final long serialVersionUID = 1L;
	private JButton butOK;
	private JTextField campo;
	private JLabel texto;

	public JanelaGrafica() {
		super("Aplicacao grafica simples");

		Container cPane = this.getContentPane();

		// Define layout do container
		cPane.setLayout(new FlowLayout());

		this.addWindowListener(new AppListener());

		// Cria os componentes
		texto = new JLabel("Nome:");
		campo = new JTextField(15);
		butOK = new JButton("OK");

		// Adiciona os componentes a janela ou container
		cPane.add(texto);
		cPane.add(campo);
		cPane.add(butOK);

		// Adciona um listener para o botão de OK
		butOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText(campo.getText());
				// Copia conteúdo digitado para o label
			}
		});

		// Ajusta tamanho/janela conforme os componentes
		this.pack();
	}

	private class AppListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}
