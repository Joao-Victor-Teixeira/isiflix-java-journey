package java_fundamentals.introductory_classes;

import java.util.Scanner;

public class TesteFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero, resultado;
        System.out.println("Digite um valor");
        numero = sc.nextInt();

        for (int cont = 1; cont <= 10; cont++) {
            resultado = numero * cont;
            System.out.println(numero + " x " + cont + " = " + resultado);
        }

        sc.close();
    }
}
