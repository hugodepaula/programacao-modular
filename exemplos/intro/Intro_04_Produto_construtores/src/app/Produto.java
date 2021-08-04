package app;

/**
 * Classe Produto
 * 
 * Inclui construtores.
 * 
 * @author Hugo de Paula
 *
 */
class Produto {
	String descricao;
	float preco;
	int quant;

	boolean emEstoque() {
		return (quant > 0);
	}

	Produto(String d, float p, int q) {
		if (d.length() >= 3)
			descricao = d;
		if (p > 0)
			preco = p;
		if (q >= 0)
			quant = q;
	}

	Produto() {
		descricao = "Novo Produto";
		preco = 0.01F;
		quant = 0;
	}
}
