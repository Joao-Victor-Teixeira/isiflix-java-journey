package java_fundamentals.introductory_classes;

import java.util.Scanner;

public class TesteForEach {

    public static void main(String args[]) {
        int vetor[] = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) { // temos mais controles exemplo se quisermos apenas os pares
            System.out.println("Digite = ");
            vetor[i] = sc.nextInt();
        }

        for (int elemento : vetor) { // vai da primeira a ultima posição sempre
            System.out.println("Elemento do vetor =" + elemento);
        }

        sc.close();
    }
}
