package br.pm.main;

import br.pm.business.Cliente;
import br.pm.business.Funcionario;
import br.pm.business.PF;
import br.pm.business.Empresa;

public class Main {
	public static void main(String[] args) {

		Empresa empresa = new Empresa();
		
		PF joao = new PF("João", "Av. Rios, 121", "Diadema", "SP", "11222-333", "(11) 1234-5678", new byte[] {1, 1, 2, 3, 0, 8, 5, 4, 4, 2, 1});
		
		System.out.println(joao);
		
		empresa.addFuncionario(new Funcionario(joao, "Operário", 32000));
		empresa.addCliente(new Cliente(joao, 50000));
		
		System.out.println(empresa.getFuncionario(0));
		
		System.out.println(empresa.getCliente(0));
		
		empresa.getFuncionario(0).getDados().setTelefone("(31) 97733-8899"); 
		
		System.out.println(empresa.getFuncionario(0));
		
		System.out.println(empresa.getCliente(0));

		empresa.setPresidente(empresa.getFuncionario(0));
		System.out.println(empresa.getFuncionario(0));
	}
	
	
}





















