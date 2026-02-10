package beecrowd;

import java.util.Scanner;

public class BEE1038V2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double preco = 0.0;

        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        switch(codigo){
            case 1:
                preco = quantidade * 4.00;
                break;
            case 2:
                preco = quantidade * 4.50; 
                break;
            case 3:
                preco = quantidade  * 5.00;
                break;
            case 4:
                preco = quantidade * 2.00;
                break;
            case 5:
                preco = quantidade * 1.50;
                break;          
        }

        System.out.printf("Total: R$ %.2f\n" , preco);
        
        sc.close();
    }
}
