package beecrowd;

import java.util.Scanner;

public class BEE1070 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();

        if (x % 2 == 0) {
            x++;
        }
           for(int cont = 1; cont <= 6; cont++){
            System.out.println(x);
            x += 2;
        }

        sc.close();
    }
}
