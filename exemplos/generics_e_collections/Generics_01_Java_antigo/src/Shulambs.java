public class Shulambs<T> {
	private T campo; // ok
	private T[] arranjo; // ok

	public Shulambs() {
		campo = new T(); // erro
		arranjo = new T[10]; // erro
	}
}
