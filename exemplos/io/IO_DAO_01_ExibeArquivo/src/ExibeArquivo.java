import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExibeArquivo {
	public static void main(String args[]) {
		int i;
		FileInputStream fin = null;

		if (args.length != 1) { // Verifica linha de comando
			System.out.println("Uso: ExibeArquivo nomearquivo");
			return;
		}

		try {
			fin = new FileInputStream(args[0]);

			do {
				i = fin.read();
				if (i != -1) // terminou o arquivo
					System.out.print((char) i);
			} while (i != -1);

		} catch (FileNotFoundException exc) {
			System.out.println("Arquivo '" + args[0] + "' não encontrado.");
		} catch (IOException exc) {
			System.out.println("Erro de entrada/saída");
		} finally {
			try {
				if (fin != null)
					fin.close();
			} catch (IOException exc) {
				System.out.println("Erro ao fechar arquivo.");
			}
		}
	}

}
