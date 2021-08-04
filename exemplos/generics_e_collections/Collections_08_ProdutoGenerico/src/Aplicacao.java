import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.swing.JOptionPane;

class Aplicacao {

	public static void main(String args[]) {

		Estoque estoque = new Estoque();

		estoque.adicionar(new BemDeConsumo("Pao", 12.90F, 120, LocalDateTime.now(), LocalDate.now().plusMonths(6)));
		estoque.adicionar(new BemDeConsumo("Queijo", 29.90F, 210, LocalDateTime.now(), LocalDate.now().plusMonths(6)));
		estoque.adicionar(new BemDuravel("Forno Microondas", 780.00F, 40, LocalDateTime.now(), 24));
		estoque.adicionar(new BemDuravel("Notebook", 4000.00F, 20, LocalDateTime.now(), 12));
		estoque.adicionar(new BemDeConsumo("Leite", 4.00F, 280, LocalDateTime.now(), LocalDate.now().plusMonths(6)));
		estoque.adicionar(new BemDuravel("Televisao", 1000.00F, 80, LocalDateTime.now(), 48));
		estoque.adicionar(new BemDeConsumo("Figurinha", 1.50F, 120, LocalDateTime.now(), LocalDate.now().plusMonths(6)));
		
		JOptionPane.showMessageDialog(null, estoque, "Estoque de produtos", JOptionPane.INFORMATION_MESSAGE);

		estoque.remover("leITe");

		JOptionPane.showMessageDialog(null, estoque, "Estoque de produtos", JOptionPane.INFORMATION_MESSAGE);

		estoque.ordenar();
		
		JOptionPane.showMessageDialog(null, estoque, "Estoque de produtos", JOptionPane.INFORMATION_MESSAGE);

		List<Produto> filtrado = estoque.ordenarStream(
				((pf) -> pf.getQuant() > 100),
				((p1, p2)  -> Float.compare(p1.getPreco(), p2.getPreco())));
		
		filtrado.forEach(prod -> System.out.println(prod));

		double media = estoque.getProdutos()
			     .stream()
			     .filter(p -> p instanceof BemDeConsumo)
			     .mapToInt(Produto::getQuant)
			     .average()
			     .getAsDouble();
		
		System.out.println("Quantidade média por Bem de Consumo: " + media);
		System.out.println("Total em estoque: " + estoque.total());
		System.out.println("Valor em estoque: " + estoque.valorEmEstoque());
	}
}
