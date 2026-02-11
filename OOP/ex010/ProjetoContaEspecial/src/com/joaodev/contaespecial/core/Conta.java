package com.joaodev.contaespecial.core;

public class Conta {

    protected String nomeTitular;
    protected String cpf;
    protected int numeroConta;
    protected double saldo;

    public Conta(){
    }

    public Conta(String nomeTitular, String cpf, int numeroConta, double saldo) {
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta [nomeTitular=" + this.nomeTitular + ", cpf=" + this.cpf + ", numeroConta=" + this.numeroConta + ", saldo="
                + this.saldo + "]";
    }

    public void creditar(double valor){
        this.saldo += valor;
    }
    
    public boolean debitar(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    
}
