
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

    }
}