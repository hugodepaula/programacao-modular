package business;
/**
 * Esta classe irá armazenar uma lista de produtos em estoque.
 * 
 * @author Hugo
 *
 */
public class Estoque {
	private static final int MAX_PRODUTOS = 100;
	private Produto[] listaDeProdutos;
	private int numProdutos;

	public void adicionar(Produto p) {
		if (numProdutos < MAX_PRODUTOS) {
			listaDeProdutos[numProdutos++] = p;
		}
	}

	public void remover(String descricao) {
		for (int pos = 0; pos < numProdutos; pos++) {
			if (descricao.equalsIgnoreCase(listaDeProdutos[pos].getDescricao())) {
				// remove produto
				for (int i = pos + 1; i < numProdutos; i++)
					listaDeProdutos[i - 1] = listaDeProdutos[i];
				listaDeProdutos[numProdutos - 1] = null;
				numProdutos--;
			}
		}
	}

	public Produto consultar(String descricao) {
		for (int pos = 0; pos < numProdutos; pos++) {
			if (descricao.equalsIgnoreCase(listaDeProdutos[pos].getDescricao())) {
				return listaDeProdutos[pos];
			}
		}
		return null; // Produto não encontrado.
	}

	public int totalEmEstoque() {
		int total = 0;
		for (int i = 0; i < numProdutos; i++)
			total += listaDeProdutos[i].getQuant();
		return total;
	}

	public float valorEmEstoque() {
		float valor = 0;
		for (int i = 0; i < numProdutos; i++)
			valor += listaDeProdutos[i].getQuant() * listaDeProdutos[i].getPreco();
		return valor;
	}

	public String exibirEstoque() {
		StringBuilder valor = new StringBuilder();
		for (int i = 0; i < numProdutos; i++)
			valor.append("Produdo: "    + listaDeProdutos[i].getId() + " - " + listaDeProdutos[i].getDescricao() 
					   + "   Preço: R$" + listaDeProdutos[i].getPreco() 
					   + "   Quant.: "  + listaDeProdutos[i].getQuant() + "\n");
		return valor.toString();
	}

	public Estoque() {
		listaDeProdutos = new Produto[MAX_PRODUTOS];
		numProdutos = 0;
	}
}
