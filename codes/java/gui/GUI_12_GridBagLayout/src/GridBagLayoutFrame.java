import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * Código de Beginning Java Programming (2015) - Bart Baesens and Aimée Backiel
 * Capítulo 11
 * 
 * @author Bart Baesens and Aimée Backiel
 **/
public class GridBagLayoutFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GridLayout frame");

		frame.getContentPane().setLayout(new GridBagLayout());
		
		Map<String, JButton> buttons = makeButtons(
			"7", "8", "9", "0", "4", "5", "6", "C",
			"1", "2", "3", "=", "+", "-", "*", "/"
		);
		
		JTextField resultBox = new JTextField("*** BATTERY EMPTY ***");
		resultBox.setEditable(false);
		
		GridBagConstraints constraints = new GridBagConstraints();
		
		// Add number buttons
		constraints.fill = GridBagConstraints.BOTH;
		constraints.weightx = 1; constraints.weighty = 1;
		
		// First row
		constraints.gridy = 1;
		constraints.gridx = 0;
		frame.add(buttons.get("7"), constraints);
		constraints.gridx = 1;
		frame.add(buttons.get("8"), constraints);
		constraints.gridx = 2;
		frame.add(buttons.get("9"), constraints);
		// Second row
		constraints.gridy = 2;
		constraints.gridx = 0;
		frame.add(buttons.get("4"), constraints);
		constraints.gridx = 1;
		frame.add(buttons.get("5"), constraints);
		constraints.gridx = 2;
		frame.add(buttons.get("6"), constraints);
		// Third row
		constraints.gridy = 3;
		constraints.gridx = 0;
		frame.add(buttons.get("1"), constraints);
		constraints.gridx = 1;
		frame.add(buttons.get("2"), constraints);
		constraints.gridx = 2;
		frame.add(buttons.get("3"), constraints);
		
		// Add text field on row above
		constraints.gridy = 0;
		constraints.gridx = 0;
		constraints.gridwidth = 4;
		constraints.anchor = GridBagConstraints.PAGE_START;
		constraints.insets = new Insets(10, 4, 10, 4);
		frame.add(resultBox, constraints);
		
		// Add bottom buttons
		constraints.gridy = 4;
		constraints.gridwidth = 1;
		constraints.anchor = GridBagConstraints.PAGE_END;
		constraints.insets = new Insets(10, 0, 0, 0);
		constraints.gridx = 0;
		frame.add(buttons.get("+"), constraints);
		constraints.gridx = 1;
		frame.add(buttons.get("-"), constraints);
		constraints.gridx = 2;
		frame.add(buttons.get("*"), constraints);
		constraints.gridx = 3;
		frame.add(buttons.get("/"), constraints);
		
		// Add buttons to the right
		constraints.anchor = GridBagConstraints.LINE_END;
		constraints.gridx = 3;
		constraints.gridy = 1;
		constraints.insets = new Insets(0, 0, 0, 0);
		frame.add(buttons.get("0"), constraints);
		
		constraints.insets = new Insets(0, 10, 0, 0);
		constraints.gridy = 2;
		frame.add(buttons.get("C"), constraints);
		constraints.gridy = 3;
		frame.add(buttons.get("="), constraints);

		frame.pack();
		frame.setVisible(true);
	}
	
	private static Map<String, JButton> makeButtons(String... strings) {
		Map<String, JButton> buttons = new HashMap<>();
		for (String label : strings)
			buttons.put(label, new JButton(label));
		return buttons;
	}
}