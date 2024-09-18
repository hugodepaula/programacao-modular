package br.pm.business;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String cep;
	private String cidade;
	private Uf uf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		if (cep.length() == 9) {
			this.cep = cep;
		} else if (cep.length() == 8) {
			this.cep = cep.substring(0,5) + "-" + cep.substring(5,8);
 		}
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

	public void setUf(String ufValue) {
		Uf uf = Uf.fromSigla(ufValue); 
		if (uf != null) {
			this.uf = uf;
		}
		
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + 
		", endereco=" + endereco + 
		", " + cidade + 
		", " + uf +
		", " + cep + 
		", telefone=" + telefone + "]";
	}

	public Pessoa(String nome, String endereco, String cidade, String uf, String cep, String telefone) {
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setCidade(cidade);
		this.setUf(uf);
		this.setCep(cep);
		this.setTelefone(telefone);
	}

	@Override
	public boolean equals(Object pessoa) {
		if (pessoa instanceof Pessoa)
			return ((Pessoa) pessoa).nome.equalsIgnoreCase(this.nome);
		else return false;
	}

	
}










