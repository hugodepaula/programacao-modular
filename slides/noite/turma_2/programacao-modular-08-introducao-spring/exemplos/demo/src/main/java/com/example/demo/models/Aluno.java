package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Aluno {

	@Id
	@Column
	private String matricula;
	
	@Column
	private String nome;
	
	@Column
	private int idade;
	
	
	public Aluno(String nome, String matricula, int idade) {
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
	}


	public Aluno() {
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", idade=" + idade + "]";
	}
	
	
}
