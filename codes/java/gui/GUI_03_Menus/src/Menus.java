import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menus {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Menus");

		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar barraMenu = new JMenuBar();
		janela.setJMenuBar(barraMenu);

		JMenu menuArquivo = new JMenu("Arquivo");
		menuArquivo.setMnemonic(KeyEvent.VK_A);
		barraMenu.add(menuArquivo);

		JMenuItem itemNovo = new JMenuItem("Novo");
		menuArquivo.add(itemNovo);

		JMenuItem itemAbrir = new JMenuItem("Abrir...");
		menuArquivo.add(itemAbrir);

		menuArquivo.addSeparator();

		JMenuItem itemSair = new JMenuItem("Sair");
		menuArquivo.add(itemSair);

		JMenu menuAjuda = new JMenu("Ajuda");
		menuAjuda.setMnemonic(KeyEvent.VK_U);
		barraMenu.add(menuAjuda);

		janela.setSize(300, 200);
		janela.setVisible(true);

	}

}
