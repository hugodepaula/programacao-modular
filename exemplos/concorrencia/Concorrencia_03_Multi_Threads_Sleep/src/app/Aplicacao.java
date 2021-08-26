package app;

/**
 * Este exemplo foi adaptado do Java Concurrency Tutorial, da Oracle
 *  
 * {@link https://docs.oracle.com/javase/tutorial/essential/concurrency/} 
 * 
 *  Este exemplo ilustra o funcionamento de sleep.
 *
 *  Quando sleep é acionado, a Thread fica suspensa pelo tempo determinado 
 *  em milisegundos. Outras Threads poderão assumir o processador. Note que,
 *  apesar das Threads serem criadas na ordem, quando elas retornam do estado
 *  de suspensão causado pelo Sleep, a ordem de execução é quase aleatória.
 *  O desenvolvedor não tem controle sobre a ordem de execução das Threads. 
 * 
 * @author Hugo de Paula
 *
 */

public class Aplicacao {

	public static String text = " - Executando a aplicação.";

	public static void execute() {
		try {
			// Dorme por um tempo de 20 milisegundos
			Thread.sleep(20);
			
			System.out.println(Thread.currentThread().getName() + Aplicacao.text);


		} catch (InterruptedException e) {

		}
	}

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 20; i++) {

			// Lambda function implementa a lambda interface Runnable
			
			Thread t1 = new Thread(() -> Aplicacao.execute(), "T " + i);
			
			System.out.println(t1.toString() + " - State: " + t1.getState());

			t1.start();

			System.out.println(t1.toString() + " - State: " + t1.getState());
			
		}
	}

}
