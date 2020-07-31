import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Código de Beginning Java Programming (2015) - Bart Baesens and Aimée Backiel
 * Capítulo 11
 * 
 * @author Bart Baesens and Aimée Backiel
 **/
public class GridLayoutFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GridLayout frame");

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 4));
		
		addButtons(buttonPanel, 
			"7", "8", "9", "0", "4", "5", "6", "C",
			"1", "2", "3", "=", "+", "-", "*", "/"
		);
		
		JTextField resultBox = new JTextField("*** BATTERY EMPTY ***");
		resultBox.setEditable(false); // Prevent user editing
		
		frame.getContentPane().add(buttonPanel, BorderLayout.CENTER);
		frame.getContentPane().add(resultBox, BorderLayout.NORTH);

		frame.pack();
		frame.setVisible(true);
	}

	private static void addButtons(Container contentPane, String... strings) {
		for (String label : strings) {
			contentPane.add(new JButton(label));
		}
	}
}