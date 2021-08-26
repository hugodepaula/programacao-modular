
public class Pilha {
	private Produto[] vetor;
	private int num = 0;
	private int produced = 0;
	private int consumed = 0;

	public boolean empilha(Produto elemento) {
		if (num < vetor.length) {
			vetor[num++] = elemento;
			produced++;
			return true;
		} else
			return false;
	}

	public Produto desempilha() {
		if (num > 0) {
			consumed++;
			return vetor[--num];
		}
		return null;
	}

	public boolean eVazia() {
		return (num == 0);
	}
	
	public int getNum() {
		return num;
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
