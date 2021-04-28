package app;

/**
 * Exemplo de aplicativo para ilustrar múltiplas threads com prioridades
 * 
 * @author Hugo de Paula
 *
 */
class Aplicacao implements Runnable {

	public void run() {
		System.err.println("[Nome: " + Thread.currentThread().getName() + 
						   ", Prioridade: " + Thread.currentThread().getPriority());
		for (int i = 0; i <= 10; i++) {
			System.out.println("[" + i + ": Nome: " + Thread.currentThread().getName() + 
					   ", Prioridade: " + Thread.currentThread().getPriority());
		}

	}

	public static void main(String args[]) {

		Thread t1 = new Thread(new Aplicacao());
		Thread t2 = new Thread(new Aplicacao());
		
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();

	}
}