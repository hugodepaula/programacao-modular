package impressoras;

import documentos.Documento;

public class JatoDeTintaLegado {
	public void imprimir(Documento d, int nrCopias) {
		// Codigo de impressao vem aqui.
		System.out.println("JatoDeTinta::imprimir -> " + d.getDados());
	}

	public void imprimirFrenteVerso(Documento d, int nrCopias) {
		// Codigo de impressao vem aqui.
		System.out.println("JatoDeTinta::imprimirFrenteVerso -> " + d.getDados());
	}
}