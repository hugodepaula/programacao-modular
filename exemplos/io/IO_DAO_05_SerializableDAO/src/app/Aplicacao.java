package app;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import dao.DAO;
import dao.ProdutoDAO;
import model.BemDeConsumo;
import model.BemDuravel;
import model.Produto;

/**
 * Classe Aplicação
 * 
 * @author Hugo de Paula
 *
 */public class Aplicacao {

	public static void main(String args[]) throws IOException {


		DAO<Produto, String> bemDeConsumoDAO = new ProdutoDAO("bemdeconsumo.bin");

		bemDeConsumoDAO.add(new BemDeConsumo("Leite",    4.00F, 120, LocalDateTime.now(), LocalDate.now().plusMonths(6)));
		bemDeConsumoDAO.add(new BemDeConsumo("Pao",     12.00F, 200, LocalDateTime.now(), LocalDate.now().plusMonths(1)));
		bemDeConsumoDAO.add(new BemDeConsumo("Iogurte",  1.99F, 20,  LocalDateTime.now(), LocalDate.now().plusMonths(1)));
		bemDeConsumoDAO.add(new BemDeConsumo("Salgado",  4.95F, 60,  LocalDateTime.now(), LocalDate.now().plusMonths(2)));
		bemDeConsumoDAO.add(new BemDeConsumo("Manteiga", 7.40F, 80,  LocalDateTime.now(), LocalDate.now().plusMonths(12)));
		bemDeConsumoDAO.add(new BemDeConsumo("Bolinho",  5.90F, 500, LocalDateTime.now(), LocalDate.now().plusMonths(12)));
		bemDeConsumoDAO.add(new BemDeConsumo("Queijo",  11.30F, 50,  LocalDateTime.now(), LocalDate.now().plusMonths(6)));
		
		bemDeConsumoDAO.update(new BemDeConsumo("Bolinho",  13.90F, 500, LocalDateTime.now(), LocalDate.now().plusMonths(12)));
		bemDeConsumoDAO.delete(new BemDeConsumo("Iogurte",  1.99F, 20,  LocalDateTime.now(), LocalDate.now().plusMonths(1)));
		
		List<Produto> produtos = bemDeConsumoDAO.getAll();

		for (Produto produto: produtos) {
			System.out.println(produto);
		}

		System.out.println("---------------------------------------------");
		
		DAO<Produto, String>  bemDuravelDAO = 
				new ProdutoDAO("bemduravel.bin");
		bemDuravelDAO.add(new BemDuravel("Notebook", 2440.00F, 20, LocalDateTime.now(), 12));
		bemDuravelDAO.add(new BemDuravel("Televisao", 1200.00F, 10, LocalDateTime.now(), 24));
		bemDuravelDAO.add(new BemDuravel("Geladeira", 4000.00F, 10, LocalDateTime.now(), 36));

		List<Produto> bensDuraveis = bemDuravelDAO.getAll();

		for (Produto bemDuravel: bensDuraveis) {
			System.out.println(bemDuravel);
		}
		
		System.out.println(bemDuravelDAO.get("Televisao"));
		
		
	}
}
