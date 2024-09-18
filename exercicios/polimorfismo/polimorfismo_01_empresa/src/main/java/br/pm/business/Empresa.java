package br.pm.business;

public class Empresa {
	private static final int NAO_ENCONTRADO = -1;
	private String nome;
	private Cliente[] clientes = new Cliente[10];
	private Funcionario[] funcionarios = new Funcionario[10];
	private Funcionario presidente;
	private int numClientes = 0, numFuncionarios = 0;

	public Cliente getCliente(int i) {
		if (i < numClientes && i >= 0) {
			return clientes[i];
		} else {
			return null;
		}
	}

	public void addCliente(Cliente c) {
		if (numClientes < clientes.length) {
			clientes[numClientes++] = c;
		}
	}

	public int searchCliente(Cliente c) {
		for (int pos = 0; pos < numClientes; pos++) {
			if (c.equals(clientes[pos])) {
				return pos;
			}
		}
		return NAO_ENCONTRADO;
	}

	public void removeCliente(Cliente cliente) {
		int pos = this.searchCliente(cliente);
		if (pos != NAO_ENCONTRADO) {
			for (int i = pos + 1; i < numClientes; i++)
				clientes[i - 1] = clientes[i];
			clientes[numClientes - 1] = null;
			numClientes--;
		}
	}

	public Funcionario getFuncionario(int i) {
		if (i < numFuncionarios && i >= 0) {
			return funcionarios[i];
		} else {
			return null;
		}
	}

	public void addFuncionario(Funcionario funcionario) {
		if (numFuncionarios < funcionarios.length) {
			funcionarios[numFuncionarios++] = funcionario;
		}
	}

	public int searchFuncionario(Funcionario funcionario) {
		for (int pos = 0; pos < numFuncionarios; pos++) {
			if (funcionario.equals(funcionarios[pos])) {
				return pos;
			}
		}
		return NAO_ENCONTRADO;
	}

	public void removeFuncionario(Funcionario funcionario) {
		int pos = this.searchFuncionario(funcionario);
		if (pos != NAO_ENCONTRADO) {
			for (int i = pos + 1; i < numFuncionarios; i++)
				funcionarios[i - 1] = funcionarios[i];
			funcionarios[numFuncionarios - 1] = null;
			numFuncionarios--;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Funcionario getPresidente() {
		return presidente;
	}

	public void setPresidente(Funcionario presidente) {
		int pos = this.searchFuncionario(presidente);
		if (pos != NAO_ENCONTRADO && this.presidente == null) {
			this.presidente = presidente;
			if (!this.presidente.getCargo().equalsIgnoreCase("Presidente")) {
				presidente.setCargo("Presidente");
			}
		}
	}
	
	public void removePresitende() {
		this.presidente = null;
	}

	public void replacePresidente(Funcionario presidente) {
		int pos = this.searchFuncionario(presidente);
		if (pos != NAO_ENCONTRADO) {
			this.presidente.setCargo("Funcionário");
			this.presidente = presidente;
			if (!this.presidente.getCargo().equalsIgnoreCase("Presidente")) {
				presidente.setCargo("Presidente");
			}
		}
	}
}
