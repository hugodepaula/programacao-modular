
public class Pilha {
	private Produto[] vetor;
	private int num = 0;
	private int produced = 0;
	private int consumed = 0;

	public synchronized boolean empilha(Produto elemento) {
		if (num < vetor.length) {
			vetor[num++] = elemento;
			produced++;

			notifyAll();
			return true;
		} else
			return false;
	}

	public synchronized Produto desempilha() throws InterruptedException {
		while (eVazia())
			wait();
		consumed++;
		return vetor[--num];

	}

	public synchronized boolean eVazia() {
		return (num == 0);
	}

	public synchronized int getNum() {
		return num;
	}

	public synchronized int getProduced() {
		return produced;
	}

	public synchronized int getConsumed() {
		return consumed;
	}

	public Pilha() {
		vetor = new Produto[10];
	}

}
