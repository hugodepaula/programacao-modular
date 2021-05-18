import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JanelaGrafica extends JFrame {
	private static final long serialVersionUID = 1L;
	private JButton butOk;
	private JButton butCancel;
	private JTextField campo;
	private JLabel texto;

	public JanelaGrafica() {
		super("Aplicacao grafica simples");
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cPane = this.getContentPane();

		// Define layout do container
		cPane.setLayout(new FlowLayout());

		// Cria os componentes
		texto = new JLabel("Nome:");
		campo = new JTextField(15);
		butOk = new JButton("Ok");
		butCancel = new JButton("Cancel");
		
		butOk.addActionListener(new ButOkEvent());
		butCancel.addActionListener(new ButCancelEvent());

		// Adiciona os componentes a janela ou container
		cPane.add(texto);
		cPane.add(campo);
		cPane.add(butOk);
		cPane.add(butCancel);

		// Ajusta tamanho/janela conforme os componentes
		this.pack();
	}

	class ButOkEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
	    	   JOptionPane.showMessageDialog(null, "Bem vindo, " + campo.getText() + ".", "Boas vindas", JOptionPane.PLAIN_MESSAGE);
		}
	}
	
	class ButCancelEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
	    	   campo.setText("");
		}
	}
}
