package business;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BemDeConsumo extends Produto {
	private LocalDate dataValidade;

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		// a data de fabricação deve ser anterior à data de validade.
		if (getDataFabricacao().isBefore(dataValidade.atStartOfDay()))
			this.dataValidade = dataValidade;
	}

	public BemDeConsumo() {
		super();
		// o default é uma validade de 3 meses.
		dataValidade = LocalDate.now().plusMonths(3);
	}

	public BemDeConsumo(String descricao, float preco, int quantidade, LocalDateTime dataFabricacao,
			LocalDate validade) throws ExcecaoEstoqueNegativo, ExcecaoEstoqueExcedido {
		super(descricao, preco, quantidade, dataFabricacao);
		setDataValidade(validade);
	}

	/**
	 * Método sobreposto da classe Object. É executado quando um objeto precisa ser
	 * exibido na forma de String.
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
