import java.util.ArrayList;

public class Aplicacao {
	private class Professor {

	}

	/**
	 * Exemplo ilustrando o código como era feito na versão Java 1.4
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void Exemplo1() {
		ArrayList listaDeProfessores = new ArrayList();

		listaDeProfessores.add("Hugo de Paula");
		// Adiciona um professor na lista
		listaDeProfessores.add("Zé da Silva");
		// Adiciona um professor na lista

		String prof1 = (String) listaDeProfessores.get(0);
		// Recupera o 1o professor da lista

		Professor prof2 = (Professor) listaDeProfessores.get(1);
		// Essa última linha irá compilar, uma vez que a função
		// get(n) retorna Object, mas irá produzir erro de execução.

		System.out.println("Prof1: " + prof1 + "  prof2: " + prof2);
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	public static void Exemplo2() {
		ArrayList<String> listaDeProfessores = new ArrayList();
		// Define tipo da lista como parâmetro

		listaDeProfessores.add("Hugo de Paula");
		listaDeProfessores.add("Zé da Silva");

		//String prof1 = listaDeProfessores.get(0);
		// Sem type casting
		// Professor prof2 = (Professor) listaDeProfessores.get(1); 
		// Produz erro de compilação (erro de tipo)
		
		// System.out.println("Prof1: " + prof1 + "  prof2: " + prof2);

	}

	public static void main(String[] args) {
		Exemplo1();

	}
}
