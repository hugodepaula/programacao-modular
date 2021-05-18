package app;

/**
 * Classe Produto
 * 
 * Possui apenas atributos, sem construtores ou encapsulamento.
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

	void inicializaProduto(String d, float p, int q) {
		descricao = d;
		preco = p;
		quant = q;
	}
}
