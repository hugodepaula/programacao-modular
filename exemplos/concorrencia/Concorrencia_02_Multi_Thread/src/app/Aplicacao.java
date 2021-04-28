package app;

/**
 * Exemplo de aplicativo para ilustrar múltiplas threads em execução
 * 
 * @author Hugo de Paula
 *
 */

public class Aplicacao {

	public static String text = "Executando a aplicação...";

	public static void execute() {
		System.out.println(Aplicacao.text);
	}

	public static void main(String[] args) throws InterruptedException {

		// Cria 10 Threads
		for (int i = 0; i < 10; i++) {
			
      Thread t1 = new Thread(() -> Aplicacao.execute(), "T " + i);
      
			System.out.println(t1.toString() + " - State: " + t1.getState());
      
			t1.start();
      
			System.out.println(t1.toString() + " - State: " + t1.getState());
		}
	}

}
