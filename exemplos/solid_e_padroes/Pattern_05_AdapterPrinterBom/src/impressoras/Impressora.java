package impressoras;

import documentos.Documento;

public interface Impressora {
	public void imprimir(Documento d, int nrCopias, boolean duplicadas);
}