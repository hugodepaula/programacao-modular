package business;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
		// o default � uma validade de 3 meses.
		dataValidade = LocalDate.now().plusMonths(3);
	}

	public BemDeConsumo(String descricao, float preco, int quantidade, LocalDateTime dataFabricacao, LocalDate validade) {
		super(descricao, preco, quantidade, dataFabricacao);
		setDataValidade(validade);
	}	
}
