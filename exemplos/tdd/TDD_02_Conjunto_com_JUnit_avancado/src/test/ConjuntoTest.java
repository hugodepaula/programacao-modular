package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import app.Conjunto;

class ConjuntoTest {
	public static Conjunto c;

	@BeforeEach
	void setUp() throws Exception {
		c = new Conjunto();
	}

	@Test
	public void testConjuntoVazio() {
		assertEquals(0, c.getTamanho());
	}

	@Test
	public void textAdicionarUm() {
		c.adicionar(new Object());
		assertEquals(1, c.getTamanho());
	}

	@Test
	public void testAdicionarJaExistente() {
		int t = c.getTamanho();
		Object o = new Object();
		c.adicionar(o);
		c.adicionar(o);
		assertEquals(t + 1, c.getTamanho(), "adic. Object 2 vezes");
	}

	@Test
	@DisplayName("Testando o método contém.")
	public void testContem() {
		Object o = new Object();
		c.adicionar(o);
		assertTrue(c.contem(o));

	}

}
