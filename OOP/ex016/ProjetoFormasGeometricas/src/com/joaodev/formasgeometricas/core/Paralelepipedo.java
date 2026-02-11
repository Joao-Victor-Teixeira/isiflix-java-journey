package com.joaodev.formasgeometricas.core;

import com.joaodev.formasgeometricas.model.FormaGeometrica;
import com.joaodev.formasgeometricas.model.InterfaceForma3D;

public class Paralelepipedo extends FormaGeometrica implements InterfaceForma3D {
    private double altura;
    private double largura;
    private double profundidade;

    public Paralelepipedo(double altura, double largura, double profundidade) {
        super();
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    @Override
    public double calcularVolume() {
        return this.altura * this.largura * this.profundidade;
    }

    @Override
    public String toString() {
        return "Paralelepipedo de medidas (a/l/p) " + this.altura + "/" + this.largura + "/" + this.profundidade
                + " V: " + this.calcularVolume();
    }

}
