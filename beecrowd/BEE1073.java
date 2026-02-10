package beecrowd;

import java.util.Scanner;

public class BEE1073 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int  n;

        n = sc.nextInt();

        if (n % 2 != 0) {
            n -= 1;
        }
        for(int cont = 2; cont <= n; cont+=2){
            if (n % 2 == 0) {
                System.out.println(cont+"^2 = " + (cont*cont));
            }
        }

        sc.close();
    }
}
