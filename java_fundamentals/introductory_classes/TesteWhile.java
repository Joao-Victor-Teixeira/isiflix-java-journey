package java_fundamentals.introductory_classes;

import java.util.Scanner;

public class TesteWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero, resultado, cont;
        System.out.println("Digite um valor: ");
        numero = sc.nextInt();

        cont = 1;
        while (cont <= 10) {
            resultado = numero * cont;
            System.out.println(numero + " x " + cont + " = " + resultado);
            cont++;
        }
        sc.close();
    }
}
