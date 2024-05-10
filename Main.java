
public class Main {
    public static void main(String[] args) {
        ContaBancaria cliente = new ContaBancaria();
        cliente.cadastro("lucas", 500, "852369");
        cliente.deposito(200);
        cliente.saque(500);
        System.out.println("\n");
        Triangulo retangulo = new Triangulo();
        System.out.println("Area: " + retangulo.area(2, 3));
        System.out.println("Area: " + retangulo.perimetro(2, 3));
        System.out.println("\n");
        Produto leite = new Produto();
        Produto arroz = new Produto();
        leite.cadastro("Leite", 10.9, 5);
        arroz.cadastro("Arroz", 6, 10);
        leite.aumentarStoq(10);
        leite.diminuirStoq(15);
        arroz.aumentarStoq(10);
        arroz.diminuirStoq(5);
        leite.sobreProduto();
        arroz.sobreProduto();
    }
}