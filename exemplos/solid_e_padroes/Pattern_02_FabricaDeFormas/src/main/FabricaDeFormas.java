package main;

import formas.Forma;
import formas.Circulo;
import formas.Quadrado;
import formas.Retangulo;

public class FabricaDeFormas {
	public Forma getForma(String tipoForma) {
		if (tipoForma == null) {
			return null;
		}
		if (tipoForma.equalsIgnoreCase("CIRCULO")) {
			return new Circulo();
		} else if (tipoForma.equalsIgnoreCase("QUADRADO")) {
			return new Quadrado();
		} else if (tipoForma.equalsIgnoreCase("RETANGULO")) {
			return new Retangulo();
		}
		return null;
	}
}
