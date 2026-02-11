public class Main {

    public static void main(String[] args) {
        
        Veiculo v = new Carro("Bmw X6", "2024", 5);
        v.acelerar();
        v.frear();

        Veiculo v2 = new Moto("CG", "1979", 125);
        v2.acelerar();
        v2.frear();
    }
}
