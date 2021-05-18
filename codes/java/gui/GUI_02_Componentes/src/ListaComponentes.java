import java.awt.*;
import javax.swing.*;

public class ListaComponentes {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Lista componentes");

		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cPane = janela.getContentPane();
		cPane.setLayout(new FlowLayout());

		cPane.add(new JButton("JButton"));
		cPane.add(new JLabel("JLabel"));
		cPane.add(new JList<String>(new String[] { "JList-1", "JList-2" }));
		cPane.add(new JProgressBar(0, 100));
		cPane.add(new JScrollBar(JScrollBar.HORIZONTAL, 50, 20, 1, 500));
		cPane.add(new JSlider(0, 100, 33));
		cPane.add(new JSpinner());
		cPane.add(new JTextField("JTextField"));
		cPane.add(new JTextArea("JTextArea"));
		cPane.add(new JComboBox<String>(new String[] { "JComboBox-1", "JComboBox-2" }));
		cPane.add(new JCheckBox("JCheckBox"));
		cPane.add(new JRadioButton("JRadioButton"));
		janela.pack();
		janela.setVisible(true);
		
	}

}
