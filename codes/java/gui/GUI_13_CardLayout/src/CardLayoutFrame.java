import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Código de Beginning Java Programming (2015) - Bart Baesens and Aimée Backiel
 * Capítulo 11
 * 
 * @author Bart Baesens and Aimée Backiel
 **/
public class CardLayoutFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("CardLayout frame");
		
		
		JPanel cardPanel = new JPanel();
		cardPanel.setLayout(new CardLayout());
		cardPanel.setPreferredSize(new Dimension(300, 400));
		
		JPanel bluePanel = new JPanel();
		JPanel redPanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		redPanel.setBackground(Color.red);
		
		cardPanel.add(bluePanel, "BLUE PANEL");
		cardPanel.add(redPanel, "RED PANEL");
		
		JPanel comboBoxPanel = new JPanel();
		String comboBoxItems[] = { "BLUE PANEL", "RED PANEL" };
		JComboBox<String> cb = new JComboBox<>(comboBoxItems);
		cb.setEditable(false);
		cb.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent evt) {
				CardLayout cl = (CardLayout)(cardPanel.getLayout());
				cl.show(cardPanel, (String)evt.getItem());
			}
		});
		comboBoxPanel.add(cb);
		
		frame.getContentPane().add(comboBoxPanel, BorderLayout.PAGE_START);
		frame.getContentPane().add(cardPanel, BorderLayout.CENTER);
		
		frame.pack();
		frame.setVisible(true);
	}
}