package br.pm.business;

import java.util.Arrays;

public class PJ extends Pessoa {
	private byte[] cnpj;

	public byte[] getCnpj() {
		return cnpj;
	}

	public void setCnpj(byte[] cnpj) {
		this.cnpj = cnpj;
	}

	public PJ(String nome, String endereco, String cidade, String uf, String cep, String telefone, byte[] cnpj) {
		super(nome, endereco, cidade, uf, cep, telefone);
		this.setCnpj(cnpj);
	}
	
	@Override
	public boolean equals(Object pessoa) {
		if (pessoa instanceof PJ)
			return ((PJ) pessoa).getCnpj().equals(this.cnpj);
		else return false;
	}

	@Override
	public String toString() {
		return "PJ [cnpj=" + Arrays.toString(cnpj).replaceAll("[^0-9]", "") + ", " + super.toString() + "]";
	}


}














