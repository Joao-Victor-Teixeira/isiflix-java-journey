package com.joaodev.contaespecial.core;

public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(String nomeTitular, String cpf, int numeroConta, double saldo, double limite) {
        super(nomeTitular, cpf, numeroConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaEspecial [nomeTitular=" + super.nomeTitular + ", limite=" + this.limite + ", cpf=" + super.cpf
                + ", numeroConta="
                + super.numeroConta + ", saldo=" + super.saldo + "]";
    }

    @Override
    public boolean debitar(double valor) {
        if (super.saldo + this.limite >= valor) {
            super.saldo -= valor;
            return true;
        }
        return false;
    }
}
