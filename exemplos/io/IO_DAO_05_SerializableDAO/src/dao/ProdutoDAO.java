package dao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import model.Produto;

/**
 * Classe ProdutoDAO
 * 
 * @author Hugo de Paula
 *
 */
public class ProdutoDAO implements DAO<Produto, String> {
	private File file;
	private FileOutputStream fos;
	private ObjectOutputStream outputFile;

	public ProdutoDAO(String filename) throws IOException {
		file = new File(filename);
		if (file.exists())
			file.delete();
		fos = new FileOutputStream(file, false); 
		outputFile = new ObjectOutputStream(fos);
	}

	public void add(Produto produto) {
		try {
			outputFile.writeObject(produto);
		} catch (Exception e) {
			System.out.println("ERRO ao gravar o produto '" + produto.getDescricao() + "' no disco!");
			e.printStackTrace();
		}
	}

	public Produto get(String chave) {
		Produto produto = null;

		try (FileInputStream fis = new FileInputStream(file); ObjectInputStream inputFile = new ObjectInputStream(fis)) {
			while (fis.available() > 0) {
				produto = (Produto) inputFile.readObject();

				if (chave.equals(produto.getDescricao())) {
					return produto;
				}
			}
		} catch (Exception e) {
			System.out.println("ERRO ao ler o produto '" + chave + "' do disco!");
			e.printStackTrace();
		}
		return null;
	}

	public List<Produto> getAll() {
		List<Produto> produtos = new ArrayList<Produto>();
		Produto produto = null;
		try (FileInputStream fis = new FileInputStream(file); ObjectInputStream inputFile = new ObjectInputStream(fis)) {

			while (fis.available() > 0) {
				produto = (Produto) inputFile.readObject();
				produtos.add(produto);
			}
		} catch (Exception e) {
			System.out.println("ERRO ao gravar produto no disco!");
			e.printStackTrace();
		}
		return produtos;
	}

	public void update(Produto p) {
		List<Produto> produtos = getAll();
		int index = produtos.indexOf(p);
		if (index != -1) {
			produtos.set(index, p);
		}
		saveToFile(produtos);
	}

	public void delete(Produto p) {
		List<Produto> produtos = getAll();
		int index = produtos.indexOf(p);
		if (index != -1) {
			produtos.remove(index);
		}
		saveToFile(produtos);
	}

	private void saveToFile(List<Produto> produtos) {
		try {
			close();
			fos = new FileOutputStream(file, false); 
			outputFile = new ObjectOutputStream(fos);

			for (Produto produto : produtos) {
				outputFile.writeObject(produto);
			}
			outputFile.flush();
		} catch (Exception e) {
			System.out.println("ERRO ao gravar produto no disco!");
			e.printStackTrace();
		}
	}
	
	private void close() throws IOException {
		outputFile.close();
		fos.close();
	}

	@Override
	protected void finalize() throws Throwable {
		this.close();
	}

}
