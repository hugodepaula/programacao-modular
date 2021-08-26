import javax.swing.JOptionPane;

public class Aplicacao {

	public static void main(String[] args) {
		
		try {
			 // Ao construir e lançar a exceção geral, inicializo o código de erro
			
			throw new ExcecaoGeral()
			.setCodigoErro(CodigoValidacao.FORMATO_INVALIDO)
			.set("nome", "data inicial")
			.set("valor", "12/13/2015");
			
		} catch (ExcecaoGeral e) {
		    JOptionPane.showMessageDialog(null, e, e.getClass().getName(), JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			
		}

	}

}
