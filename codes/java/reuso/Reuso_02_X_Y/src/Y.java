
public class Y extends X {
	protected int mascaraY = 0xff00;

	public Y() {
		System.out.println("Y().mascaraX = " + String.format("%04X",mascaraX) + 
				"    Y().mascaraTotal = " + String.format("%04X",mascaraTotal) + 
				"    Y().mascaraY = " + String.format("%04X",mascaraY));
		mascaraTotal |= mascaraY;
		System.out.println("Y().mascaraX = " + String.format("%04X",mascaraX) + 
				"    Y().mascaraTotal = " + String.format("%04X",mascaraTotal) + 
				"    Y().mascaraY = " + String.format("%04X",mascaraY));
	}

}
