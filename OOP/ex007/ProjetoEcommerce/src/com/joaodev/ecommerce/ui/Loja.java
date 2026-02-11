package com.joaodev.ecommerce.ui;

import com.joaodev.ecommerce.core.Pedido;
import com.joaodev.ecommerce.core.Status;

public class Loja {
	public static void main(String[] args) {
		
		Pedido p = new Pedido(1234,"10/02/2026", 1500.0, "João", Status.NOVO);
		
		System.out.println(p.exibir());
		
		p.setStatus(Status.FINALIZADO);
		
		System.out.println(p.exibir());
	}

}
