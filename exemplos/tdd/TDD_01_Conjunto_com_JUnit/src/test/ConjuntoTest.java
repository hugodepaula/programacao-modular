package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import app.Conjunto;

/**
 * Esse código foi atualizado para a JUnit 5.
 * Alguns comandos podem não funcionar adequadamente na JUnit 4.
 * 
 * @author Hugo
 *
 */
public class ConjuntoTest {

	@Test
	public void testConjuntoVazio() {
		Conjunto c = new Conjunto();
		assertEquals(0, c.getTamanho());
	}

	@Test
	public void textAdicionarUm() {
		Conjunto c = new Conjunto();
		c.adicionar(new Object());
		assertEquals(1, c.getTamanho());
	}

	@Test
	public void testAdicionarJaExistente() {
		Conjunto c = new Conjunto();
		Object o = new Object();
		c.adicionar(o);
		c.adicionar(o);
		assertEquals(1, c.getTamanho());
	}

	@Test
	public void testContem() {
		Conjunto c = new Conjunto();
		Object o = new Object();
		c.adicionar(o);
		assertTrue(c.contem(o));

	}
}
