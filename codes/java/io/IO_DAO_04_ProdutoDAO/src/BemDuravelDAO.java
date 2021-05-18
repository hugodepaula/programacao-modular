import java.util.ArrayList;
import java.util.List;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalDateTime;

public class BemDuravelDAO implements DAO<BemDuravel, String> {
	private static final String filename = "bemduravel.dat";
	
	public BemDuravelDAO() {

	}

	@Override
	public void add(BemDuravel p) {
		BemDuravel b = p;
		try (DataOutputStream saida = new DataOutputStream(new FileOutputStream(filename, true))) {
			saida.writeUTF(b.getDescricao());
			saida.writeFloat(b.getPreco());
			saida.writeInt(b.getQuant());
			saida.writeUTF(b.getDataFabricacao().toString());
			saida.writeInt(b.getMesesGarantia());
			saida.flush();

		} catch (Exception e) {
			System.out.println("ERRO ao gravar o Bem de Consumo '" + b.getDescricao() + "' no disco!");
			e.printStackTrace();
		}
	}

	@Override
	public BemDuravel get(String chave) {
		BemDuravel retorno = null;
		String idSTR = null;

		try (DataInputStream entrada = new DataInputStream(new FileInputStream(filename))) {
			while ((idSTR = entrada.readUTF()) != null) {
				if (chave.equals(idSTR)) {
					retorno = new BemDuravel();
					retorno.setDescricao(idSTR);
					retorno.setPreco(entrada.readFloat());
					retorno.setQuant(entrada.readInt());
					retorno.setDataFabricacao(LocalDateTime.parse(entrada.readUTF()));
					retorno.setMesesGarantia(entrada.readInt());
					break;
				} else {
					entrada.readFloat();
					entrada.readInt();
					entrada.readUTF();
					entrada.readInt();
				}
			}
		} catch (Exception e) {
			System.out.println("ERRO ao ler o Bem durável '" + chave + "' do disco rígido!");
			e.printStackTrace();
		}
		return retorno;
	}

	@Override
	public List<BemDuravel> getAll() {
		List<BemDuravel> produtos = new ArrayList<BemDuravel>();
		BemDuravel b = null;
		String idSTR = null;

		try (DataInputStream entrada = new DataInputStream(new FileInputStream(filename))) {
			while ((idSTR = entrada.readUTF()) != null) {
				b = new BemDuravel();
				b.setDescricao(idSTR);
				b.setPreco(entrada.readFloat());
				b.setQuant(entrada.readInt());
				b.setDataFabricacao(LocalDateTime.parse(entrada.readUTF()));
				b.setMesesGarantia(entrada.readInt());
				
				produtos.add(b);
			}
		} catch (Exception e) {
			System.out.println("ERRO ao ler o Bem durável '" + idSTR + "' do disco rígido!");
			e.printStackTrace();
		}
		return produtos;
	}

	@Override
	public void update(BemDuravel p) {
		List<BemDuravel> produtos = getAll();
		int index = produtos.indexOf(p);
		if (index != -1) {
			produtos.set(index, p);
		}
		saveToFile(produtos);
	}

	@Override
	public void delete(BemDuravel p) {
		List<BemDuravel> produtos = getAll();
		int index = produtos.indexOf(p);
		if (index != -1) {
			produtos.remove(index);
		}
		saveToFile(produtos);
	}

	private void saveToFile(List<BemDuravel> produtos) {
		try (DataOutputStream saida = 
			new DataOutputStream(new FileOutputStream(filename, false))) {
			for (BemDuravel b : produtos) {
				saida.writeUTF(b.getDescricao());
				saida.writeFloat(b.getPreco());
				saida.writeInt(b.getQuant());
				saida.writeUTF(b.getDataFabricacao().toString());
				saida.writeInt(b.getMesesGarantia());
			}
			saida.flush();

		} catch (Exception e) {
			System.out.println("ERRO ao gravar Bens duráveis no disco!");
			e.printStackTrace();
		}
	}

}