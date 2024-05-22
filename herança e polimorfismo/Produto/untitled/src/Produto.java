public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double totalInStock(){
      return this.quantidade * this.preco;
    }

    public void addProducts(int quantidade){
        this.quantidade = this.quantidade + quantidade;
    }

    public void removeProducts(int quantidade){
        this.quantidade = this.quantidade - quantidade;
    }

    @Override
    public String toString() {
        return "Produto: \n"  +
                "Nome: " + nome + "\n" +
                "Preco: " + String.format("%.2f", preco) + "\n" +
                "Quantidade: " + quantidade;
    }
}
