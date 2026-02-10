package java_fundamentals.introductory_classes;

import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
       
        /* 
        int a;
        float b;
        double c;

        System.out.println("Por favor, digite um numero inteiro: ");
        a = sc.nextInt();
        System.out.println("Você digitou o valo " + a);

        System.out.println("Por favor digite um número float: ");
        b = sc.nextFloat();
        System.out.println("Você digitou o valor " + b);
        

        System.out.println("Digite um número double: ");
        c= sc.nextDouble();
        System.out.printf("Você digitou o valor %.3f\n", c);
        */

        String nome ;
        int condigo;
        double salario;

        System.out.println("Digte seu codigo: ");
        condigo = Integer.parseInt(sc.nextLine());

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite seu salario: ");
        salario = Double.parseDouble(sc.nextLine());
        System.out.println("Seu codigo, nome e salario : " + condigo + " - " + nome + " - " + salario);

        sc.close();
    }

}
