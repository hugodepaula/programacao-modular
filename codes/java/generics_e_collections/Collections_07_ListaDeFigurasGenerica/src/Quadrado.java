import java.awt.*;

public class Quadrado extends Figura {

	public Quadrado(int px, int py, int l, Color c) {
		super(px, py, l, c);
	}

	public void desenha(Graphics g) {
		Color velhaCor = g.getColor();
		g.setColor(getCor());
		if (isPreenchido())
			g.fillRect(getX(), getY(), getLado(), getLado());
		else
			g.drawRect(getX(), getY(), getLado(), getLado());
		g.setColor(velhaCor);
	}
}