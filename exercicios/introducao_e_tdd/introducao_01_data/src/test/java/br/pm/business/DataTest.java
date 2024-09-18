package br.pm.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class DataTest {
	
	public static Data data;

	@BeforeEach
	void setUp() {
		data = new Data(1, 1, 2020);
	}
	
	@Test
	void testAdicionaDiasNoMes() {
		data.adicionaDias(15);
		assertEquals(16, data.getDia(), "Testa o ajuste do dia." );
		assertEquals(1, data.getMes(), "Testa o ajuste do mês." );
		assertEquals(2020, data.getAno(), "Testa o ajuste do ano." );
	}

	@Test
	void testAdicionaDiasVirandoMes() {
		data.adicionaDias(35);
		assertEquals(5, data.getDia(), "Testa o ajuste do dia." );
		assertEquals(2, data.getMes(), "Testa o ajuste do mês." );
		assertEquals(2020, data.getAno(), "Testa o ajuste do ano." );
	}

    @Test
    void testAnoBisexto() {
        data.setAno(2001);
        assertFalse(data.anoBisexto(), "Testa 2001 não é ano bisexto.");
        data.setAno(2004);
        assertTrue(data.anoBisexto(), "Testa 2004 é ano bisexto múltiplo de 4.");
        data.setAno(2100);
        assertFalse(data.anoBisexto(), "Testa 2100 não é ano bisexto múltiplo de 100.");
        data.setAno(2400);
        assertTrue(data.anoBisexto(), "Testa 2400 é ano bisexto múltiplo de 400.");
    }

    @Test
    void testDiaDaSemana() {
        assertEquals("Quarta-feira", data.diaDaSemana());
    }

    @Test
    void testPorExtenso() {
        assertEquals("1 de janeiro de 2020", data.porExtenso());
    }

    @Test
    void testSetAno() {
        data.setAno(2050);
        assertEquals(2050, data.getAno(), "Alterando para ano 2050.");
        data.setMes(13);
        assertEquals(2050, data.getAno(), "Alterando para mês 1500.");
    }

    @Test
    void testSetDia() {
        data.setDia(3);
        assertEquals(3, data.getDia(), "Alterando para dia 3.");
        data.setDia(33);
        assertEquals(3, data.getDia(), "Alterando para dia 33.");
        data.setDia(-3);
        assertEquals(3, data.getDia(), "Alterando para dia -3.");
    }

    @Test
    void testSetMes() {
        data.setMes(3);
        assertEquals(3, data.getMes(), "Alterando para mês 3.");
        data.setMes(13);
        assertEquals(3, data.getMes(), "Alterando para mês 13.");
        data.setMes(-3);
        assertEquals(3, data.getMes(), "Alterando para mês -3.");
    }


}
