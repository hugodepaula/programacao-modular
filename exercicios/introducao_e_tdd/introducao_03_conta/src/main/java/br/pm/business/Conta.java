package br.pm.business;

public class Conta {
	private double saldo;
	private int num;
	private static int cont = 0;

	public int getNumero() {
		return num;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valor) {
		if (saldo >= valor && valor > 0)
			this.saldo -= valor;
	}

	public void depositar(double valor) {
		if (valor >= 0)
			this.saldo += valor;
	}

	public Conta() {
		num = ++Conta.cont;
	}

	public Conta(int saldo) {
		this.depositar(saldo);
		num = ++Conta.cont;
	}

}
