import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * C�digo de Beginning Java Programming (2015) - Bart Baesens and Aim�e Backiel
 * Cap�tulo 11
 * 
 * @author Bart Baesens and Aim�e Backiel
 **/
public class BorderLayoutFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("BorderLayout frame");
		
		/* Como o Layyout padr�o de componentes com bordas j� � o BorderLayout, 
		 * ent�o a linha a seguir � desnecess�ria. 
		 */
		frame.getContentPane().setLayout(new BorderLayout());
		
		frame.getContentPane().add(new JButton("NORTH"),  BorderLayout.NORTH);
		// ... or BorderLayout.PAGE_START

		frame.getContentPane().add(new JButton("WEST"),   BorderLayout.WEST);
		// ... or BorderLayout.LINE_START

		frame.getContentPane().add(new JButton("EAST"),   BorderLayout.EAST);
		// ... or BorderLayout.LINE_END

		frame.getContentPane().add(new JButton("SOUTH"),  BorderLayout.SOUTH);
		// ... or BorderLayout.PAGE_END

		frame.getContentPane().add(new JButton("CENTER"), BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
}