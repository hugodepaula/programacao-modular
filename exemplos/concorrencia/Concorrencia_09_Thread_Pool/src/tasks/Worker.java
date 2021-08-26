package tasks;

import java.time.LocalTime;

public class Worker implements Runnable {
	private String taskName;

	public Worker(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public String toString() {
		return this.taskName;
	}

	public void executeTask() {
		try {
			// Espera um tempo aletório entre 0 e 3 segundos.
			//Thread.sleep((int) (Math.random() * 3000));
			Thread.sleep(1000);

			double sum = 0;
			for (int i = 100000; i > 0; i--) {
			      sum += Math.pow(-1, i + 1) / (2 * i - 1); 
			}
			sum *= 4;

			System.out.println(Thread.currentThread().getName() + ": Executando: " + this.taskName + 
								"  PI: " + sum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// Executa a tarefa
		System.out.println(Thread.currentThread().getName() + ": " + this.taskName
				+ ": Início  em: " + LocalTime.now());
		this.executeTask();
		System.out.println(Thread.currentThread().getName() + ": " + this.taskName
				+ ": Fim em: " + LocalTime.now());
	}

}
