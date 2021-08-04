package main;
import javax.swing.JOptionPane;

import formas.Forma;

public class Aplicacao {

	public static void main(String[] args) throws Exception {
		FabricaDeFormas fabricaDeFormas = new FabricaDeFormas();

		Forma forma1 = fabricaDeFormas.getForma("CIRCULO");
		forma1.desenhar();

		Forma forma2 = fabricaDeFormas.getForma("QUADRADO");
		forma2.desenhar();

		Forma forma3 = fabricaDeFormas.getForma("RETANGULO");
		forma3.desenhar();
		
		String forma = JOptionPane.showInputDialog("Digite a forma que deseja fabricar: ");
		if (forma != null) fabricaDeFormas.getForma(forma).desenhar();
		
	}

}
