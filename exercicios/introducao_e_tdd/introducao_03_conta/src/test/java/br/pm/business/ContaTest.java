package br.pm.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContaTest {
	public static Conta conta;
	public static double saldo;

	
	@BeforeEach
	public void setUp() throws Exception {
		conta = new Conta(1200);
		saldo = conta.getSaldo();
	}

	@Test
	public void testSacarComSaldo() {
		double valor = saldo;
		conta.sacar(valor);
		assertEquals(saldo - valor, conta.getSaldo(), 0.00001);
	}

	@Test
	public void testSacarSemSaldo() {
		conta.sacar(saldo + 1);
		assertEquals(saldo, conta.getSaldo(), 0.00001);
	}
	
	@Test
	public void testSacarNegativo() {
		conta.sacar(-1);
		assertEquals(saldo, conta.getSaldo(), 0.00001);
	}
	
	@Test
	public void testDepositar() {
		conta.depositar(-10);
		assertEquals(saldo, conta.getSaldo(), 0.00001, "Depósito de valor negativo.");
		conta.depositar(10);
		assertEquals(saldo + 10, conta.getSaldo(), 0.00001, "Depósito de valor positivo.");
	}

	@Test
	public void testNumContaUnico() {
		int num = conta.getNumero();
		assertEquals(num + 1, (new Conta()).getNumero());
	}
	
}














