package br.pm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.pm.business.Data;

class DataTest {
	
	Data d;

	@BeforeEach
	void setUp() {
		d = new Data(1, 1, 2020);
	}
	
	@Test
	void testAdicionaDiasNoMes() {
		d.adicionaDias(15);
		assertEquals(16, d.getDia(), "Testa o ajuste do dia." );
		assertEquals(1, d.getMes(), "Testa o ajuste do m�s." );
		assertEquals(2020, d.getAno(), "Testa o ajuste do ano." );
	}

	@Test
	void testAdicionaDiasVirandoMes() {
		d.adicionaDias(35);
		assertEquals(5, d.getDia(), "Testa o ajuste do dia." );
		assertEquals(2, d.getMes(), "Testa o ajuste do m�s." );
		assertEquals(2020, d.getAno(), "Testa o ajuste do ano." );
	}

}
