package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import business.Estoque;
import business.Produto;

class EstoqueTest {

	Estoque estoque;
	

	@BeforeEach
	void setUp() throws Exception {
		estoque = new Estoque();
	}

	@Test
	void testTotalEmEstoque() {
		assertEquals(0, estoque.totalEmEstoque(), "Testa se estoque come�a vazio.");
		
		int total = estoque.totalEmEstoque();
		int soma = 10;
		estoque.add(new Produto("10 EM ESTOQUE", 1.0F, soma, LocalDateTime.now()));
		assertEquals(total + soma, estoque.totalEmEstoque(), "Testa se produto acrescenta ao estoque.");
	}

	@Test
	void testValorTotalEmEstoque() {
		assertEquals(0.0F, estoque.valorEmEstoque(), 0.001F, "Testa se valor em estoque come�a zero.");
		
		float total = estoque.valorEmEstoque();
		int soma = 10;
		float preco = 2;
		estoque.add(new Produto("10 EM ESTOQUE", preco, soma, LocalDateTime.now()));
		assertEquals(total + preco*soma, estoque.valorEmEstoque(), 0.001F, "Testa se produto acrescenta ao valor total em estoque.");
	}

}
