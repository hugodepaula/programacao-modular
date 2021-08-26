package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import business.BemDuravel;
import business.ExcecaoEstoqueNegativo;
import business.Produto;

class ProdutoTest {

	Produto produto;
	
	@BeforeEach
	void setUp() throws Exception {
		produto = new BemDuravel("Nome", 1.0F, 1, LocalDateTime.now(), 12);
	}

	@Test
	void testQuantidadeNegativa() {
		assertThrows(ExcecaoEstoqueNegativo.class, () -> {produto.setQuantidade(-10);});
	}

	@Test
	void testPrecoNegativo() {
		float preco = produto.getPreco();
		produto.setPreco(-10);
		assertEquals(preco, produto.getPreco(), 0.01F);
	}

}
