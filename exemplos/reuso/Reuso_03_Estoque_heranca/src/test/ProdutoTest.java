package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import business.Produto;

class ProdutoTest {

	Produto produto;
	
	@BeforeEach
	void setUp() throws Exception {
		produto = new Produto("Nome", 1.0F, 1, LocalDateTime.now());
	}

	@Test
	void testQuantidadeNegativa() {
		int quantidade = produto.getQuantidade();
		produto.setQuantidade(-10);
		assertEquals(quantidade, produto.getQuantidade());
	}

	@Test
	void testPrecoNegativo() {
		float preco = produto.getPreco();
		produto.setPreco(-10);
		assertEquals(preco, produto.getPreco(), 0.001F);
	}

}
