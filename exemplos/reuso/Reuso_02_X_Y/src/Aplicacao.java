
public class Aplicacao {
	public static void main(String args[]) {

		System.out.println("Y y = new Y();");
		Y y = new Y();
		
		System.out.println("\nResultado Final: ");
		System.out.println("Y.mascaraX = " + String.format("%04X",y.mascaraX));
		System.out.println("Y.mascaraY = " + String.format("%04X",y.mascaraY));
		System.out.println("Y.mascaraTotal = " + String.format("%04X",y.mascaraTotal));
		
	}
}
