/**
 * Esta classe irá armazenar uma lista de produtos em estoque. Os produtos podem
 * ser bens duráveis ou bens de consumo.
 * 
 * @author Hugo
 * @version 2016.8.29.08
 *
 */
public class Estoque {
	private static final int MAX_PRODUTOS = 100;
	private BemDuravel[] listaDeBensDuraveis;
	private BemDeConsumo[] listaDeBensDeConsumo;
	private int numBensDuraveis, numBensDeConsumo;

	public void adicionar(BemDuravel p) {
		if (numBensDuraveis < MAX_PRODUTOS) {
			listaDeBensDuraveis[numBensDuraveis++] = p;
		}
	}

	public void adicionar(BemDeConsumo p) {
		if (numBensDeConsumo < MAX_PRODUTOS) {
			listaDeBensDeConsumo[numBensDeConsumo++] = p;
		}
	}

	public BemDuravel consultarBemDuravel(String descricao) {
		for (int pos = 0; pos < numBensDuraveis; pos++) {
			if (descricao.equalsIgnoreCase(listaDeBensDuraveis[pos].getDescricao())) {
				return listaDeBensDuraveis[pos];
			}
		}
		return null;
	}

	public BemDeConsumo consultarBemDeConsumo(String descricao) {
		for (int pos = 0; pos < numBensDeConsumo; pos++) {
			if (descricao.equalsIgnoreCase(listaDeBensDeConsumo[pos].getDescricao())) {
				return listaDeBensDeConsumo[pos];
			}
		}
		return null;
	}

	public void remover(String descricao) {
		for (int pos = 0; pos < numBensDuraveis; pos++) {
			if (descricao.equalsIgnoreCase(listaDeBensDuraveis[pos].getDescricao())) {
				// remove produto
				for (int i = pos + 1; i < numBensDuraveis; i++)
					listaDeBensDuraveis[i - 1] = listaDeBensDuraveis[i];
				listaDeBensDuraveis[numBensDuraveis-1] = null;
				numBensDuraveis--;
			}
		}
		for (int pos = 0; pos < numBensDeConsumo; pos++) {
			if (descricao.equalsIgnoreCase(listaDeBensDeConsumo[pos].getDescricao())) {
				// remove produto
				for (int i = pos + 1; i < numBensDeConsumo; i++)
					listaDeBensDeConsumo[i - 1] = listaDeBensDeConsumo[i];
				listaDeBensDeConsumo[numBensDeConsumo-1] = null;
				numBensDeConsumo--;
			}
		}
	}

	public int totalEmEstoque() {
		int total = 0;
		for (int i = 0; i < numBensDuraveis; i++)
			total += listaDeBensDuraveis[i].getQuant();
		for (int i = 0; i < numBensDeConsumo; i++)
			total += listaDeBensDeConsumo[i].getQuant();
		return total;
	}

	public float valorEmEstoque() {
		float valor = 0;
		for (int i = 0; i < numBensDuraveis; i++)
			valor += listaDeBensDuraveis[i].getQuant() * listaDeBensDuraveis[i].getPreco();
		for (int i = 0; i < numBensDeConsumo; i++)
			valor += listaDeBensDeConsumo[i].getQuant() * listaDeBensDeConsumo[i].getPreco();
		return valor;
	}

	public String exibirEstoque() {
		StringBuilder valor = new StringBuilder();
		for (int i = 0; i < numBensDuraveis; i++)
			valor.append("Produdo: " + listaDeBensDuraveis[i].getId() + " - " + listaDeBensDuraveis[i].getDescricao()
					+ "   Preço: R$" + listaDeBensDuraveis[i].getPreco() + "   Quant.: " + listaDeBensDuraveis[i].getQuant()
					+ "   Fabricação: " + listaDeBensDuraveis[i].getDataFabricacao()
					+ "   Garantia: " + listaDeBensDuraveis[i].getMesesGarantia() + "\n");
		for (int i = 0; i < numBensDeConsumo; i++)
			valor.append("Produdo: " + listaDeBensDeConsumo[i].getId() + " - " + listaDeBensDeConsumo[i].getDescricao()
					+ "   Preço: R$" + listaDeBensDeConsumo[i].getPreco() + "   Quant.: " + listaDeBensDeConsumo[i].getQuant()
					+ "   Fabricação: " + listaDeBensDeConsumo[i].getDataFabricacao()
					+ "   Validade: " + listaDeBensDeConsumo[i].getDataValidade() + "\n");
		return valor.toString();
	}

	public Estoque() {
		listaDeBensDuraveis = new BemDuravel[MAX_PRODUTOS];
		listaDeBensDeConsumo = new BemDeConsumo[MAX_PRODUTOS];
		numBensDuraveis = 0;
		numBensDeConsumo = 0;
	}
}
