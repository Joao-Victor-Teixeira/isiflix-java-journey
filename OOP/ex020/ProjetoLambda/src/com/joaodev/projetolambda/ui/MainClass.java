package com.joaodev.projetolambda.ui;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.joaodev.projetolambda.core.Cliente;

public class MainClass {

    public static void main(String[] args) {
        
        ArrayList<Cliente> lista = new ArrayList<>();

        lista.add(new Cliente(1, "isidro", "isidro@.com", true));
        lista.add(new Cliente(2, "joao", "joao@.com", false));
        lista.add(new Cliente(3, "inae", "inae@.com", true));
        lista.add(new Cliente(4, "ana", "ana@.com", true));
        lista.add(new Cliente(5, "pedro", "pedro@.com", false));
        lista.add(new Cliente(6, "maria", "maria@.com", true));
        lista.add(new Cliente(7, "paulo", "paulo@.com", true));
        lista.add(new Cliente(8, "felipe", "felipe@.com", false));
        lista.add(new Cliente(9, "jose", "jose@.com", true));
        lista.add(new Cliente(10, "joana", "jose@.com", true));
        
        System.out.println("--- TUDÃO ---");

        lista.forEach(c -> System.out.println(c));

        System.out.println("--------------------------------------------");
        // apenas os ativos
       exibePorCriterio(lista, c -> c.isAtivo());
       System.out.println("---------------------------------------------");
       // nomes com mais de 4 letras
       exibePorCriterio(lista, c -> c.getNome().length() > 4);
       System.out.println("---------------------------------------------");
       // nomes que começão com a letra i
       exibePorCriterio(lista, c -> c.getNome().startsWith("i"));
    }

        public static void exibePorCriterio(ArrayList<Cliente> lista, Predicate<Cliente> predicate){

            lista.forEach(c ->{
                if(predicate.test(c)){
                    System.out.println(c);
                }
            });
        }
}
