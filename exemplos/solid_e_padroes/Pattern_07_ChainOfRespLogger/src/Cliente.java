import logging.Logger;
import logging.LoggerArquivo;
import logging.LoggerConsole;
import logging.LoggerErro;

public class Cliente {

	private static Logger getCadeiaDeLoggers() {
		
		Logger errorLogger = new LoggerErro(Logger.ERRO);
		Logger fileLogger = new LoggerArquivo(Logger.DEBUG);
		Logger consoleLogger = new LoggerConsole(Logger.INFO);
		
		errorLogger.setNext(fileLogger);
		
		fileLogger.setNext(consoleLogger);
		
		return errorLogger;
	}

	public static void main(String[] args) {
		
		Logger loggerChain = getCadeiaDeLoggers();
		
		loggerChain.log(Logger.INFO, "Esta é uma informação de evento.");
		loggerChain.log(Logger.DEBUG, "Esta é uma informação de Debug.");
		loggerChain.log(Logger.ERRO, "Esta é uma mensagem de erro.");
	}
}
