import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * Código de Beginning Java Programming (2015) - Bart Baesens and Aimée Backiel
 * Capítulo 11
 * 
 * @author Bart Baesens and Aimée Backiel
 **/
public class TabbedFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tabbed frame");
		
		JTabbedPane cardTabs = new JTabbedPane();
		cardTabs.setPreferredSize(new Dimension(300, 400));
		
		JPanel bluePanel = new JPanel();
		JPanel redPanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		redPanel.setBackground(Color.red);
		
		cardTabs.add(bluePanel, "BLUE PANEL");
		cardTabs.add(redPanel, "RED PANEL");
		
		frame.getContentPane().add(cardTabs, BorderLayout.CENTER);
		
		frame.pack();
		frame.setVisible(true);
	}
}