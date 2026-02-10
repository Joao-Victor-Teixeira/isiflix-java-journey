package java_fundamentals.introductory_classes;

import java.util.Scanner;

public class TesteIf {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double n1, n2, me;
        System.out.println("Digite a nota 1: ");
        n1 = sc.nextDouble();
        System.out.println("Digite a nota 2: ");
        n2 = sc.nextDouble();

        me = (n1 + n2) / 2;

        System.out.println("Sua média vale " + me);

        if (me >= 6) {
            System.out.println("Parabéns!! Aprovado!");
        }
        

        sc.close();
    }
}
