package br.pm.business;

public class Cliente {
	private Pessoa dados;
	private float credito;

	public Pessoa getDados() {
		return dados;
	}

	public void setDados(Pessoa dados) {
		this.dados = dados;
	}

	public float getCredito() {
		return credito;
	}

	public void setCredito(float credito) {
		if (credito >= 0) {
			this.credito = credito;
		}
	}

	public Cliente(Pessoa dados, float credito) {
		super();
		this.dados = dados;
		this.credito = credito;
	}

	public Cliente(String nome, String endereco, String cidade, String uf, String cep, String telefone, byte[] identificador, float credito) {
		if (identificador.length == 11)
			this.dados = new PF(nome, endereco, cidade, uf, cep, telefone, identificador);
		else if (identificador.length == 14)
			this.dados = new PJ(nome, endereco, cidade, uf, cep, telefone, identificador);
		this.credito = credito;
	}

	@Override
	public boolean equals(Object cliente) {
		if (cliente instanceof Cliente)
			return ((Cliente) cliente).dados.equals(this.dados);
		else return false;
	}

	@Override
	public String toString() {
		return "Cliente [dados=" + dados + ", credito=" + credito + "]";
	}

	
	
}










