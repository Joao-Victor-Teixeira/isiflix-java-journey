package com.joaodev.aulacollections.ui;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.joaodev.aulacollections.core.Produto;

public class MainClass {

    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<Produto>();

        lista.add(new Produto(1, "Computador", 1000));
        lista.add(new Produto(2, "Mouse", 50));
        lista.add(new Produto(3, "Teclado", 100));
        // lista.add(null); // Listas aceitam multiplas instancias e valores
        // NULL(VAZIOS)
        lista.add(new Produto(1, "Computador", 1000));
        lista.add(new Produto(2, "Mouse", 50));
        lista.add(new Produto(3, "Teclado", 100));

        System.out.println(lista);

        Set<Produto> conjunto = new HashSet<Produto>();
        conjunto.add(new Produto(1, "Computador", 1000));
        conjunto.add(new Produto(2, "Mouse", 50));
        conjunto.add(new Produto(3, "Teclado", 100));
        // conjunto.add(null); // Set aceita null 1 unica vez

        System.out.println(conjunto);

        Produto p1 = new Produto(10, "Mouse", 50);
        Produto p2 = new Produto(10, "Mouse", 50);

        System.out.println(p1.equals(p2));

        System.out.println("-------------------------------------------");
        lista.stream().forEach(p -> System.out.println(p));
        System.out.println("-------------------------------------------");

        conjunto.stream().forEach((p) -> {
            p.setPreco(p.getPreco() * 1.10);
            System.out.printf("%s R$%.2f\n",p.getDescricao(), p.getPreco());
        });

         conjunto.stream().sorted(Comparator.comparing((p) -> p.getPreco()))
         .forEach((p) -> System.out.println(p));

        List<Produto> novaLista = conjunto.stream()
                .sorted(Comparator.comparing((p) -> p.getPreco())).collect(Collectors.toList());

        System.out.println(novaLista);

        Produto maisCaro = lista.stream().max(Comparator.comparing(p -> p.getPreco())).orElse(lista.get(1));
        Produto maisBarato = lista.stream().min(Comparator.comparing(p -> p.getPreco())).orElse(lista.get(1));

        System.out.println("Produto mais caro" + maisCaro);
        System.out.println("Produto mais barato" + maisBarato);
    }
}
 