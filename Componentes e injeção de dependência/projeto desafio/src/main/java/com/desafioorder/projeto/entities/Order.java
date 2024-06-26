package com.desafioorder.projeto.entities;

public class Order {
    private Integer codigo;
    private Double valorBasico;
    private Double desconto;

    public Order() {
    }

    public Order(Integer codigo, Double valorBasico, Double desconto) {
        this.codigo = codigo;
        this.valorBasico = valorBasico;
        this.desconto = desconto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getValorBasico() {
        return valorBasico;
    }

    public void setValorBasico(Double valorBasico) {
        this.valorBasico = valorBasico;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
}
