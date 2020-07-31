import java.awt.*;

public abstract class Figura {
	private int x, y, lado;
	private boolean preenchido;
	private Color cor;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}

	public boolean isPreenchido() {
		return preenchido;
	}

	public void setPreenchido(boolean preenchido) {
		this.preenchido = preenchido;
	}

	public Figura(int px, int py, int l, Color c) {
		x = px;
		y = py;
		lado = l;
		cor = c;
	}

	public abstract void desenha(Graphics g);

}
