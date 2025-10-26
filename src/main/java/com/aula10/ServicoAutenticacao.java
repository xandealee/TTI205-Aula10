package com.aula10;

public class ServicoAutenticacao {
    private final RepositoriosUsuarios repo;

    public ServicoAutenticacao(RepositoriosUsuarios repo) {
        this.repo = repo;
    }

    public boolean autenticar (String nome, String senha) {
        String senhaSalva = repo.buscarSenha(nome);
        return senhaSalva != null && senhaSalva.equals(senha);
    }
}
