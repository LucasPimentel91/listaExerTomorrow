public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta;

    public void cadastro(String nome, double saldo, String numeroConta){
        this.titular = nome;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public void saque(double valor){
        if(saldo < valor){
            System.out.println("Saldo: " + saldo);
            System.out.println("Saldo insuficiente");
        }
        saldo -= valor;
        System.out.println("Valor resgatado e saldo atualizado");
        System.out.println("Saldo atual: " + saldo);
    }

    public void deposito(double valor){
        saldo += valor;
        System.out.println("Deposito realizado! Saldo atual: " + saldo);
    }
}
