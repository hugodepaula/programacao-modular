package app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import business.Circulo;
import business.Figura;
import business.ListaDeFiguras;
import business.Quadrado;

@SuppressWarnings("serial")
public class Main extends JFrame {
	ListaDeFiguras lf;
	JPanel panel;
	JButton btnInsert;

	public Main() {
		super("Polimorfismo na Lista de figuras");

		panel = new JPanel() {
			public void paint(Graphics g) {
				lf.desenha(g);
			}
		};

		btnInsert = new JButton("Inserir");
		btnInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				Figura f = rand.nextBoolean()  
							? new Circulo(rand.nextInt(400), rand.nextInt(200), rand.nextInt(50), rand.nextBoolean(), new Color(rand.nextInt(240), rand.nextInt(240), rand.nextInt(240))) 
							: new Quadrado(rand.nextInt(450), rand.nextInt(200), rand.nextInt(50), rand.nextBoolean(), new Color(rand.nextInt(240), rand.nextInt(240), rand.nextInt(240)));
				lf.insere(f);
				repaint();
			}
		});

		init();

		// Configuração da tela

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(btnInsert, BorderLayout.SOUTH);
		getContentPane().add(panel, BorderLayout.CENTER);
		setBounds(50, 50, 500, 300);
		
	}

	public void init() {
		lf = new ListaDeFiguras(100);

		lf.insere(new Quadrado(10, 10, 45, true, Color.CYAN));
		lf.insere(new Quadrado(300, 100, 60, false, new Color(255, 30, 120)));
		lf.insere(new Circulo(80, 60, 34, true, Color.DARK_GRAY));

		repaint();
	}
	
	public static void main(String[] args) {
		Main mainApplication = new Main();
		mainApplication.setVisible(true);
	}
	
}
