package business;
import java.awt.*;

public class ListaDeFiguras {
	private Figura vet[];
	private int tmax;
	private int cont;

	public ListaDeFiguras(int t) {
		vet = new Figura[t];
		tmax = t;
		cont = 0;
	}

	public int getCont() {
		return cont;
	}

	public void insere(Figura f) {
		if (cont == tmax)
			return;
		vet[cont] = f;
		cont++;
	}

	public void remove() {
		if (cont == 0)
			return;
		cont--;
		vet[cont] = null;
	}

	public void desenha(Graphics g) {
		for (int i = 0; i < cont; i++)
			vet[i].desenha(g);
	}
}