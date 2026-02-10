package beecrowd;

import java.util.Scanner;

public class BEE1064 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor,  media = 0;
        int numPos = 0;

        for (int cont = 1; cont <= 6; cont++) {
            valor = sc.nextDouble();
            if (valor > 0) {
                
                media = media + valor;
                numPos ++;  
            }            
        }
        System.out.println(numPos + " valores positivos");
        System.out.printf("%.1f\n", (media/numPos));
        sc.close();
    }
}
