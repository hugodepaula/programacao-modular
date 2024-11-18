package logging;

public class LoggerArquivo extends Logger {
	public LoggerArquivo(int nivel) {
		this.nivel = nivel;
	}

	@Override
	protected void processMessage(String mensagem) {
		System.out.println("Arquivo::Logger: " + mensagem);
	}
}
