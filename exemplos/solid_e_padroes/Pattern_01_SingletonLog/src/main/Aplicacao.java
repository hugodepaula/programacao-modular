package main;
import singleton.Log;

class Shulambs {
	public void metodoShulambs1() {
		Log.getInstance().logging("Executando a operacao Shulambs 1.");
	}

	public void metodoShulambs2() {
		Log.getInstance().logging("Executando a operacao Shulambs 2.");
		
	}
}

public class Aplicacao {

	public static void main(String[] args) throws Exception {
		Log log = Log.getInstance();
		
		log.logging("Construindo um objeto da classe Shulambs.");

		Shulambs shul = new Shulambs();

		log.logging("Fazendo a chamada ao método 1 da classe Shulambs.");
		
		shul.metodoShulambs1();

		log.toFile("log.txt");
		
		log.logging("Fazendo a chamada ao método 2 da classe Shulambs.");
		
		shul.metodoShulambs2();

		log.closeLogFile();
	}

}
