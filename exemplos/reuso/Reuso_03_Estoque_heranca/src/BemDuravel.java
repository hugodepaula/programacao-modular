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
		super();
		// o valor default é garantia de 6 meses.
		mesesGarantia = 6;
	}

	public BemDuravel(String d, float p, int q, LocalDateTime f, int g) {
		super(d, p, q, f);
		setMesesGarantia(g);
	}
	
	
	
}
