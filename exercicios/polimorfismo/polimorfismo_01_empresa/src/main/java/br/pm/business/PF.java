package br.pm.business;

import java.util.Arrays;

public class PF extends Pessoa {
	private byte[] cpf;

	public byte[] getCpf() {
		return cpf;
	}

	public void setCpf(byte[] cpf) {
		this.cpf = cpf;
	}

	public PF(String nome, String endereco, String cidade, String uf, String cep, String telefone, byte[] cpf) {
		super(nome, endereco, cidade, uf, cep, telefone);
		this.setCpf(cpf);
	}
	
	@Override
	public boolean equals(Object pessoa) {
		if (pessoa instanceof PF)
			return ((PF) pessoa).getCpf().equals(this.cpf);
		else return false;
	}

	@Override
	public String toString() {
		return "PF [cpf=" + Arrays.toString(cpf).replaceAll("\\D", "") + ", " + super.toString() + "]";
	}



}













