package app;

/**
 * Este exemplo foi adaptado do Java Concurrency Tutorial, da Oracle
 * 
 * {@link https://docs.oracle.com/javase/tutorial/essential/concurrency/}
 *
 * Exemplo de aplicativo para ilustrar deadlocks em Java.
 * 
 * O deadlock ocorre quando uma Thread A fica bloqueada esperando um recurso
 * reservado � uma Thread B, enquanto a Thread B fica esperando um recurso
 * reservado � thread A. Este siclo formado pelos pares reserva-espera faz com
 * que o programa fique bloqueado e n�o consiga finalizar sua execu��o.
 * 
 * @author Hugo de Paula
 *
 */

public class Aplicacao {
	public static final String res1 = "Primeiro recurso";
	public static final String res2 = "Segundo recurso";

	// Synchronized cria um sem�foro que faz com que demais
	// threads esperem esse bloco terminar a execu��o.

	public static void main(String[] args) {

		new Thread(() -> {

			// Este bloco de comando reserva o recurso "res1".
			// Nenhuma outra Thread poder� usar "res1" at� que este bloco termine;
			synchronized (res1) {

				System.out.println("Thread 1: Primeiro recurso bloqueado");

				try {
					Thread.sleep(10);
				} catch (Exception e) {
				}

				System.out.println("Thread 1: aguardando segundo recurso");
				
				// Thread aguarda a libera��o do recurso "res2" para poder reserv�-lo.
				synchronized (res2) {
					System.out.println("Thread 1: Segundo recurso bloqueado");
				}
			}
		}).start();

		new Thread(() -> {

			// Este bloco de comando reserva o recurso "res2".
			// Nenhuma outra Thread poder� usar "res2" at� que este bloco termine;
			synchronized (res2) {
				System.out.println("Thread 2: Segundo recurso bloqueado");

				try {
					Thread.sleep(10);
				} catch (Exception e) {
				}

				System.out.println("Thread 2: aguardando primeiro recurso");

				// Thread aguarda a libera��o do recurso "res1" para poder reserv�-lo.
				synchronized (res1) {
					System.out.println("Thread 2: Primeiro recurso bloqueado");
				}
			}
		}).start();
	}
}
