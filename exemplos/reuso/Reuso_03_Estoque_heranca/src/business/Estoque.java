package business;
/**
 * Esta classe irá armazenar uma lista de produtos em estoque. Os produtos podem
 * ser bens duráveis ou bens de consumo.
 * 
 * @author Hugo
 *
 */
public class Estoque {
	private static final int MAX_PRODUTOS = 100;
	private BemDuravel[] bensDuraveis;
	private BemDeConsumo[] bensDeConsumo;
	private int numBensDuraveis, numBensDeConsumo;

	public void add(BemDuravel p) {
		if (numBensDuraveis < MAX_PRODUTOS) {
			bensDuraveis[numBensDuraveis++] = p;
		}
	}

	public void add(BemDeConsumo p) {
		if (numBensDeConsumo < MAX_PRODUTOS) {
			bensDeConsumo[numBensDeConsumo++] = p;
		}
	}

	public BemDuravel getBemDuravelByName(String descricao) {
		for (int pos = 0; pos < numBensDuraveis; pos++) {
			if (descricao.equalsIgnoreCase(bensDuraveis[pos].getDescricao())) {
				return bensDuraveis[pos];
			}
		}
		return null;
	}

	public BemDeConsumo getBemDeConsumoByName(String descricao) {
		for (int pos = 0; pos < numBensDeConsumo; pos++) {
			if (descricao.equalsIgnoreCase(bensDeConsumo[pos].getDescricao())) {
				return bensDeConsumo[pos];
			}
		}
		return null;
	}

	public void remove(String descricao) {
		for (int pos = 0; pos < numBensDuraveis; pos++) {
			if (descricao.equalsIgnoreCase(bensDuraveis[pos].getDescricao())) {
				// remove produto
				for (int i = pos + 1; i < numBensDuraveis; i++)
					bensDuraveis[i - 1] = bensDuraveis[i];
				bensDuraveis[numBensDuraveis-1] = null;
				numBensDuraveis--;
			}
		}
		for (int pos = 0; pos < numBensDeConsumo; pos++) {
			if (descricao.equalsIgnoreCase(bensDeConsumo[pos].getDescricao())) {
				// remove produto
				for (int i = pos + 1; i < numBensDeConsumo; i++)
					bensDeConsumo[i - 1] = bensDeConsumo[i];
				bensDeConsumo[numBensDeConsumo-1] = null;
				numBensDeConsumo--;
			}
		}
	}

	public int totalEmEstoque() {
		int total = 0;
		for (int i = 0; i < numBensDuraveis; i++)
			total += bensDuraveis[i].getQuantidade();
		for (int i = 0; i < numBensDeConsumo; i++)
			total += bensDeConsumo[i].getQuantidade();
		return total;
	}

	public float valorEmEstoque() {
		float valor = 0;
		for (int i = 0; i < numBensDuraveis; i++)
			valor += bensDuraveis[i].getQuantidade() * bensDuraveis[i].getPreco();
		for (int i = 0; i < numBensDeConsumo; i++)
			valor += bensDeConsumo[i].getQuantidade() * bensDeConsumo[i].getPreco();
		return valor;
	}

	@Override
	public String toString() {
		StringBuilder valor = new StringBuilder();
		for (int i = 0; i < numBensDuraveis; i++)
			valor.append("Produdo: " + bensDuraveis[i].getId() + " - " + bensDuraveis[i].getDescricao()
					+ "   Preço: R$" + bensDuraveis[i].getPreco() + "   Quant.: " + bensDuraveis[i].getQuantidade()
					+ "   Fabricação: " + bensDuraveis[i].getDataFabricacao()
					+ "   Garantia: " + bensDuraveis[i].getMesesGarantia() + "\n");
		for (int i = 0; i < numBensDeConsumo; i++)
			valor.append("Produdo: " + bensDeConsumo[i].getId() + " - " + bensDeConsumo[i].getDescricao()
					+ "   Preço: R$" + bensDeConsumo[i].getPreco() + "   Quant.: " + bensDeConsumo[i].getQuantidade()
					+ "   Fabricação: " + bensDeConsumo[i].getDataFabricacao()
					+ "   Validade: " + bensDeConsumo[i].getDataValidade() + "\n");
		return valor.toString();
	}

	public Estoque() {
		bensDuraveis = new BemDuravel[MAX_PRODUTOS];
		bensDeConsumo = new BemDeConsumo[MAX_PRODUTOS];
		numBensDuraveis = 0;
		numBensDeConsumo = 0;
	}
}
