
public class Bacteria implements Cloneable {
	public static final double PESO_DEFAULT = 10;
	public static final int VIDA_DEFAULT = 5;
	private double peso;
	private int diasRestantes;

	public Bacteria() {
		diasRestantes = Bacteria.VIDA_DEFAULT;
		peso = Bacteria.PESO_DEFAULT;
	}

	public void passaDia() {
		diasRestantes--;
	}

	public boolean morreu() {
		return (diasRestantes <= 0);
	}

	public double getPeso() {
		return peso;
	}

	public int getDiasRestantes() {
		return diasRestantes;
	}

	@Override
	public Bacteria clone() throws CloneNotSupportedException {
		return new Bacteria();
	}

}
