public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(){}

    public Moto(String modelo, String marca, int cilindradas) {
        super(modelo, marca);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void exibirInfo(){
        super.exibirInfo();{
        System.out.println("Cilindradas: "+cilindradas);
        }
    }

}
