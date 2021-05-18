package app;

/**
 * Este exemplo foi adaptado do Java Concurrency Tutorial, da Oracle
 *  
 * {@link https://docs.oracle.com/javase/tutorial/essential/concurrency/} 
 * 
 * Exemplo de aplicativo para ilustrar múltiplas threads em execução.
 * Neste exemplo pode-se notar que o programador não tem controle sobre a ordem
 * nem o instante em que uma determinada Thread será executada.
 * 
 * @author Hugo de Paula
 *
 */

public class Aplicacao {

	public static String text = " - Executando a aplicação.";

	public static void execute() {
		System.out.println(Thread.currentThread().getName() + Aplicacao.text);
	}

	public static void main(String[] args) throws InterruptedException {

		// Cria 10 Threads
		for (int i = 0; i < 10; i++) {

			Thread t1 = new Thread(() -> Aplicacao.execute(), "T-" + i);

			System.out.println(t1.getName() + " - State: " + t1.getState());

			t1.start();

			System.out.println(t1.getName() + " - State: " + t1.getState());
		}
	}

}
