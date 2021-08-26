package app;

public class Conjunto {
	private int tamanho = 0;
	public static final int MAX = 10;
	private Object[] items = new Object[MAX];

	public int getTamanho() {
		return tamanho;
	}

	public boolean contem(Object object) {
		for (int i = 0; i < tamanho; i++) {
			if (items[i] == object) {
				return true;
			}
		}
		return false;
	}

	public void adicionar(Object object) {
		if (!contem(object))
			items[tamanho++] = object;
	}

}
