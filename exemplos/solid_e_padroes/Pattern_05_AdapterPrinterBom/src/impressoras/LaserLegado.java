package impressoras;

import documentos.Documento;

public class LaserLegado {
	public void imprimir(Documento d, boolean duplicadas) {
		// Codigo de impressao vem aqui.
		System.out.println("Laser::imprimir -> " + d.getDados());
	}
}