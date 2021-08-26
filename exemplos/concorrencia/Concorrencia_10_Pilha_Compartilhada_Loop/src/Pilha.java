
public class Pilha {
	private Produto[] vetor;
	private int count = 0;
	private int produced = 0;
	private int consumed = 0;

	public boolean empilha(Produto elemento) {
		if (count < vetor.length) {
			vetor[count++] = elemento;
			produced++;
			return true;
		} else
			return false;
	}

	public Produto desempilha() {
		if (count > 0) {
			consumed++;
			return vetor[--count];
		}
		return null;
	}

	public boolean eVazia() {
		return (count == 0);
	}
	
	public int getCount() {
		return count;
	}
	
	public int getProduced() {
		return produced;
	}
	
	public int getConsumed() {
		return consumed;
	}
	
	public Pilha() {
		vetor = new Produto[10];
	}
	
	

}
