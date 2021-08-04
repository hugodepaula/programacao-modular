import java.util.Collection;
import java.util.HashSet;

public class Simulacao {
	public static void main(String[] args) {

		Collection<Bacteria> colonia = new HashSet<Bacteria>();
		Collection<Bacteria> novas = new HashSet<Bacteria>();
		
		colonia.add(new Bacteria());
		
		for (int i = 0; i < 10; i++) {
			for (Bacteria bac : colonia) {
				bac.passaDia();
				try {
					novas.add((Bacteria) bac.clone());
				} catch (CloneNotSupportedException e) {
					System.out.println("Bactéria não clonável");
				}
			}
			colonia.addAll(novas);
			novas.clear();
		}
		System.out.println(colonia.size());
	}

}
