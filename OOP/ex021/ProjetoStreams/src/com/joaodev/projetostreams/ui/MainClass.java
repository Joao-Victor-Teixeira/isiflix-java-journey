package com.joaodev.projetostreams.ui;

import java.util.ArrayList;

import com.joaodev.projetostreams.core.Produto;

public class MainClass {

    public static void main(String[] args) {

        ArrayList<Produto> lista = new ArrayList<>();

        lista.add(new Produto(1, "Computador", 2000, 5));
        lista.add(new Produto(2, "Teclado", 100, 10));
        lista.add(new Produto(1, "Mouse", 35, 20));
        lista.add(new Produto(1, "Impressora", 400, 8));

        lista.stream().filter(p -> p.getPreco() <= 100)
                .forEach(p -> System.out.println(p));

        int estoque;
        estoque = lista.stream().map(p -> p.getQtd())
                .reduce(0, (q1, q2) -> q1 + q2);
        System.out.println("Estoque = " + estoque);

        double patrimonio;
        patrimonio = lista.stream().map(p -> p.getQtd() * p.getPreco())
                .reduce(0.0, (p1, p2) -> p1 + p2);
        System.out.println(patrimonio);
    }
}
