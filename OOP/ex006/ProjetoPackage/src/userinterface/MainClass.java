package userinterface;

import core.Produto;

public class MainClass {
	public static void main(String[] args) {
		
		System.out.println("Testando Pacotes");
		Produto p = new Produto(1, "Computador", 2500);
		System.out.println(p.exibirInfo());
		
	}

}