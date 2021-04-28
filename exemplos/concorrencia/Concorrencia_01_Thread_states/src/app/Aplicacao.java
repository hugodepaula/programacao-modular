package app;

/**
 * Exemplo de aplicativo para ilustrar os estados de uma Thread em Java
 * 
 * @author Hugo de Paula
 *
 */
 
public class Aplicacao {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Execucao());

		// Imprime nome da thread, prioridade e grupo da thread
		System.out.println(t1.toString()); 

		// Estado NEW
		System.out.println(t1.getState());

		t1.start();

		// Estado RUNNING
		System.out.println(t1.getState());

		t1.join();

		// Estado TERMINATED
		System.out.println(t1.getState());

	}

}

class Execucao implements Runnable {

	@Override
	public void run() {
		System.out.println("Programa em execucao...");
	}
	
}
