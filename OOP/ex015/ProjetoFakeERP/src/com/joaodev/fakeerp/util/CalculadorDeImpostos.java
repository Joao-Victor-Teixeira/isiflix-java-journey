package com.joaodev.fakeerp.util;

public class CalculadorDeImpostos implements InterfaceOracleERP, InterfaceSAP, MSInterface {

    // Aqui temos as regas de negocio
    public void calcularImpostos(String documentoFiscal) {
        System.out.println("Processando arquivo...");
		System.out.println("calculando imposto do documento "+documentoFiscal);
		System.out.println("Gravando em BD");
		System.out.println("Emitindo guias");
		System.out.println("----> FIM");
    }

    @Override
    public void summarizeBill(String doc) {
        // chamar o meu método de negocio
        this.calcularImpostos(doc);
    }

    @Override
    public void calculateTaxesAndSumarizeBill(String doc) {
        // chamar o meu método de negocio
        this.calcularImpostos(doc);
    }

    @Override
    public void calculateTaxes(String doc) {
        // chamar o meu método de negocio
        this.calcularImpostos(doc);
    }
}
