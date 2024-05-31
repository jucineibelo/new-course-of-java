package entities;

public class Product implements Comparable<Product> {
    private Integer codigo;
    private String nome;
    private Double quantidade;

    public Product() {

    }

    public Product(Integer codigo, String nome, Double quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return nome.toUpperCase().compareTo(o.getNome().toUpperCase());
    }
}