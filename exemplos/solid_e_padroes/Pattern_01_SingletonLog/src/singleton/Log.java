package singleton;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;

public class Log {
	private static final Log INSTANCE = new Log();
	private PrintStream logFile = null;
	private PrintStream destination = System.err;

	private Log() {
	}

	public static Log getInstance() {
		return INSTANCE;
	}

	public void logging(String message) {
		this.destination.println(LocalDateTime.now().toString() + ": " + message);
	}

	public Log toConsole() {
		this.destination = System.out;
		return INSTANCE;
	}

	public Log toFile() throws FileNotFoundException {
		if (logFile == null) {
			this.destination = System.out;
			throw new  FileNotFoundException("Nenhum arquivo configurado.");
		} else {
			this.destination = this.logFile;
		}
		return INSTANCE;
	}

	public Log toFile(String fileName) throws Exception {
		if (logFile != null) {
			this.closeLogFile();
		}
		this.logFile = new PrintStream(new FileOutputStream(fileName, true), true, "UTF-8");
		this.destination = this.logFile;
		return INSTANCE;
	}

	public void closeLogFile() {
		this.destination = System.out;
		this.logFile.close();
		this.logFile = null;
	}

	@Override
	protected void finalize() throws Throwable {
		closeLogFile();
	}

	
}
