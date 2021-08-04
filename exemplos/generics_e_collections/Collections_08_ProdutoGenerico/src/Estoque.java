import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Esta classe irá armazenar uma lista de produtos em estoque.
 * 
 * @author Prof. Hugo de Paula
 * @category Programação Modular
 *
 */
public class Estoque {
	List<Produto> produtos;

	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void adicionar(Produto p) {
		produtos.add(p);
	}

	public Produto consultar(String descricao) {
		for (Produto p : produtos) {
			if (descricao.equalsIgnoreCase(p.getDescricao())) {
				return p;
			}
		}
		return null; // Produto não encontrado.
	}

	public void remover(String descricao) {
		produtos.removeIf((prod) -> descricao.equalsIgnoreCase(prod.getDescricao()));
	}

	public int total() {
		return produtos.stream()
			       .mapToInt(Produto::getQuant)
			       .reduce(0, (x, y) -> x + y);
	}

	public float valorEmEstoque() {
		return produtos.stream()
				       .map((prod) -> prod.getQuant() * prod.getPreco())
				       .reduce(0.0F, (x, y) -> x + y);
	}

	@Override
	public String toString() {
		return produtos.stream()
	              .map((prod) -> prod.toString() + "\n")
	              .reduce("", (x, y) -> x + y);
	}

	public void ordenar() {
		produtos.sort(new Comparator<Produto>() {
			@Override
			public int compare(Produto o1, Produto o2) {
				return (o1.getDescricao().compareTo(o2.getDescricao()));
			}  
		});
	}

	public void ordenarStream() {
		produtos = 
				produtos.stream()
				        .sorted((o1, o2) -> o1.getDescricao().compareTo(o2.getDescricao()))
				        .collect(toList());
	}

	public List<Produto> ordenarStream(Predicate<Produto> p, Comparator<Produto> c) {
		return produtos.stream()
				       .filter(p)
				       .sorted(c)
				       .collect(toList());
	}

	public Estoque() {
		produtos = new ArrayList<Produto>();
	}
}








