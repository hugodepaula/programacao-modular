public class ImpressoraUnificada {
	public void imprimir(Documento d, int nrCopias, boolean duplicadas) {
		if (isLaser()) {
			for (int copy = 1; copy <= nrCopias; copy++)
				imprimirLaser(d, duplicadas);
		} else {
			if (duplicadas)
				imprimirJatoDeTintaDuplicada(d, nrCopias);
			else
				imprimirJatoDeTinta(d, nrCopias);
		}
	}

	public void imprimirJatoDeTinta(Documento d, int nrCopias) {
		// Codigo de impressao vai aqui
		new JatoDeTinta().imprimir(d, nrCopias);
	}

	public void imprimirJatoDeTintaDuplicada(Documento d, int nrCopias) {
		// Codigo de impressao vai aqui
		new JatoDeTinta().imprimirDuplicada(d, nrCopias);
	}

	public void imprimirLaser(Documento d, boolean duplicadas) {
		// Codigo de impressao vai aqui
		new Laser().imprimir(d, duplicadas);
	}

	public boolean isLaser() {
		// Descobrir uma forma de identificar qual o tipo de impressora está ativa
		return true;
	}
}