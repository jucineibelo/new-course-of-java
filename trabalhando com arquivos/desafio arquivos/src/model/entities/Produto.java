package model.entities;

public class Produto {
    private String name;
    private Double price;
    private Integer quantity;

    public Produto() {

    }

    public Produto(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double total() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return name + ", " + price;
    }

}
