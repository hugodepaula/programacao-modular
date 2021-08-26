import java.util.*;

public class ExemploDeListas {
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		lista.add("Bernardo");
		lista.add("Carolina");
		lista.add("Eugênia");
		lista.add("Carolina");
		lista.add("Clara");
		
		System.out.println(lista);
		System.out.println("2: " + lista.get(2));
		System.out.println("0: " + lista.get(0));
		
		Deque<String> fila = new LinkedList<String>();
		
		fila.addFirst("Bernardo");
		fila.addFirst("Carolina");
		fila.addFirst("Eugênia");
		fila.addFirst("Elizabeth");
		fila.addFirst("Clara");

		System.out.println(fila);
		fila.removeLast();
		fila.removeLast();

		System.out.println(fila);
	}
}
