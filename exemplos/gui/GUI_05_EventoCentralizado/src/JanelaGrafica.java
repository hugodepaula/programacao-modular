import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JanelaGrafica extends JFrame implements ActionListener {
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
		
		butOk.addActionListener(this);
		butCancel.addActionListener(this);

		// Adiciona os componentes a janela ou container
		cPane.add(texto);
		cPane.add(campo);
		cPane.add(butOk);
		cPane.add(butCancel);

		// Ajusta tamanho/janela conforme os componentes
		this.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	       System.out.println("Item: " + e.getActionCommand());
	       String componente = e.getActionCommand();
	       if (componente.equals("Ok")) {
	    	   JOptionPane.showMessageDialog(this, "Bem vindo, " + campo.getText() + ".", "Boas vindas", JOptionPane.PLAIN_MESSAGE);
	       } else
	       {
	    	   campo.setText("");
	       }
	}
}
