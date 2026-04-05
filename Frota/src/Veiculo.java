public class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(){}

    public Veiculo(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void exibirInfo(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
    }
}
