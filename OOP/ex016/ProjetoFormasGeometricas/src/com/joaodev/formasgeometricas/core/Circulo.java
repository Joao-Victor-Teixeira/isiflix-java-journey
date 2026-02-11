package com.joaodev.formasgeometricas.core;

import com.joaodev.formasgeometricas.model.FormaGeometrica;
import com.joaodev.formasgeometricas.model.InterfaceForma2D;

public class Circulo extends FormaGeometrica implements InterfaceForma2D {
	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.pow(this.raio, 2) * Math.PI;
	}

	@Override
	public double calcularPerimetro() {	
		return 2 * Math.PI * this.raio;
	}

	@Override
	public String toString() {		
		return "Cirulo de Raio "+this.raio+" A: "+this.calcularArea()+" - P: "+this.calcularPerimetro();
	}
	

}
