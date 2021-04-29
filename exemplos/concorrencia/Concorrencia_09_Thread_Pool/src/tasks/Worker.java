package tasks;
import java.time.LocalTime;

public class Worker implements Runnable {
	private String taskName;

	public Worker(String taskName) {
		super();
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
			Thread.sleep((int) (Math.random()*3000));
			//Thread.sleep((int) (1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// Executa a tarefa
		System.out.println(Thread.currentThread().getName() + ": Início  em "+ LocalTime.now());
		System.out.println(Thread.currentThread().getName() + ": Executando tarefa: " + this.taskName);
		this.executeTask();
		System.out.println(Thread.currentThread().getName() + ": Fim em "+ LocalTime.now());
	}

	

}
