package business;
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


	public Figura(int x, int y, int lado, boolean preenchido, Color cor) {
		super();
		this.x = x;
		this.y = y;
		this.lado = lado;
		this.preenchido = preenchido;
		this.cor = cor;
	}

	public abstract void desenha(Graphics g);

}
