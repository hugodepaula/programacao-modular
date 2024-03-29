package model;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Classe Produto
 * 
 * @author Hugo de Paula
 *
 */
public abstract class Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final String DESCRICAO_PADRAO = "Novo Produto";
	public static final int MAX_ESTOQUE = 1000;
	private String descricao;
	private float preco;
	private int quant;
	private LocalDateTime dataFabricacao;

	public boolean emEstoque() {
		return (quant > 0);
	}

	public abstract boolean emValidade();
	
	public String getDescricao() {
		return descricao;
	}

	public float getPreco() {
		return preco;
	}

	public int getQuant() {
		return quant;
	}

	public LocalDateTime getDataFabricacao() {
		return dataFabricacao;
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
		if (q >= 0 && q <= MAX_ESTOQUE)
			quant = q;
	}

	public void setDataFabricacao(LocalDateTime dataFabricacao) {
		// Pega a Data Atual
		LocalDateTime agora = LocalDateTime.now();
		// Garante que a data de fabrica��o n�o pode ser futura
		if (agora.compareTo(dataFabricacao) >= 0)
			this.dataFabricacao = dataFabricacao;
	}

	public Produto(String d, float p, int q, LocalDateTime f) {
		setDescricao(d);
		setPreco(p);
		setQuant(q);
		setDataFabricacao(f);
	}

	public Produto() {
		descricao = DESCRICAO_PADRAO;
		preco = 0.01F;
		quant = 0;
		dataFabricacao = LocalDateTime.now();
	}

	/**
	 * M�todo sobreposto da classe Object. � executado quando um objeto precisa
	 * ser exibido na forma de String.
	 */
	@Override
	public String toString() {
		return "Produto: " + descricao + "   Pre�o: R$" + preco + "   Quant.: " + quant + "   Fabrica��o: "
				+ dataFabricacao;
	}

	@Override
	public boolean equals(Object obj) {
		return this.descricao.equals(((Produto) obj).getDescricao());
	}
}



