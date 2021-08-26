package app;
public class Aplicacao {
	public static void main(String[] args) {
		EstendeMostra est = new EstendeMostra();
		SuperMostra sup = est;

		System.out.println("est.str = " + est.str);
		System.out.println("sup.str = " + sup.str);

		est.mostra();
		sup.mostra();

	}
}
