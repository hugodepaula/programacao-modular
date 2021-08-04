
public class LoggerErro extends Logger {
	public LoggerErro(int nivel) {
		this.nivel = nivel;
	}

	@Override
	protected void escrever(String mensagem) {
		System.out.println( "ERROR::Logger: " + mensagem);
	}
}
