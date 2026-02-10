package java_fundamentals.introductory_classes;

import java.util.Scanner;

public class TesteDoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero, resultado, cont;
        System.out.println("Digite um valor: ");
        numero = sc.nextInt();

        cont = 1;
        do {
            resultado = numero * cont;
            System.out.println(numero + " x " + cont + " = " + resultado);
            cont++;
        } while (cont <= 10);

        sc.close();
    }
}
