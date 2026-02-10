package beecrowd;

import java.util.Scanner;

public class BEE1006 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double A , B, C, Media;
        // entrada 
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        //processamento
        Media = (A * 2 + B * 3 + C *5)/ 10.0;
        //saida
        System.out.printf("MEDIA = %.1f\n", Media);
        sc.close();
    }
}
