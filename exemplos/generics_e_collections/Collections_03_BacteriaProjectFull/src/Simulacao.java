import java.util.Collection;
import java.util.HashSet;

public class Simulacao {
	public static void main(String[] args) {
		double lixo = 0;

		long start = System.currentTimeMillis();

		Collection<Bacteria> colonia = new HashSet<Bacteria>();
		Collection<Bacteria> novas = new HashSet<Bacteria>();
		colonia.add(new Bacteria());
		for (int i = 0; i < 20; i++) {
			for (Bacteria bacteria : colonia) {

				lixo += bacteria.getPeso() / 2;
				
				try {
					novas.add(bacteria.clone());
				} catch (Exception e) {
					System.out.println("Bact�ria n�o clon�vel");
				}

			
				bacteria.passaDia();
				
			}

			System.out.println("Dia " + i + ": Tamanho da Col�nia: " + colonia.size());
			
			colonia.removeIf((bac) -> bac.morreu());
			
			colonia.addAll(novas);
			novas.clear();
		}
		System.out.println("Tamanho da Col�nia: " + colonia.size());
		System.out.println("Lixo consumido: " + lixo);

		long end = System.currentTimeMillis();

		System.out.println("Tempo decorrido: " + (end-start));
	}

}













