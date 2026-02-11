public class Moto  extends Veiculo{

    private int ciclindradas;

    public Moto(String marcaModelo, String ano, int ciclindradas) {
        super(marcaModelo, ano);
        this.ciclindradas = ciclindradas;
    }

    public int getCiclindradas() {
        return ciclindradas;
    }

    public void setCiclindradas(int ciclindradas) {
        this.ciclindradas = ciclindradas;
    }

    @Override
    public void acelerar() {
        System.out.println("Moto "+super.marcaModelo+" acelera na mão ! PROPROPROPROPROMMMMM");
        
    }

    @Override
    public void frear() {
        System.out.println("Moto "+super.marcaModelo+" freia no pé ! DEU RUIMMMMM");
        
    }
}
