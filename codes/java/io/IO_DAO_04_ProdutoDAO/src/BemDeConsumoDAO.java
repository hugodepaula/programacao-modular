import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class BemDeConsumoDAO implements DAO<BemDeConsumo, String> {

	public BemDeConsumoDAO() {

	}

	@Override
	public void add(BemDeConsumo bemDeConsumo) {
		try (BufferedWriter buffer_saida = new BufferedWriter(new FileWriter("bemdeconsumo.txt", true))) {
			String separadorDeLinha = System.getProperty("line.separator");
			buffer_saida.write(bemDeConsumo.getDescricao() + separadorDeLinha);
			buffer_saida.write(bemDeConsumo.getPreco() + separadorDeLinha);
			buffer_saida.write(bemDeConsumo.getQuant() + separadorDeLinha);
			buffer_saida.write(bemDeConsumo.getDataFabricacao() + separadorDeLinha);
			buffer_saida.write(bemDeConsumo.getDataValidade() + separadorDeLinha);
			buffer_saida.flush();

		} catch (Exception e) {
			System.out.println("ERRO ao gravar o Bem de Consumo '" + bemDeConsumo.getDescricao() + "' no disco!");
			e.printStackTrace();
		}
	}

	@Override
	public BemDeConsumo get(String chave) {
		BemDeConsumo bemDeConsumo = null;
		String idSTR = null;
		
		try (BufferedReader buffer_entrada = new BufferedReader(new FileReader("bemdeconsumo.txt"))) {
			

			while ((idSTR = buffer_entrada.readLine()) != null) {
				if (chave.equals(idSTR)) {
					bemDeConsumo = new BemDeConsumo();
					bemDeConsumo.setDescricao(idSTR);
					bemDeConsumo.setPreco(Float.parseFloat(buffer_entrada.readLine()));
					bemDeConsumo.setQuant(Integer.parseInt(buffer_entrada.readLine()));
					bemDeConsumo.setDataFabricacao(LocalDateTime.parse(buffer_entrada.readLine()));
					bemDeConsumo.setDataValidade(LocalDate.parse(buffer_entrada.readLine()));
					break;
				} else {
					buffer_entrada.readLine();
					buffer_entrada.readLine();
					buffer_entrada.readLine();
					buffer_entrada.readLine();
				}

			}
		} catch (Exception e) {
			System.out.println("ERRO ao ler o Bem de Consumo '" + idSTR + "' do disco rígido!");
			bemDeConsumo = null;
			e.printStackTrace();
		}
		return bemDeConsumo;
	}

	@Override
	public List<BemDeConsumo> getAll() {
		List<BemDeConsumo> produtos = new ArrayList<BemDeConsumo>();
		BemDeConsumo bemDeConsumo = null;
		try (BufferedReader buffer_entrada = new BufferedReader(new FileReader("bemdeconsumo.txt"))) {
			String idSTR;

			while ((idSTR = buffer_entrada.readLine()) != null) {
				bemDeConsumo = new BemDeConsumo();
				bemDeConsumo.setDescricao(idSTR);
				bemDeConsumo.setPreco(Float.parseFloat(buffer_entrada.readLine()));
				bemDeConsumo.setQuant(Integer.parseInt(buffer_entrada.readLine()));
				bemDeConsumo.setDataFabricacao(LocalDateTime.parse(buffer_entrada.readLine()));
				bemDeConsumo.setDataValidade(LocalDate.parse(buffer_entrada.readLine()));
				produtos.add(bemDeConsumo);
			}
		} catch (Exception e) {
			System.out.println("ERRO ao ler os Bens de Consumo do disco rígido!");
			e.printStackTrace();
		}
		return produtos;
	}

	@Override
	public void update(BemDeConsumo p) {
		List<BemDeConsumo> produtos = getAll();
		int index = produtos.indexOf(p);
		if (index != -1) {
			produtos.set(index, p);
		}
		saveToFile(produtos);
	}

	@Override
	public void delete(BemDeConsumo p) {
		List<BemDeConsumo> produtos = getAll();
		int index = produtos.indexOf(p);
		if (index != -1) {
			produtos.remove(index);
		}
		saveToFile(produtos);
	}

	private void saveToFile(List<BemDeConsumo> produtos) {
		try (BufferedWriter buffer_saida = new BufferedWriter(new FileWriter("bemdeconsumo.txt", false))) {

			String separadorDeLinha = System.getProperty("line.separator");
			for (BemDeConsumo b : produtos) {
				buffer_saida.write(b.getDescricao() + separadorDeLinha);
				buffer_saida.write(b.getPreco() + separadorDeLinha);
				buffer_saida.write(b.getQuant() + separadorDeLinha);
				buffer_saida.write(b.getDataFabricacao() + separadorDeLinha);
				buffer_saida.write(b.getDataValidade() + separadorDeLinha);
				buffer_saida.flush();
			}
		} catch (Exception e) {
			System.out.println("ERRO ao gravar Bens de Consumo no disco!");
			e.printStackTrace();
		}
	}

}