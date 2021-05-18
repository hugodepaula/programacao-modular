import java.awt.*;

class ListaDeFiguras<E extends Figura> {
	private E vet[];
	private int tmax;
	private int cont;

	@SuppressWarnings("unchecked")
	public ListaDeFiguras(int t) {
		vet = (E[]) new Figura[t];
		tmax = t;
		cont = 0;
	}

	public int getCont() {
		return cont;
	}

	public void insere(E f) {
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