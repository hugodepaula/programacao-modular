package impressoras;

import documentos.Documento;

public class Laser implements Impressora {
	public LaserLegado impressora = new LaserLegado();

	@Override
	public void imprimir(Documento d, int nrCopias, boolean duplicadas) {
		for (int copy = 1; copy <= nrCopias; copy++)
			impressora.imprimir(d, duplicadas);
	}
}