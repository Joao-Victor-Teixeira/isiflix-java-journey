package com.joaodev.formasgeometricas.userinterface;

import com.joaodev.formasgeometricas.core.Circulo;
import com.joaodev.formasgeometricas.core.Cubo;
import com.joaodev.formasgeometricas.core.Paralelepipedo;
import com.joaodev.formasgeometricas.core.Quadrado;
import com.joaodev.formasgeometricas.model.FormaGeometrica;

public class MainApp {
	public static void main(String[] args) {
		FormaGeometrica formas[];
		formas = new FormaGeometrica[4];
		
		formas[0] = new Quadrado(3);
		formas[1] = new Circulo(2);
		formas[2] = new Paralelepipedo(3, 2, 5);
		formas[3] = new Cubo(4);
		
		for (FormaGeometrica f: formas) {
			System.out.println(f);
		}
	}

} 