import java.io.*;

public class AcessoAleatorio {
	public static void main(String args[]) {
		double dados[] = { 542.5, 87.1, 123.45, 3283.0, 111.1, 543.21 };
		double d;

		try (RandomAccessFile arq = new RandomAccessFile("binario.dat", "rw")) {
			for (int i = 0; i < dados.length; i++) {
				arq.writeDouble(dados[i]);
			}

			arq.seek(0);
			d = arq.readDouble();
			System.out.println("1o valor: " + d);

			arq.seek(8);
			d = arq.readDouble();
			System.out.println("2o valor: " + d);

			arq.seek(8 * 3);
			d = arq.readDouble();
			System.out.println("4o valor: " + d);

			System.out.println();

			for (int i = 0; i < dados.length; i++) {
				arq.seek(8 * i);
				d = arq.readDouble();
				System.out.print(d + " ");
			}
		} catch (IOException e) {
			System.out.println("Erro de I/O: " + e);
		}
	}
}
