public class X {
	protected int mascaraX = 0x00ff;
	protected int mascaraTotal;

	public X() {
		System.out.println("X().mascaraX = " + String.format("%04X",mascaraX) + 
				"    X().mascaraTotal = " + String.format("%04X",mascaraTotal));
		mascaraTotal = mascaraX;
		System.out.println("X().mascaraX = " + String.format("%04X",mascaraX) + 
				"    X().mascaraTotal = " + String.format("%04X",mascaraTotal));
	}

	public int mascara(int orig) {
		return (orig & mascaraTotal);
	}
}
