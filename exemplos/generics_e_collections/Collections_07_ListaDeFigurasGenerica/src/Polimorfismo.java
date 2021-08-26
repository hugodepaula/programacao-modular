

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class Polimorfismo extends JFrame {
	
	ListaDeFiguras<Quadrado> lq;
	ListaDeFiguras<Circulo> lc;
	Button inserir;

	public Polimorfismo() {
		super("Lista de Figuras com Collections");

		lq = new ListaDeFiguras<Quadrado>(100);
		lc = new ListaDeFiguras<Circulo>(100);

		inserir = new Button("Inserir");
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(inserir, BorderLayout.SOUTH);

		inserir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Circulo c = new Circulo((int) Math.round((Math.random() * 500)),
						                (int) Math.round((Math.random() * 400)), 
						                (int) Math.round((Math.random() * 35 + 15)),
						           new Color((int) Math.round((Math.random() * 250)), 
							                 (int) Math.round((Math.random() * 250)),
								             (int) Math.round((Math.random() * 250))));
				c.setPreenchido(true);
				lc.insere(c);
				
				Quadrado q = new Quadrado((int) Math.round((Math.random() * 500)),
		                (int) Math.round((Math.random() * 400)), 
		                (int) Math.round((Math.random() * 35 + 15)),
		           new Color((int) Math.round((Math.random() * 250)), 
			                 (int) Math.round((Math.random() * 250)),
				             (int) Math.round((Math.random() * 250))));
				
				q.setPreenchido(true);
				lq.insere(q);
				repaint();
			}
		});
		// Posiciona uma janela de 300 x 300 pixels de dimensão
		// no meio da tela.
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		this.setBounds(screenSize.width  / 2 - 150, 
					   screenSize.height / 2 - 150, 300, 300);
		this.setSize(500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public void paint(Graphics g) {
		lc.desenha(g);
		lq.desenha(g);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		      new Polimorfismo().setVisible(true);
		    }
		  });
	}
}

