package business;

public class ExcecaoEstoqueExcedido extends Exception {

	private static final long serialVersionUID = -7546139900483470139L;
	
	private int quant;
	
	public int getQuant() {
		return quant;
	}
	
	public ExcecaoEstoqueExcedido(int quant, int max) {
		super("O estoque de " + quant + " excedeu o limite de " + max + ".");
		this.quant = quant;
	}
}
