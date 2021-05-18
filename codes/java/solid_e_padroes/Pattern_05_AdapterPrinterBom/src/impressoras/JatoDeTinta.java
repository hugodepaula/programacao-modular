package impressoras;

import documentos.Documento;

public class JatoDeTinta implements Impressora {
	public JatoDeTintaLegado impressora = new JatoDeTintaLegado();

	@Override
	public void imprimir(Documento d, int nrCopias, boolean frenteVerso) {
		if (frenteVerso)
			impressora.imprimirFrenteVerso(d, nrCopias);
		else
			impressora.imprimir(d, nrCopias);
	}
}