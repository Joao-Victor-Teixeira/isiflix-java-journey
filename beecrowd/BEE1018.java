package beecrowd;

import java.util.Scanner;

public class BEE1018 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int valor, q100, q50, q20, q10, q5, q2, q1;
        int resto;

        // entrada
        valor = sc.nextInt();
        
        // processamento

        q100 = valor /100;
        resto = valor % 100;

        q50 = resto / 50;
        resto = resto % 50;

        q20 = resto / 20;
        resto = resto % 20;

        q10 = resto / 10;
        resto = resto % 10;

        q5 = resto / 5;
        resto = resto % 5;

        q2 = resto / 2;
        q1 = resto % 2;

        // saida
        System.out.println(valor);
        System.err.println(q100 + " nota(s) de R$ 100,00");
        System.err.println(q50 + " nota(s) de R$ 50,00");
        System.err.println(q20 + " nota(s) de R$ 20,00");
        System.err.println(q10 + " nota(s) de R$ 10,00");
        System.err.println(q5 + " nota(s) de R$ 5,00");
        System.err.println(q2 + " nota(s) de R$ 2,00");
        System.err.println(q1 + " nota(s) de R$ 1,00");
        
        sc.close();
    }
}
