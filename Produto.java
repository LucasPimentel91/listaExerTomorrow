public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;

    public void cadastro(String texto, double valor, int quantidade){
        this.nome = texto;
        this.preco = valor;
        this.qtdEstoque= quantidade;
    }
    public void diminuirStoq(int num){
        qtdEstoque-=num;
    }
    public void aumentarStoq(int num){
        qtdEstoque+=num;
    }
    public void sobreProduto(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + qtdEstoque);
    }

}
