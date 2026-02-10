package java_fundamentals.introductory_classes;

public class TestArgs {

    public static void main(String[] args) {
        
        System.out.println("Numero de elemntos passados na linha de comando");
        System.out.println(args.length);

        for(int pos = 0; pos < args.length; pos++){
            System.out.println("Elemento = " + args[pos]);
        }
    }
}
