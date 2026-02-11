package com.joaodev.formasgeometricas.core;

import com.joaodev.formasgeometricas.model.FormaGeometrica;
import com.joaodev.formasgeometricas.model.InterfaceForma2D;
import com.joaodev.formasgeometricas.model.InterfaceForma3D;

public class Cubo extends FormaGeometrica implements InterfaceForma2D, InterfaceForma3D{
	private double lado;

	public Cubo(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double calcularVolume() {
		return Math.pow(this.lado, 3);
	}

	@Override
	public double calcularArea() {
		return Math.pow(this.lado, 2);
	}

	@Override
	public double calcularPerimetro() {
		return this.lado * 4;
	}

	@Override
	public String toString() {
		return "Cubo de lado "+this.lado+" A: "+this.calcularArea()+ " - P: "+this.calcularPerimetro()+" - V: "+this.calcularVolume();
	}
	
}
