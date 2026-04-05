public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 4);
        Moto moto = new Moto("Honda", "CB500", 500);

        System.out.println("=== CARRO ===");
        carro.exibirInfo();

        System.out.println("\n=== MOTO ===");
        moto.exibirInfo();
    }
}
