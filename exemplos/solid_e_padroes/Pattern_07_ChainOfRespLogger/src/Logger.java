
public abstract class Logger {
	public static final int INFO = 1;
	public static final int DEBUG = 2;
	public static final int ERRO = 3;

	protected int nivel;

	// proximo elemento na cadeia de responsabilidades
	protected Logger proximoLogger = null;

	public void setProximo(Logger proximoLogger) {
		this.proximoLogger = proximoLogger;
	}

	public void log(int nivelMensagem, String mensagem) {
		if (this.nivel <= nivelMensagem) {
			escrever(mensagem);
		}
		if (proximoLogger != null) {
			proximoLogger.log(nivelMensagem, mensagem);
		}
	}

	abstract protected void escrever(String mensagem);
}
