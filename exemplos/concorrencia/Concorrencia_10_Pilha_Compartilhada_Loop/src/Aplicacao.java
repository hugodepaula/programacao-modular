public class Aplicacao {

	public static void main(String args[]) throws InterruptedException {
		Pilha estoque = new Pilha();

		new Thread(new Produtor(estoque)).start();
		new Thread(new Consumidor(estoque)).start();
		
		
		
		Thread.sleep(500);
		System.out.println("[produced: " + estoque.getProduced() + 
						   " consumed: " + estoque.getConsumed() + 
						   " size: " + estoque.getCount() + "]");

	}
}

class Produtor implements Runnable {

	Pilha estoque;

	Produtor(Pilha estoque) {
		this.estoque = estoque;
	}

	@Override
	public void run() {
		while (true) {
			if (estoque.empilha(new Produto("Produto", 4.00F, 120))) {
				System.out.println("Novo produto criado.");
			}

		}

	}

}

class Consumidor implements Runnable {

	Pilha estoque;

	Consumidor(Pilha estoque) {
		this.estoque = estoque;
	}

	@Override
	public void run() {
		Produto p;
		while (true) {
			p = estoque.desempilha();
			if (p != null) {
				System.out.println(p);
			} else {
				System.out.println("Produto indisponível.");
			}
		}
	}

}
