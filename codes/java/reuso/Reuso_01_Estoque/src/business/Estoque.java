package business;

/**
 * Esta classe irá armazenar uma lista de produtos em estoque.
 * 
 * @author Hugo
 *
 */
public class Estoque {
	private static final int MAX_PRODUTOS = 100;
	private Produto[] produtos;
	private int numProdutos;

	public void add(Produto produto) {
		if (numProdutos < MAX_PRODUTOS) {
			produtos[numProdutos++] = produto;
		}
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

	public Produto getProdutoByName(String descricao) {
		for (int pos = 0; pos < numProdutos; pos++) {
			if (descricao.equalsIgnoreCase(produtos[pos].getDescricao())) {
				return produtos[pos];
			}
		}
		return null; // Produto não encontrado.
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
			valor.append("Produdo: " + produtos[i].getId() + " - " + produtos[i].getDescricao() + "   Preço: R$"
					+ produtos[i].getPreco() + "   Quant.: " + produtos[i].getQuantidade() + "\n");
		return valor.toString();
	}

	public Estoque() {
		produtos = new Produto[MAX_PRODUTOS];
		numProdutos = 0;
	}
}
