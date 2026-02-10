package beecrowd;

import java.util.Scanner;

public class BEE1001 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int A, B, X;

        //entrada 
        A = sc.nextInt();
        B = sc.nextInt();
        
        //processamento
        X = A + B;

        //saída
        System.out.println("X = " + X);
        sc.close();
    }
}
