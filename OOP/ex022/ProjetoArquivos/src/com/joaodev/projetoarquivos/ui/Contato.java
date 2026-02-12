package com.joaodev.projetoarquivos.ui;

public class Contato {

    private String nome;
    private String email;
    private String zap;

    public Contato(String nome, String email, String zap) {
        this.nome = nome;
        this.email = email;
        this.zap = zap;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZap() {
        return zap;
    }

    public void setZap(String zap) {
        this.zap = zap;
    }

    @Override
    public String toString() {
        return nome + ";" + email + ";" + zap;
    }

}
