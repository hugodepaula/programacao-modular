package business;

import java.time.LocalDateTime;

/**
 * Classe Produto
 * 
 * @author Hugo de Paula
 *
 */
public abstract class Produto {
	public static final String DESCRICAO_PADRAO = "Novo Produto";
	public static final int MAX_ESTOQUE = 1000;
	private int id;
	private String descricao;
	private float preco;
	private int quantidade;
	private LocalDateTime dataFabricacao;

	private static int cont = 0;
	private static int instancias = 0;


	public abstract boolean emValidade();

	
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
		// Garante que a data de fabrica��o n�o pode ser futura
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
	 * M�todo sobreposto da classe Object.
	 * � executado quando um objeto precisa ser exibido na forma de String.
	 */
	@Override
	public String toString() {
		return "Produdo: " + id + " - " + descricao
		   + "   Pre�o: R$" + preco + "   Quant.: " + quantidade
		   + "   Fabrica��o: " + dataFabricacao;
	}



	/**
	 * � executado quando um objeto est� sendo removido da mem�ria.
	 */
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalizando um produto.");
		instancias--;
	}
	
	
}
