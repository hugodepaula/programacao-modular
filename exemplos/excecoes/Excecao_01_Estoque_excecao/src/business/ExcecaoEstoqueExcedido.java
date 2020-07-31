package business;

@SuppressWarnings("serial")
public class ExcecaoEstoqueExcedido extends Exception {
	private int quant;
	
	public int getQuant() {
		return quant;
	}
	
	public ExcecaoEstoqueExcedido(int quant, int max) {
		super("O estoque de " + quant + " excedeu o limite de " + max + ".");
		this.quant = quant;
	}
}
