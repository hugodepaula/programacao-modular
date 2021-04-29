package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import tasks.Worker;

public class ThreadPoolApp {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		// Cria um Thread Pool com tamanho fixo de 3 Threads
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for (int i = 0; i < 9; i++) {
			executor.execute(new Worker("Tarefa " + (i+1)));
		}

		executor.shutdown();
		
		while (!executor.isTerminated()) {
		}
		
		long end = System.currentTimeMillis();

		System.out.println("Todas as tarefas foram executadas.");
		System.out.println("Tempo de execução total: " + ((end - start)/1000) + " segundos");

	}

}
