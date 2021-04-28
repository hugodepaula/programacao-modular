package app;

/**
 * Exemplo de aplicativo para ilustrar deadlocks em Java
 * 
 * @author Hugo de Paula
 *
 */
 
public class Aplicacao {
	public static final String res1 = "Primeiro recurso";
	public static final String res2 = "Segundo recurso";

	// Synchronized cria um semáforo que faz com que demais
	// threads esperem esse bloco terminar a execução.
	public static void main(String[] args) {

		new Thread(() -> {
			
			
			synchronized (res1) {
				
				System.out.println("Thread 1: Primeiro recurso bloqueado");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
				}
				
				synchronized (res2) {
					System.out.println("Thread 1: Segundo recurso bloqueado");
				}
			}
		}).start();

		new Thread(() -> {
			synchronized (res2) {
				System.out.println("Thread 2: Segundo recurso bloqueado");

				try {
					Thread.sleep(100);
				} catch (Exception e) {
				}

				synchronized (res1) {
					System.out.println("Thread 2: Primeiro recurso bloqueado");
				}
			}
		}).start();
	}
}
