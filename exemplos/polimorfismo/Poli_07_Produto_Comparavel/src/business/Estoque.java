package business;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Esta classe irá armazenar uma lista de produtos em estoque. Os produtos podem
 * ser bens duráveis ou bens de consumo.
 * 
 * @author Hugo
 *
 */
public class Estoque {
	private static final int MAX_PRODUTOS = 100;
	private Produto[] produtos;
	private int numProdutos;

	public void add(Produto p) {
		if (numProdutos < MAX_PRODUTOS) {
			produtos[numProdutos++] = p;
		}
	}

	public Produto getByName(String descricao) {
		for (int pos = 0; pos < numProdutos; pos++) {
			if (descricao.equalsIgnoreCase(produtos[pos].getDescricao())) {
				return produtos[pos];
			}
		}
		return null;
	}

	public void remove(String descricao) {
		for (int pos = 0; pos < numProdutos; pos++) {
			if (descricao.equalsIgnoreCase(produtos[pos].getDescricao())) {
				// remove produto
				for (int i = pos + 1; i < numProdutos; i++)
					produtos[i - 1] = produtos[i];
				produtos[numProdutos - 1] = null;
				numProdutos--;
			}
		}
	}

	public int totalEmEstoque() {
		int total = 0;
		for (int i = 0; i < numProdutos; i++)
			total += produtos[i].getQuantidade();
		return total;
	}

	public float valorEmEstoque() {
		float valor = 0;
		for (int i = 0; i < numProdutos; i++)
			valor += produtos[i].getQuantidade() * produtos[i].getPreco();
		return valor;
	}

	@Override
	public String toString() {
		StringBuilder valor = new StringBuilder();
		for (int i = 0; i < numProdutos; i++)
			valor.append(produtos[i] + "\n");
		return valor.toString();
	}

	public void ordenar() {
		Arrays.sort(produtos, 0, numProdutos);
	}

	private class OrdenarPorQuantidade implements Comparator<Produto> {

		@Override
		public int compare(Produto o1, Produto o2) {
			return Integer.compare(o1.getQuantidade(), o2.getQuantidade());
		}

	}

	public void ordenarPorQuantidade() {
		Arrays.sort(produtos, 0, numProdutos, new OrdenarPorQuantidade());
	}

	public void ordenarPorFabricacao() {
		Arrays.sort(produtos, 0, numProdutos, new Comparator<Produto>() {
			@Override
			public int compare(Produto o1, Produto o2) {
				return o1.getDataFabricacao().compareTo(o2.getDataFabricacao());
			}
		});
	}

	public void ordenarPorPreco() {
		Arrays.sort(produtos, 0, numProdutos, (o1, o2) -> Float.compare(o1.getPreco(), o2.getPreco()));
	}

	public Estoque() {
		produtos = new Produto[MAX_PRODUTOS];
		numProdutos = 0;
	}

}
