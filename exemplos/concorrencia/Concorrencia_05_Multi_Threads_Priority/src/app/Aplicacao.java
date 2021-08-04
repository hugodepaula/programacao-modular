package app;

/**
 * Este exemplo foi adaptado do Java Concurrency Tutorial, da Oracle
 * 
 * {@link https://docs.oracle.com/javase/tutorial/essential/concurrency/}
 *
 * Exemplo de aplicativo para ilustrar múltiplas threads com prioridades.
 * 
 * As Threads em Java podem ter prioridades entre 1 (MIN_PRIORITY) e 10
 * (MAX_PRIORITY). Mais uma vez, o desenvolvedor não tem controle sobre quanto
 * espaço de processamento será concedido a cada Thread.
 * 
 * @author Hugo de Paula
 *
 */
class Aplicacao implements Runnable {

	public void run() {
		System.err.println(Thread.currentThread().getName() + 
				           ", Pr: " + Thread.currentThread().getPriority());
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + ": " + Thread.currentThread().getName() + 
					       ", Pr: " + Thread.currentThread().getPriority());
		}

	}

	public static void main(String args[]) {

		Thread t1 = new Thread(new Aplicacao(), "T1");
		Thread t2 = new Thread(new Aplicacao(), "T2");
		Thread t3 = new Thread(new Aplicacao(), "T3");
		Thread t4 = new Thread(new Aplicacao(), "T4");

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority((Thread.MAX_PRIORITY - Thread.MIN_PRIORITY) / 3);
		t3.setPriority(2*(Thread.MAX_PRIORITY - Thread.MIN_PRIORITY) / 3);
		t4.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}