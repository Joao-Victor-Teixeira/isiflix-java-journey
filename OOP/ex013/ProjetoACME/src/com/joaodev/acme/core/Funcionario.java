package com.joaodev.acme.core;

public abstract class Funcionario {

    protected int numeroRegistro;
    protected String nomeFuncionario;
    public Funcionario(int numeroRegistro, String nomeFuncionario) {
        this.numeroRegistro = numeroRegistro;
        this.nomeFuncionario = nomeFuncionario;
    }

    //Classes filhas terão a dependencia de métodos abstratos 
    public abstract float calcularSalario();

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    
}
