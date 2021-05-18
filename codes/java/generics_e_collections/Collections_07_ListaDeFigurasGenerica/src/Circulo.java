import java.awt.*;

public class Circulo extends Figura {

	public Circulo(int px, int py, int l, Color c) {
		super(px, py, l, c);
	}

	public void desenha(Graphics g) {
		Color velhaCor = g.getColor();
		g.setColor(getCor());
		if (isPreenchido())
			g.fillOval(getX(), getY(), getLado(), getLado());
		else
			g.drawOval(getX(), getY(), getLado(), getLado());
		g.setColor(velhaCor);
	}
}