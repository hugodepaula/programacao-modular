package app;

import java.util.Random;

/**
 * Ilustra o funcionamento de sleep
 * 
 * @author Hugo de Paula
 *
 */

public class Aplicacao {

	public static String text = "Executando a aplicação...";
	public static Random r = new Random();

	public static void execute() {
		try {
			System.out.println(Aplicacao.text);
      
      // Dorme por um tempo aleatório de até meio segundo (500 milisegundos)
			Thread.sleep(r.nextInt(500));
      
		} catch (InterruptedException e) {

		}
	}

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 10; i++) {
      
			Thread t1 = new Thread(() -> Aplicacao.execute(), "T " + i);
			
      System.out.println(t1.toString() + " - State: " + t1.getState());
      
			t1.start();
      
			System.out.println(t1.toString() + " - State: " + t1.getState());
		}
	}

}
