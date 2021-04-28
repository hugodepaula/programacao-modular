package app;

/**
 * Exemplo de aplicativo para ilustrar múltiplas threads em execução com Join
 * 
 * @author Hugo de Paula
 *
 */

class Aplicacao implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
    
		Thread t1 = new Thread(new Aplicacao());
    
		Thread t2 = new Thread(new Aplicacao());
    
		Thread t3 = new Thread(new Aplicacao());

		try {

			t1.start();
      
      // Join aguarda a thread terminar.
      
			t1.join();

			t2.start();
      
			t3.start();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}