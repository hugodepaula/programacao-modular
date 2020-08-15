package app;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GUIClock extends JFrame implements Sleeper {

	private static final long serialVersionUID = 1L;
	private static Despertador alarmClock;
	
	public GUIClock() {
		super("Dorminhoco");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		setBounds(400, 300, 300, 100);
		
		getContentPane().add(new JPanel() {
			private static final long serialVersionUID = 1L;

			public void paint(Graphics g) {
				g.drawString(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")), 10, 20);
			}
		}, BorderLayout.CENTER);
		
		alarmClock = new Despertador();
		alarmClock.letMeSleepFor(this, Sleeper.ONE_SECOND);

	}


	public void wakeUp() {
		repaint();
		alarmClock.letMeSleepFor(this, Sleeper.ONE_SECOND);
	}

}
