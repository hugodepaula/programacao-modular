package business;

public class ExcecaoEstoqueNegativo extends Exception {
	
	private static final long serialVersionUID = -1247269667828514123L;

	public ExcecaoEstoqueNegativo() {
		super("O estoque deve possuir um valor positivo.");
	}

}
