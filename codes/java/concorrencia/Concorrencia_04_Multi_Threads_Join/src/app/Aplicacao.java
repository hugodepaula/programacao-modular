package app;

/**
 * Este exemplo foi adaptado do Java Concurrency Tutorial, da Oracle
 * 
 * {@link https://docs.oracle.com/javase/tutorial/essential/concurrency/}
 *
 * Exemplo de aplicativo para ilustrar múltiplas threads em execução com Join
 * 
 * O comando Join aguarda a morte de uma Thread, para então prosseguir com a
 * execução. É uma forma de sincronizar a execução de algumas threads. Neste
 * exemplo, as threads t2 e t3 só seão iniciadas após o término de t1. A
 * execução de t2 e t3, no entanto, acontecerá de forma concorrente.
 * 
 * @author Hugo de Paula
 *
 */

class Aplicacao implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			
			// O objetivo de sleep é garantir que ocorra alternância 
			// de execução de Threads.
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
			
			System.out.println(Thread.currentThread().getName() + "  " + i);
		}
	}

	public static void main(String args[]) {

		Thread t1 = new Thread(new Aplicacao(), "T1");

		Thread t2 = new Thread(new Aplicacao(), "T2");

		Thread t3 = new Thread(new Aplicacao(), "T3");

		try {

			t1.start();

			// Join aguarda a thread t1 terminar.

			t1.join();

			// t2 e t3 são executadas concorrentemente.
			
			t2.start();

			t3.start();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}