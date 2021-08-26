package business;

import java.time.LocalDateTime;

public class BemDuravel extends Produto {
	private int mesesGarantia;

	public int getMesesGarantia() {
		return mesesGarantia;
	}

	public void setMesesGarantia(int mesesGarantia) {
		if (mesesGarantia > 0)
			this.mesesGarantia = mesesGarantia;
	}

	public BemDuravel() {
		mesesGarantia = 6;
	}

	public BemDuravel(String descricao, float preco, int quantidade, LocalDateTime dataFabricacao, int garantia) {
		super(descricao, preco, quantidade, dataFabricacao);
		setMesesGarantia(garantia);
	}

	/**
	 * M�todo sobreposto da classe Object. � executado quando um objeto precisa ser
	 * exibido na forma de String.
	 */
	@Override
	public String toString() {
		return super.toString() + "   Garantia: " + mesesGarantia;
	}

}
