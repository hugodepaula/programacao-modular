
public class LoggerConsole extends Logger {
	public LoggerConsole(int nivel) {
		this.nivel = nivel;
	}

	@Override
	protected void escrever(String mensagem) {
		System.out.println("Console Padrao::Logger: " + mensagem);
	}
}
