package com.joaodev.acme.core;

public class Empreiteiro extends Funcionario {

    private float valorEmpreitada;

    public Empreiteiro(int numeroRegistro, String nomeFuncionario, float valorEmpreitada) {
        super(numeroRegistro, nomeFuncionario);
        this.valorEmpreitada = valorEmpreitada;
    }

    public float getValorEmpreitada() {
        return valorEmpreitada;
    }

    public void setValorEmpreitada(float valorEmpreitada) {
        this.valorEmpreitada = valorEmpreitada;
    }

    @Override
    public float calcularSalario() {
        return this.valorEmpreitada;
    }

}
