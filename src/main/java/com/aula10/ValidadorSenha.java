package com.aula10;

public class ValidadorSenha {
    public boolean validar(String senha) {
        if (senha == null) return false;
        if (senha.length() < 8) return false;
        if (!senha.matches(".*[A-Z].*")) return false;
        if (!senha.matches(".*[0-9].*")) return false;
        return true;
    }
}