package br.pm.main;

import br.pm.business.Conta;

public class Main {
    public static void main(String[] args) {
        
        Conta contaDoZe = new Conta();

        System.out.println("Número da conta bancária do Zé: " + contaDoZe.getNumero());
        System.out.println("Saldo inicial da conta bancária do Zé: " + contaDoZe.getSaldo());

        contaDoZe.depositar(199.99);
        System.out.println("Saldo da conta bancária do Zé após depósito: " + contaDoZe.getSaldo());
       
    }
}