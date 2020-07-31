
public class LoggerArquivo extends Logger {
	public LoggerArquivo(int nivel) {
		this.nivel = nivel;
	}

	@Override
	protected void escrever(String mensagem) {
		System.out.println("Arquivo::Logger: " + mensagem);
	}
}
