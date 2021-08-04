package business;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Classe Produto
 * 
 * @author Hugo de Paula
 *
 */
public class Produto {
	public static final String DESCRICAO_PADRAO = "Novo Produto";
	public static final int MAX_ESTOQUE = 1000;
	private int id;
	private String descricao;
	private float preco;
	private int quantidade;
	private LocalDateTime dataFabricacao;

	private static int cont = 0;
	private static int instancias = 0;

	public static int getCont() {
		return cont;
	}
	
	public static int getInstancias() {
		return instancias;
	}

	public int getId() {
		return id;
	}

	public boolean emEstoque() {
		return (quantidade > 0);
	}

	public String getDescricao() {
		return descricao;
	}

	public float getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public LocalDateTime getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDescricao(String quantidade) {
		if (quantidade.length() >= 3)
			this.descricao = quantidade;
	}

	public void setPreco(float preco) {
		if (preco > 0)
			this.preco = preco;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade >= 0 && quantidade <= MAX_ESTOQUE)
			this.quantidade = quantidade;
	}


	public void setDataFabricacao(LocalDateTime dataFabricacao) {
		// Pega a Data Atual
		LocalDateTime agora = LocalDateTime.now();
		// Garante que a data de fabricação não pode ser futura
		if (agora.compareTo(dataFabricacao) >= 0)
			this.dataFabricacao = dataFabricacao;
	}


	public Produto(String descricao, float preco, int quantidade, LocalDateTime dataFabricacao) {
		setDescricao(descricao);
		setPreco(preco);
		setQuantidade(quantidade);
		setDataFabricacao(dataFabricacao);

		id = ++cont;
		instancias++;
	}

	public Produto() {
		descricao = DESCRICAO_PADRAO;
		preco = 0.01F;
		quantidade = 0;
		dataFabricacao = LocalDateTime.now();

		id = ++cont;
		instancias++;
	}
	
	/**
	 * Método sobreposto da classe Object.
	 * É executado quando um objeto precisa ser exibido na forma de String.
	 */
	@Override
	public String toString() {
		return "Produto: " + id + " - " + descricao
		   + "   Preço: R$" + preco + "   Quant.: " + quantidade
		   + "   Fabricação: " + dataFabricacao.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
	}



	/**
	 * É executado quando um objeto está sendo removido da memória.
	 */
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalizando um produto.");
		instancias--;
	}
	
	
}
