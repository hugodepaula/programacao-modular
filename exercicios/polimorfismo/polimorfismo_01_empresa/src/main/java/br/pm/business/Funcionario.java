package br.pm.business;

public class Funcionario {
	private PF dados;
	private String cargo;
	private float salario;

	public PF getDados() {
		return dados;
	}

	public void setDados(PF dados) {
		this.dados = dados;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		if (salario >= 0) {
			this.salario = salario;
		}
	}

	public Funcionario(PF dados, String cargo, float salario) {
		this.setDados(dados);
		this.setCargo(cargo);
		this.setSalario(salario);
	}

	public Funcionario(String nome, String endereco, String cidade, String uf, String cep, String telefone, byte[] cpf, String cargo, float salario) {
		this.setDados(new PF(nome, endereco, cidade, uf, cep, telefone, cpf));
		this.setCargo(cargo);
		this.setSalario(salario);
	}

	@Override
	public String toString() {
		return "Funcionario [dados=" + dados + ", cargo=" + cargo + ", salario=" + salario + "]";
	}

}
