package br.pm.business;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PessoaTest {
    @Test
    void testValidarCPF() {
        assertTrue(Pessoa.validarCPF("999.228.590-76"));
        assertFalse(Pessoa.validarCPF("999.228.590-77"));
    }
}
