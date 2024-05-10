
public class Main {
    public static void main(String[] args) {
        ContaBancaria cliente = new ContaBancaria();
        cliente.cadastro("lucas", 500, "852369");
        cliente.deposito(200);
        cliente.saque(500);
    }
}