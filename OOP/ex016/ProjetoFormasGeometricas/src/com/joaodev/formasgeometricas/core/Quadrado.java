package com.joaodev.formasgeometricas.core;

import com.joaodev.formasgeometricas.model.FormaGeometrica;
import com.joaodev.formasgeometricas.model.InterfaceForma2D;

public class Quadrado extends FormaGeometrica implements InterfaceForma2D {
	private double lado;

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}

	@Override
	public double calcularPerimetro() {		
		return this.lado * 4;
	}

	@Override
	public String toString() {
		return "Quadrado de lado "+this.lado+" A: "+this.calcularArea()+" - P: "+this.calcularPerimetro();
	}
	

}
