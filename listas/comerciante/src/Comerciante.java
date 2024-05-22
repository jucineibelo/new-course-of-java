public class Comerciante {
    private String nome;
    private double precoCompra;
    private double precoVenda;

    public Comerciante() {
    }

    public Comerciante(String nome, double precoCompra, double precoVenda) {
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double lucro(){
        double formula = 0;
        formula = ((precoVenda - precoCompra) / precoCompra) * 100;
        return formula;
    }

    public String toString(){
        return "O produto: " + nome + " foi pago: " + precoCompra + " e vendido por: " + precoVenda + " dando um lucro de: " + lucro();
    }

}
