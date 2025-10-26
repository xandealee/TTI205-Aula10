package com.aula10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorSenhaTeste {

    @Test
    void testValidarSenha() {
        ValidadorSenha val = new ValidadorSenha();
        assertTrue(val.validar("Senha123")); // válido: maiúscula + dígitos + >=8
        assertFalse(val.validar("senha123")); // sem maiúscula
        assertFalse(val.validar("SENHA"));   // sem dígitos e <8
        assertFalse(val.validar("123456"));  // sem letra maiúscula e <8
        assertFalse(val.validar(""));        // vazio -> inválido
    }
}
