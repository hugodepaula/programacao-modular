
public class ShulambsFixed<T> {
	private T campo;
	private T[] arranjo;

	@SuppressWarnings("unchecked")
	public ShulambsFixed(T param) {
		campo = param;
		arranjo = (T[]) new Object[10];
	}
}
