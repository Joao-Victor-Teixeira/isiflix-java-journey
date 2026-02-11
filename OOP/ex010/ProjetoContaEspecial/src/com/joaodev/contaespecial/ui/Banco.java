package com.joaodev.contaespecial.ui;

import com.joaodev.contaespecial.core.Conta;
import com.joaodev.contaespecial.core.ContaEspecial;

public class Banco {

    public static void main(String[] args) {
        
        Conta c = new Conta("Joao", "0000001", 777, 100.0);

        System.out.println(c);

        ContaEspecial e = new ContaEspecial("Jose", "00000002", 8888, 100, 1000);

        System.out.println(e);

        if (c.debitar(300)) {
            System.out.println("Debito efetuado");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        System.out.println(c);

        System.out.println("-------------------------------------------------------");

        if (e.debitar(300)) {
            System.out.println("Debito efetuado");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        System.out.println(e);
    }
}
