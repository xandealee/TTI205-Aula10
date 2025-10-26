package com.aula10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ServicoAutenticacaoIT {
    @Test

    void autenticacaoCompleta() {
        RepositoriosUsuarios repo = new RepositoriosUsuarios();
        repo.salvar("Alice", "1234");
        ServicoAutenticacao servico = new ServicoAutenticacao(repo);

        assertTrue(servico.autenticar("Alice", "1234"));
        assertFalse(servico.autenticar("Alice", "0000"));
        assertFalse(servico.autenticar("Bob", "1234"));
    }
}

