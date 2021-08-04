package main;

import documentos.DocumentoTexto;
import impressoras.Impressora;
import impressoras.JatoDeTinta;
import impressoras.Laser;

public class Aplicacao {

	public static void main(String[] args) {

		Impressora impressora; 
		
		impressora = new JatoDeTinta();
		
		impressora.imprimir(new DocumentoTexto(), 5, true);

		impressora = new Laser();
		
		impressora.imprimir(new DocumentoTexto(), 5, true);
}

}
