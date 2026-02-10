package java_fundamentals.introductory_classes;

import java.util.Scanner;

public class TesteVetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notas[]; // declara o vetor
        notas = new double[5];

        for(int pos = 0; pos < notas.length; pos ++){
            System.out.println("Digite a nota do aluno: " + pos);
            notas[pos] = sc. nextDouble();
        }
        for(int pos = 0; pos < notas.length; pos ++){
            System.out.printf("Nota do aluno %d = %.2f\n", pos, notas[pos]);
        }
        sc.close();
    }
}
