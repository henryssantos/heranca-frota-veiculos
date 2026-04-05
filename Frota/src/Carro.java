public class Carro extends Veiculo{
    private int numPortas;

    public Carro(String modelo, String marca, int numPortas) {
        super(modelo, marca);
        this.numPortas = numPortas;
    }

   public Carro(){}

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Numero de portas: "+numPortas);
    }
}
