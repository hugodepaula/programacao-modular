package logging;

public abstract class Logger {
	public static final int INFO = 1;
	public static final int DEBUG = 2;
	public static final int ERRO = 3;

	protected int nivel;

	// proximo elemento na cadeia de responsabilidades
	protected Logger next = null;

	public void setNext(Logger next) {
		this.next = next;
	}

	public void log(int msgLevel, String message) {
		if (msgLevel >= this.nivel) {
			processMessage(message);
		}
		if (next != null) {
			next.log(msgLevel, message);
		}
	}

	protected abstract void processMessage(String message);
}
