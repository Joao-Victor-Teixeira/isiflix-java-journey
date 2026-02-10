package java_fundamentals.introductory_classes;

import java.util.Scanner;

public class TesteStatus {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o status do pedido");
        String status = sc.nextLine();

        switch(status){
            case "N":
            case "n":
            case "Novo":
                System.out.println("Status do pedido 12345: Novo");
                break;
            case "S":
            case "s":
            case "Separa":
                System.out.println("Status do pedido 12345: Em Separacao");
                break;  
            case "F":
            case "f":
            case "Finalizado": 
                System.out.println("Status do pedido 12345: Finalizado");
                break;                    
        }

        sc.close();
    }
}
