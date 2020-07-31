package business;

@SuppressWarnings("serial")
public class ExcecaoEstoqueNegativo extends Exception {
	
	public ExcecaoEstoqueNegativo() {
		super("O estoque deve possuir um valor positivo.");
	}

}
