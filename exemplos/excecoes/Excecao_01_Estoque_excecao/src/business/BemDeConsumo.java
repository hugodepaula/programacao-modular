package business;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Classe BemDeConsumo
 * 
 * @author Hugo de Paula
 *
 */
public class BemDeConsumo extends Produto {
	private LocalDate dataValidade;

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		// a data de fabrica��o deve ser anterior � data de validade.
		if (getDataFabricacao().isBefore(dataValidade.atStartOfDay()))
			this.dataValidade = dataValidade;
	}

	public BemDeConsumo() {
		super();
		// o default � uma validade de 6 meses.
		dataValidade = LocalDate.now().plusMonths(6);
	}

	public BemDeConsumo(String d, float p, int q, LocalDateTime f, LocalDate v)  throws ExcecaoEstoqueNegativo, ExcecaoEstoqueExcedido  {
		super(d, p, q, f);
		setDataValidade(v);
	}

	/**
	 * M�todo sobreposto da classe Object. � executado quando um objeto precisa
	 * ser exibido na forma de String.
	 */
	@Override
	public String toString() {
		return super.toString() + "   Data de Validade: " + dataValidade;
	}

	@Override
	public boolean emValidade() {
		return LocalDateTime.now().isBefore(this.getDataValidade().atTime(23, 59));
	}

}
