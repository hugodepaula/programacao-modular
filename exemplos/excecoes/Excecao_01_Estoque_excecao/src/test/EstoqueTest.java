package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import business.BemDeConsumo;
import business.BemDuravel;
import business.Estoque;
import business.ExcecaoEstoqueExcedido;
import business.ExcecaoEstoqueNegativo;

class EstoqueTest {

	Estoque estoque;
	

	@BeforeEach
	void setUp() throws Exception {
		estoque = new Estoque();
	}

	@Test
	void testTotalEmEstoque() throws ExcecaoEstoqueNegativo, ExcecaoEstoqueExcedido {
		assertEquals(0, estoque.totalEmEstoque(), "Testa se estoque começa vazio.");
		
		int total = estoque.totalEmEstoque();
		int soma = 10;
		estoque.add(new BemDeConsumo("10 EM ESTOQUE", 1.0F, soma, LocalDateTime.now(), LocalDate.now().plusMonths(3)));
		assertEquals(total + soma, estoque.totalEmEstoque(), "Testa se produto acrescenta ao estoque.");
	}

	@Test
	void testValorTotalEmEstoque() throws ExcecaoEstoqueNegativo, ExcecaoEstoqueExcedido {
		assertEquals(0.0F, estoque.valorEmEstoque(), 0.001F, "Testa se valor em estoque começa zero.");
		
		float total = estoque.valorEmEstoque();
		int soma = 10;
		float preco = 2;
		estoque.add(new BemDuravel("10 EM ESTOQUE", preco, soma, LocalDateTime.now(), 12));
		assertEquals(total + preco*soma, estoque.valorEmEstoque(), 0.001F, "Testa se produto acrescenta ao valor total em estoque.");
	}

}
