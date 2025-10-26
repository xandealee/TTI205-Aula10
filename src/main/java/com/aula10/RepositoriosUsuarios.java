package com.aula10; 
import java.util.HashMap;
import java.util.Map;

public class RepositoriosUsuarios {
    private Map<String, String> usuarios = new HashMap<>();

    public void salvar(String nome, String senha) {
        usuarios.put(nome, senha);
    }

    public String buscarSenha(String nome) {
        return usuarios.get(nome);
    }   
}