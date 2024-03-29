package business;
/**
 * Classe Produto
 * 
 * Coletor de lixo e m�todo finalize.
 * 
 * @author Hugo de Paula
 *
 */
public class Produto {
	public static final String DESCRICAO_PADRAO = "Novo Produto";
	public static final int MAX_ESTOQUE = 1000;
	private String descricao;
	private float preco;
	private int quant;
	private int id;

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
		if (q >= 0 && q <= MAX_ESTOQUE)
			quant = q;
	}

	public Produto(String d, float p, int q) {
		setDescricao(d);
		setPreco(p);
		setQuant(q);

		id = ++cont;
		instancias++;
	}

	public Produto() {
		descricao = DESCRICAO_PADRAO;
		preco = 0.01F;
		quant = 0;

		id = ++cont;
		instancias++;
	}

	/**
	 * � executado quando um objeto est� sendo removido da mem�ria.
	 */
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalizando o produto " + this.id + "...");
		instancias--;
	}
	

	
}
