package business;
/**
 * Classe Produto
 * 
 * Inclui encapsulamento, getters e setters.
 * 
 * @author Hugo de Paula
 *
 */
public class Produto {
	private String descricao;
	private float preco;
	private int quant;

	public boolean emEstoque() {
		return (quant > 0);
	}

	public String getDescricao() {
		return descricao;
	}

	public float getPreco() {
		return preco;
	}

	public int getQuant() {
		return quant;
	}

	public void setDescricao(String d) {
		if (d.length() >= 3)
			descricao = d;
	}

	public void setPreco(float p) {
		if (p > 0)
			preco = p;
	}

	public void setQuant(int q) {
		if (q >= 0)
			quant = q;
	}

	public Produto(String d, float p, int q) {
		setDescricao(d);
		setPreco(p);
		setQuant(q);
	}

	public Produto() {
		descricao = "Novo Produto";
		preco = 0.01F;
		quant = 0;
	}
}
